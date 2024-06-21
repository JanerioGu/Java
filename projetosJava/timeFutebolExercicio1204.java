/**
 * timeFutebolExercicio1204
 */
public class timeFutebolExercicio1204 {

    public static void main (String[] args){
        Time time1 = new Time("Barcelona");
        Jogador jogador1 = new Jogador("Juliano", "Atacante");
        Jogador jogador2 = new Jogador("Janerio", "Meio - campo");

        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);

        time1.exibirDetalhes();
    }
}

class Time{
    public String nomeTime;
    public Jogador[] jogadores;
    public int numJogador;

    public Time(String nomeTime){
        this.nomeTime = nomeTime;
        this.jogadores = new Jogador[2];
        this.numJogador = 0;
    }

    public String GetNomeTime(){
        return this.nomeTime;
    }

    public void adicionarJogador(Jogador jogador){
        jogadores[numJogador] = jogador;
        numJogador ++;
    }

    public void exibirDetalhes(){
        System.out.println("Time -  " + this.GetNomeTime());
        for(int i = 0; i < numJogador; i++){
            System.out.println("Jogador : " + jogadores[i].getJogador());
            System.out.println("Posicao jogador: " + jogadores[i].getPosicao());
        }
    }
}

class Jogador{
    public String jogadores;
    public String posicaoJogador;

    public Jogador(String jogador, String posicaoJogador){
        this.jogadores = jogador;
        this.posicaoJogador = posicaoJogador;
    }

    public String getJogador(){
        return this.jogadores;
    }

    public String getPosicao(){
        return this.posicaoJogador;
    }
}