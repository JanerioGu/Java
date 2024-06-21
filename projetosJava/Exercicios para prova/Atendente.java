public class Atendente extends Pessoa{
    public String tempoTrab;
    
    public Atendente(String tempoTrab){
        super("Juliano", 25, 1234567);
        this.tempoTrab = tempoTrab;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Tempo de trabalho como atendente : " + this.tempoTrab);
    }

}
