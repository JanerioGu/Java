import javax.sound.midi.Soundbank;

public class Program {
    public static void main(String[] args) {
        System.out.println("Informações do MECANICO: ");
        Pessoa p1 = new Mecanico(10, "elétrica");
        p1.exibirInfo();

        System.out.println("Informações do ATENDENTE: ");
        Pessoa p2 = new Atendente("20 anos");
        p2.exibirInfo();

    }
}
