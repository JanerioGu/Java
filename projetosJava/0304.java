import java.io.Console;
import java.util.Scanner;

class exemplo1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Contato [] contatos = new Contato[5];
        
        int numContatos = 0;
        
        boolean encontrado = true;

        boolean executando = false;

        while (executando == false) {

            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Buscar contato");
            System.out.println("[3] Editar contato");
            System.out.println("[4] Listar contato");
            System.out.println("[5] Sair");

            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.next();

                    System.out.print("Telefone: ");
                    String telefone = input.next();
                    
                    contatos[numContatos] = new Contato(nome, telefone);
                    numContatos ++;
                    break;
                
                case 2:
                    System.out.print("Digite o nome a ser buscado: ");
                    String nomeBusca = input.next();
                    encontrado = false;
                    
                    for(int i =0; i < numContatos; i ++){
                        if(contatos[i].getNome().equalsIgnoreCase(nomeBusca)){
                            System.out.println("Telefone de " + nomeBusca + ":" + contatos[i].getTelefone());
                            encontrado = true;
                            break;
                        }
                        }
                        if(encontrado == false){
                            System.out.println("Nome nao encontrado!");
                        }
                            break;

                case 3:
                    System.out.print("Digite o nome a ser editado: ");
                    String nomeEditado = input.next();
                    
                    for(int i =0; i < numContatos; i ++){
                        if(contatos[i].getNome().equalsIgnoreCase(nomeEditado)){
                            System.out.print("Insira o novo telefone: ");
                            String novoTelefone = input.next();
                            contatos[i].setTelefone(novoTelefone);
                            encontrado = true;
                            System.out.println("Contato atualizado com sucesso!");
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Nome nao encontrado!");
                    }
                    break;1
                    
                    
                case 4:
                    System.out.print("Contato no sistema: \n");
                    for(int i = 0; i < numContatos; i++){
                        System.out.println("Nome: " + contatos[i].getNome() + "\nTelefone: " + contatos[i].getTelefone());
                    }
                    break;
                    
                case 5:
                    System.out.println("Programa encerrado");
                    executando = true;
                    break;
            
                default:
                System.out.println(" \n opccao invalida");
                    break;
            }
            
        }
    }
}

class Contato{
    public String nome;
    public String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
