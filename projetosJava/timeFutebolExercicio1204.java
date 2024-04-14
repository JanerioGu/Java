public class timeFutebolExercicio1204 {
    public static void main(String[] args) {
        Time time1 = new Time("Barcelona");
        Jogador jogador1 = new Jogador("Neymar", "Atacante");
        Jogador jogador2 = new Jogador("Vini JR", "Ponta");
        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);
        time1.imprimirDetalhes();

    }
}

class Time{
    public String nome;
    public Jogador[] jogadores;
    public int numJogadores;

    public Time (String time){
        this.nome = time;
        this.jogadores = new Jogador[3];
        this.numJogadores = 0;
    }

    public void adicionarJogador(Jogador jogador){
        jogadores[numJogadores] = jogador;
        numJogadores++;
    }

    public String getNome(){
        return this.nome;
    }

    public void imprimirDetalhes(){
        System.out.println("Time : " + this.nome);
        for(int i = 0; i < numJogadores; i++){
            
            System.out.println("Jogador :" + jogadores[i].getJogadores() + "  Posição : " + jogadores[i].getPosicaoJogador());
        }
    }
}

class Jogador{
    public String jogadores;
    public String posicaoJogador;
    int numJogadores;

    public Jogador (String jogadores, String posicaoJogador){
        this.jogadores = jogadores;
        this.posicaoJogador = posicaoJogador;
        this.numJogadores = 0;
    }

    public String getJogadores(){
        return this.jogadores;
    }

    public String getPosicaoJogador(){
        return this.posicaoJogador;
    }
 }
