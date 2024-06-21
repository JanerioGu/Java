import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Estacionamento {

    Map<String, LocalTime> estacionamento = new TreeMap<>();

    public static void main(String[] args) {
        Estacionamento est = new Estacionamento();
        Scanner input = new Scanner(System.in);

        boolean executando = true;

        while (executando) {
            System.out.println("[1] Entrada de veículo");
            System.out.println("[2] Saída de veículo");
            System.out.println("[3] Listagem de veículos");
            System.out.println("[4] Sair");

            System.out.println("Escolha uma opção: ");
            int opcao = input.nextInt();
            input.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    est.entradaVeiculo(input);
                    break;
                case 2:
                    est.saidaVeiculo(input);
                    break;
                case 3:
                    est.listagemVeiculo();
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado por usar nosso sistema!");
                    executando = false;
                    break;
                default:
                    System.out.println("Insira uma das opções válidas");
                    break;
            }
        }
        input.close();
    }

    public void entradaVeiculo(Scanner input) {
        if (estacionamento.size() == 10) {
            System.out.println("Estacionamento cheio");
            return;
        }

        System.out.println("Insira a placa do veículo: ");
        String placa = input.nextLine();

        System.out.println("Insira a hora da entrada do veículo (HH:mm): ");
        String horaString = input.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.parse(horaString, formato);

        estacionamento.put(placa, hora);

        System.out.println("Veículo cadastrado com sucesso");
        System.out.println("Vagas disponíveis: " + (10 - estacionamento.size()) + "\n");
    }

    public void saidaVeiculo(Scanner input) {
        System.out.println("Insira a placa do veículo que quer remover: ");
        String placa = input.nextLine();

        if (!estacionamento.containsKey(placa)) {
            System.out.println("Veículo não encontrado");
            return;
        }

        LocalTime horaEntrada = estacionamento.get(placa);

        System.out.println("Insira a hora de saída do veículo (HH:mm): ");
        String horaString = input.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaSaida = LocalTime.parse(horaString, formato);

        Duration duracao = Duration.between(horaEntrada, horaSaida);
        long minutos = duracao.toMinutes();

        estacionamento.remove(placa);

        double valor = totalPagar(minutos);

        System.out.println("Veículo removido com sucesso");
        System.out.println("Tempo de permanência: " + minutos + " minutos");
        System.out.println("Valor a pagar: R$ " + valor);
    }

    public void listagemVeiculo() {
        if (estacionamento.size() == 0) {
            System.out.println("Estacionamento vazio!\n");
            return;
        }

        System.out.println("\nPlaca               Entrada");
        System.out.println("-------------------------------");
        for (Map.Entry<String, LocalTime> entry : estacionamento.entrySet()) {
            System.out.printf("%-15s %15s\n", entry.getKey(), entry.getValue().toString());
        }
        System.out.println("-------------------------------");
        System.out.println("Vagas disponíveis: " + (10 - estacionamento.size()) + "\n");
    }

    public static double totalPagar(long minutos) {
        double valor = 5;

        if (minutos > 60) {
            minutos -= 60;
            valor += (minutos / 15) * 2;
            if (minutos % 15 > 0) {
                valor += 2;
            }
        }

        return valor;
    }
}
