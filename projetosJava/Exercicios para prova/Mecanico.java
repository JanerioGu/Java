public class Mecanico extends Pessoa {
    public int tempoExperiencia;
    public String especialidade;

    public Mecanico(int tempoExperiencia, String especialidade){
        super("Janério", 25, 123456789);
        this.tempoExperiencia = tempoExperiencia;
        this.especialidade = especialidade;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Tempo experiencia: " + this.tempoExperiencia);
        System.out.println("Especialidade : " + this.especialidade);
    }
}
