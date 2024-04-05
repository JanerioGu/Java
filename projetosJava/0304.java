import java.util.Scanner;

class exemplo1{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Contato [] contato = new Contato[5];
        
        int numContato = 0;
        
        boolean encontrado;

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
                    contato[numContato] = new Contato("Marcelo", "1111 - 1111");
                    numContato ++;
                    
                    contato[numContato] = new Contato("Janerio", "1111 - 1111");
                    numContato ++;
                    break;
                
                case 2:
                    encontrado = false;
                    String nome = "Janerio";
                    
                    for(int i =0; i < numContato; i ++){
                        if(contato[i].getNome().equalsIgnoreCase(nome)){
                            System.out.println("Telefone de " + nome + ":" + contato[i].getTelefone());
                            encontrado = true;
                            break;
                        }
                    }
                    if(encontrado == false){
                        System.out.println("Nome nao encontrado");
                    }
                    break;

                case 3:
                    String nomeBusca = "Janerio";
                    encontrado = false;
                    
                    for(int i =0; i < numContato; i ++){
                        if(contato[i].getNome().equalsIgnoreCase(nomeBusca)){
                            
                            contato[i].setTelefone("7777-7777");
                            
                            encontrado = true;
                            break;
                            
                        }
                    }
                    if(encontrado == false){
                        System.out.println("Nome nao encontrado");
                    }
                    break;
                    
                    case 4:
                    
                case 5:
                    
                    
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
