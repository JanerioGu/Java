import java.util.Scanner;
 
class exemplo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Contato[] contato = new Contato[10];
        
        int numContatos = 0;
        
        String nomeBusca;
       
        boolean encontrado, executando = true;
        
        while(executando){
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Buscar contato");
            System.out.println("[3] Editar contato");
            System.out.println("[4] Excluir contato");
            System.out.println("[5] Listar contatos");
            System.out.println("[6] Sair");
            int opcao = input.nextInt();
            
            /* Limpa o buffer do teclado */
            input.nextLine();
            
            switch(opcao){
                 /* Adicionar contato */
                case 1:
                    
                    if(numContatos == 10){
                        System.out.println("A agenda esta cheia!\n");
                        break;
                    }
                    
                    System.out.print("Informe nome: ");
                    String nome = input.nextLine();
                    
                    System.out.print("Informe telefone: ");
                    String telefone = input.nextLine();
                    
                    contato[numContatos] = new Contato(nome, telefone);
                    numContatos++;
                    
                    System.out.println("Contato cadastrado com sucesso!\n");
                    
                    break;
                
                 /* Buscar contato */    
                case 2:
                    
                    if(numContatos == 0){
                        System.out.println("A agenda esta vazia!\n");
                        break;
                    }
                    
                    System.out.print("Informe nome para busca: ");
                    nomeBusca = input.nextLine();
                    
                    encontrado = false;
                    
                    for(int i = 0; i < numContatos; i++){
                        if(contato[i].getNome().equalsIgnoreCase(nomeBusca)){
                            
                            encontrado = true;
                            
                            System.out.println("Telefone de " + nomeBusca + ": " + contato[i].getTelefone() + "\n");
                            
                            break;
                        }
                    }
                    
                    if(encontrado == false){
                        System.out.println("Nome nao encontrado!\n");
                    }
                    
                    break;
                
                /* Editar contato */
                case 3:
                    
                    if(numContatos == 0){
                        System.out.println("A agenda esta vazia!\n");
                        break;
                    }
                    
                    System.out.print("Informe nome para busca: ");
                    nomeBusca = input.nextLine();
 
 
                    encontrado = false;
                    
                    for(int i = 0; i < numContatos; i++){
                        if(contato[i].getNome().equalsIgnoreCase(nomeBusca)){
                            
                            encontrado = true;
                            
                            System.out.print("Informe novo telefone: ");
                            String novoTelefone = input.nextLine();
                            
                            contato[i].setTelefone(novoTelefone);
                            
                            System.out.println("Telefone atualizado com sucesso!\n");
                            
                            break;
                        }
                    }
                    
                    if(encontrado == false){
                        System.out.println("Nome nao encontrado!\n");
                    }
                    
                    break;
                
                /* Excluir contato */
                case 4:
                    
                    if(numContatos == 0){
                        System.out.println("A agenda esta vazia!\n");
                        break;
                    }
                    
                    System.out.print("Informe nome para busca: ");
                    nomeBusca = input.nextLine();
 
 
                    encontrado = false;
                    
                    for(int i = 0; i < numContatos; i++){
                        if(contato[i].getNome().equalsIgnoreCase(nomeBusca)){
                            
                            encontrado = true;
                            
                            for(int j = i; j < numContatos - 1; j++){
                                contato[j].setNome(contato[j + 1].getNome());
                                contato[j].setTelefone(contato[j + 1].getTelefone());
                            }
                            System.out.println("Contato excluido com sucesso!\n");
                            
                            numContatos--;
                            
                            break;
                        }
                    }
                    
                    if(encontrado == false){
                        System.out.println("Nome nao encontrado!\n");
                    }
                    
                    break;
                
                /* Listar contatos */
                case 5:
                    
                    if(numContatos == 0){
                        System.out.println("A agenda esta vazia!\n");
                        break;
                    }
                    
                    for(int i = 0; i < numContatos; i++){
                        System.out.println("Contato: " + (i + 1));
                        System.out.println("Nome: " + contato[i].getNome());
                        System.out.println("Telefone: " + contato[i].getTelefone() +"\n");
                    }
                    
                    break;
                
                /* Sair */   
                case 6:
                    executando = false;
                    break;
                
                default:
                    System.out.println("Opcao invalida!\n");
            }
        }
        
        input.close();
    }
}
 
class Contato{
    public String nome;
    public String telefone;
    
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
}