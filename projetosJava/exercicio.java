class ContaBancaria {
    public int numeroConta;
    protected String tipoConta;
    private String titularConta;
    private double saldo = 0;
    private boolean status = false;

    public void abrirConta(int numero, String tipo, String nome){
        if(this.status == true){
            System.out.println("Conta já está aberta, não é possivel abrir a mesma co nta 2 vezes");
        }
        else{
            this.status = true;
            this.tipoConta = tipo;
            this.numeroConta = numero;
            this.titularConta = nome;
            if(tipoConta.equals("CC")){
                this.saldo = 50.00;
                System.out.println("Conta criada e adicionado R$50,00");
            }
            else if (tipoConta.equals("CP")) {
                this.saldo = 150.00;
                System.out.println("Conta criada e adicionado R$150,00");
            }
            else{
                System.out.println("Conta não foi criada pois o tipo de conta é inexistente");
            }
        }

    }
    public void fecharConta(){
        if(this.status == false){
            System.out.println("Nao é possivel fechar uma conta que não está aberta");
        }
        else{
            if(this.saldo == 0){
                this.status = false;
                this.numeroConta = 0;
                this.tipoConta = null;
                this.titularConta = null;
                System.out.println("Conta fechada com sucesso");
            }
            else{
                System.out.println("Não é possivel fechar a conta pois possui saldo ainda");
            }
        }
    }
    public void depositar(double valor){
        if(this.status == true){
            this.saldo += valor;
            System.out.println("Foi adicionado R$" + valor + " a sua conta");
            System.out.println("N conta: " + this.numeroConta);
            System.out.println("Titular: " + this.titularConta);
            System.out.println("Saldo atual: " + this.saldo);
        }
        else{
            System.out.println("Você precisa primeiro criar uma conta!");
        }
    }
    public void sacar(double valor){
        if(this.status == true){
            if(this.saldo >= valor){
                this.saldo -= valor;
                System.out.println("Foi retirado R$" + valor + " da sua conta");
                System.out.println("N conta: " + this.numeroConta);
                System.out.println("Titular: " + this.titularConta);
                System.out.println("Saldo atual: " + this.saldo);
            }
            else{
                System.out.println("Não foi possivel sacar, pois não há saldo.");
            }
        }
        else{
            System.out.println("Você precisa primeiro criar uma conta!");
        }
    }
    public void pagarMensalidade(){
        if(this.status == true){
            if(this.tipoConta.equals("CC")){
                if(this.saldo >= 12){
                    this.saldo -= 12;
                    System.out.println("Mensalidade paga!");
                    System.out.println("N conta: " + this.numeroConta);
                    System.out.println("Titular: " + this.titularConta);
                    System.out.println("Saldo atual: " + this.saldo);
                }
                else{
                    System.out.println("Saldo insuficiente para pagar mensalidade...");
                }
            }
            else if(this.tipoConta.equals("STR")){
                if(this.saldo >= 20){
                    this.saldo -= 20;
                    System.out.println("Mensalidade paga!");
                    System.out.println("N conta: " + this.numeroConta);
                    System.out.println("Titular: " + this.titularConta);
                    System.out.println("Saldo atual: " + this.saldo);
                }
                else{
                    System.out.println("Saldo insuficiente para pagar mensalidade...");
                }
            }
            else{
                System.out.println("Tipo de conta errado!");
            }
        }
        else{
            System.out.println("Você precisa criar uma conta primeiro!");
        }
    }
}

public class exercicio {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.fecharConta();
        c1.depositar(100);
        c1.sacar(100);
        c1.pagarMensalidade();
        c1.abrirConta(27062002, "CC", "João");
        c1.depositar(100);
        c1.sacar(50);
        c1.pagarMensalidade();
        c1.fecharConta();
        c1.sacar(88);
        c1.fecharConta();
    }
}
