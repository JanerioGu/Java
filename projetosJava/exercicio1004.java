
public class exercicio1004 {
    public static void main(String[]args){
        Funcionario funcionario1 = new Funcionario("Joao", "Dev");
        Funcionario funcionario2 = new Funcionario("Maria", "Gerente");
        Funcionario funcionario3 = new Funcionario("Pedro", "Mecanico");
        Funcionario funcionario4 = new Funcionario("Ana", "Aprendiz");

        Departamento departamento1 = new Departamento("Ti");
        departamento1.adicionarFuncionario(funcionario1);
        departamento1.adicionarFuncionario(funcionario2);

        Departamento departamento2 = new Departamento("Rh");
        departamento2.adicionarFuncionario(funcionario3);
        departamento2.adicionarFuncionario(funcionario4);

        Empresa empresa = new Empresa("Up");
        empresa.adicionarDepartamento(departamento1);
        empresa.adicionarDepartamento(departamento2);

        empresa.mostrarInformacoes();

    }
}


class Funcionario{
    public String nome;
    public String cargo;

    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome){
        return this.nome;
    }

    public String getCargo(){
        return this.cargo;
    }
    public String setCargo(String cargo){
        return this.cargo;
    }


}

class Departamento{
    private String nome;
    private Funcionario[] funcionarios;
    private int numFuncionarios;

    public Departamento(String nome){
        this.nome = nome;
        this.funcionarios = new Funcionario[10];
        this.numFuncionarios = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios[numFuncionarios] = funcionario;
        numFuncionarios++;
    }

    public void mostrarInformacoes(){
        System.out.println("Departamento: " + this.nome);

        for(int i = 0; i < numFuncionarios; i++){
            System.out.println("Nome : " + funcionarios[i].getNome()+ "\n" + "Cargo: " + funcionarios[i].getCargo() + "\n");
        }
    }
}
    class Empresa{
        private String nome;
        private Departamento[] departamentos;
        private int numDepartamento;

        public Empresa(String nome){
            this.nome = nome;
            this.departamentos = new Departamento[10];
            this.numDepartamento = 0;
        }

        public void adicionarDepartamento(Departamento departamento){
            departamentos[numDepartamento] = departamento;
            numDepartamento ++;
        }

        public void mostrarInformacoes(){
            System.out.println("Empresa : " + this.nome);
            for(int i = 0; i< numDepartamento; i++){
                departamentos[i].mostrarInformacoes();
            }
        }

}