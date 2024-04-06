
public class exercicio0504 {

    public static void main(String[] args){
        Cliente cliente1= new Cliente("Janerio", "janerio32@hotmail.com", "Rua joao carlos 171");
        Pedido pedido1 = new Pedido(10, 120, cliente1);
        pedido1.imprimirDetalhes();

        Cliente cliente2 = new Cliente("Gabi", "gabi123@hotmail.com", "Rua das gabis 121");
        Pedido pedido2 = new Pedido(12, 121, cliente2);
        pedido2.imprimirDetalhes();

        Cliente cliente3 = new Cliente("Joao", "joazinho@gmail.com", "Rua dos joaos 134");
        Pedido pedido3 = new Pedido(13, 155, cliente3);
        pedido3.imprimirDetalhes();

    }  
}

class Cliente{
    public String nome;
    public String email;
    public String endereco;

    public Cliente(String nome, String email, String endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

public String getNome(){
    return this.nome;
}

public String getEmail(){
    return this.email;
}

public String getEndereco(){
    return this.endereco;
}
}

class Pedido{
    public int numeroPedido;
    public double valorTotal;
    public Cliente cliente; /*Trazendo pra cá a possibilidade de visualizar a classe cliente "Referenciando a classe cliente" */

    public Pedido(int numeroPedido, double valorTotal, Cliente cliente){
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public void imprimirDetalhes(){
        System.out.println("Numero do pedido: " + numeroPedido);
        System.out.println("Total do pedido:  " + valorTotal);
        System.out.println("Cliente: " + cliente.getNome()); /*Trouxe o numero do cliente da classe cliente para ddentro da classe pedido */
        System.out.println("Email : " + cliente.getEmail());
        System.out.println("Endereco : " + cliente.getEndereco() + "\n");
    }

}




/* Class primeiro, construtor e depois Get setters 
 * public static void main(String[] args) principal.
 * 
*/
