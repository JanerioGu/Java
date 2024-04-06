public class exercicioLivroAutor{

    public static void main(String[] args) {
        Autor nome1 = new Autor("Machado de assis", "Brasileira");
        Livro livro1 = new Livro("Dom Casmurro", 1899, nome1);

        livro1.imprimirDetalhes();

    }
}

class Autor{
    public String nome;
    public String nacionalidade;

    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

}

class Livro{
    public String titulo;
    public int anoPublicacao;
    public Autor autor;


    public Livro (String titulo, int anoPublicacao, Autor autor){
    this.titulo = titulo;
    this.anoPublicacao = anoPublicacao;
    this.autor = autor;
    }

    public void imprimirDetalhes(){
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Ano publicacao: " + anoPublicacao);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Nacionalidade : " + autor.getNacionalidade());
    }
}

