import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2404 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Fruta> frutas = new ArrayList<>();

        System.out.println("Deseja cadastrar uma fruta? Digite 'sim' para adicionar e qualquer outra tecla para encerrar.");
        String condicao = input.nextLine();

        while (condicao.equals("sim")) {
            System.out.println("Digite o nome da fruta que deseja cadastrar:");
            String nome = input.nextLine();

            System.out.println("Digite o preço da fruta:");
            String preco = input.nextLine();

            System.out.println("Digite o peso da fruta:");
            String peso = input.nextLine();

            Fruta novaFruta = new Fruta(nome, preco, peso);
            frutas.add(novaFruta);

            System.out.println("Deseja cadastrar outra fruta? (sim/não)");
            condicao = input.nextLine();
        }

        input.close();

        for (Fruta fruta : frutas) {
            fruta.mostrarInfo();
        }
    }
}

class Fruta{
    private String nome;
    private String preco;
    private String peso;

    public Fruta(String nome, String preco, String peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Peso: " + peso);
        System.out.println();
    }
}