/**
 * Pessoa
 */
public class Pessoa {

    public String nome;
    public int idade;
    public int documento;

    public Pessoa(String nome, int idade, int documento){
        this.nome = nome;
        this.idade = idade;
        this.documento = documento;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade : " + this.idade);
        System.out.println("Documento : " + this.documento);
    }
}