public class exercicioLivros {
    public static void main(String[] args) {
        Biblioteca livraria3 = new Biblioteca("Janerio");

        Livro livro1 = new Livro("KAFKA", "HARUKI");
        Livro livro2 = new Livro("carneiros", "Haruki");

        livraria3.adicionarLivro(livro1);
        livraria3.adicionarLivro(livro2);

        livraria3.exibirDetalhes();

    }    
}

class Livro {
    public String titulo;
    public String autor;

    public Livro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getNomeAutor(){
        return this.autor;
    }

}


class Biblioteca{
    public String nomeBiblioteca;
    public Livro[] titulos;
    public int numLivro;

    public Biblioteca (String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
        this.titulos = new Livro[2];
        this.numLivro = 0;
    }

    public String getNomeBiblioteca(){
        return this.nomeBiblioteca;
    }

    public void adicionarLivro(Livro livro){
        titulos[numLivro] = livro;
        numLivro ++;
    }

    public void exibirDetalhes(){
        System.out.println("Biblioteca - " + this.getNomeBiblioteca());
        
        for(int i = 0; i < numLivro; i++){
            System.out.println("Livro : " + titulos[i].getTitulo());
            System.out.println("Autor: " + titulos[i].getNomeAutor());

        }
    }

}
