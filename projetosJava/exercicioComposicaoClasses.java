public class exercicioComposicaoClasses {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Nootebok", 1290.00);
        Produto produto2 = new Produto("Televisao", 1390.00);
        Produto produto3 = new Produto("Microondas", 459.00);

        Secao secao1 = new Secao("Eletrodomesticos");
        secao1.adicionarProduto(produto1);
        secao1.adicionarProduto(produto2);
        secao1.adicionarProduto(produto3);
        
        Loja loja = new Loja("Janerio store");
        loja.AdicionarSecoes(secao1);

        loja.imprimirDetalhes();
    }
}


class Loja{
    public String nome;
    public Secao[] secoes;
    int numSecoes;

    public Loja(String nome){

        this.nome = nome;
        this.secoes = new Secao[5];
        this.numSecoes = 0;

    }

public void AdicionarSecoes(Secao secao){
    secoes[numSecoes] = secao;
    numSecoes ++;
}
public void imprimirDetalhes(){
    System.out.println("Loja: " + this.getNome());
    for(int i = 0; i < numSecoes; i++){
        secoes[i].imprimirDetalhes();
    }
}

    public String getNome(){
        return this.nome;
    }
    public int getNumSecoes(){
        return this.numSecoes;
    }

}

class Secao{
    private String nome;
    private Produto[] produtos;
    private int numProdutos;

    public Secao(String nome){
        this.nome = nome;
        this.produtos = new Produto[5];
        this.numProdutos = 0;
    }

    public void adicionarProduto(Produto produto){
        produtos[numProdutos] = produto;
        numProdutos ++;
    }
    public void imprimirDetalhes(){
        System.out.println("Secao : " + this.getNome());
        for(int i = 0; i < numProdutos; i++){
            produtos[i].imprimirDetalhes();
        }
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumProdutos(){
        return this.numProdutos;
    }

}

class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome){
       return this.nome; 
    }

    public double getPreco(){
        return this.preco;
    }
    public double setPreco(double preco){
        return this.preco;
    } 

    public void imprimirDetalhes(){
        System.out.println("Produto: " + getNome());
        System.out.println("Preco: " + String.format("%.2f", getPreco()));
    }
}
