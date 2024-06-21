import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Estacionamento {

    Map<String, LocalTime> estacionamento = new TreeMap<>();

    public static void main(String[] args) {
        Estacionamento est = new Estacionamento();
        Scanner input = new Scanner(System.in);

        boolean executando = true;

        while (executando) {
            System.out.println("[1] Entrada de veiculo");
            System.out.println("[2] Saida de veiculo");
            System.out.println("[3] Listagem de veiculos");
            System.out.println("[4] Sair");

            System.out.println("Escolha uma opção!");
            int opcao = input.nextInt();
            input.nextLine();

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
                    System.out.println("Obrigado por usar nosso sistema");
                    executando = false;
                    break;
                default:
                    System.out.println("Insira uma das opções válidas");
                    break;
            }
        }
    }

    public void entradaVeiculo(Scanner input) {
        if (estacionamento.size() == 10) {
            System.out.println("Estacionamento cheio");
            return;
        }

        System.out.println("Insira a placa do veiculo: ");
        String placa = input.nextLine();

        System.out.println("Insira a hora da entrada do veiculo (hh:mm): ");
        String horaString = input.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.parse(horaString, formato);

        estacionamento.put(placa, hora);

        System.out.println("Veiculo cadastrado com sucesso");
        System.out.println("Vagas disponíveis: " + (10 - estacionamento.size()) + "\n");
    }

    public void saidaVeiculo(Scanner input) {
        // Implementar a lógica de saída de veículo
    }

    public void listagemVeiculo() {
        // Implementar a lógica de listagem de veículos
    }
}
