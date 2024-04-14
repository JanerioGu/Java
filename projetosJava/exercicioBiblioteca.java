public class exercicioBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("Janerio");

        Livro livro1 = new Livro("JANERIO", 1997, "Janerio");
        Livro livro2 = new Livro("Erycka", 1999, "Erycka");
        biblioteca1.adicionarLivro(livro1);
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.imprimirDetalhes();
    }
}

class Biblioteca{
    public String nome;
    public Livro[] livros;
    public int numLivro;

    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new Livro[3];
        this.numLivro = 0;
    }

    public void adicionarLivro(Livro livro){
        livros[numLivro] = livro;
        numLivro ++;
    }


    public void imprimirDetalhes(){
        System.out.println("Biblioteca : " + this.nome);
        for(int i = 0; i < numLivro; i++){
            System.out.println("Livro: " + livros[i].getLivros());
            System.out.println("Ano lacamento: " + livros[i].getAnoLancamento());
            System.out.println("Autor: " + livros[i].getAutor());
        }
    }
}

class Livro{
    public String livros;
    public int anoLancamento;
    public String autor;

    public Livro(String livro, int anoLancamento, String autor){
        this.livros = livro;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    int getAnoLancamento(){
        return this.anoLancamento;
    }

    String getAutor(){
        return this.autor;
    }

    String getLivros(){
        return this.livros;
    }
}