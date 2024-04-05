class Banco{
    public int numeroConta;
    private String tipoConta;
    protected String titularConta;
    protected double saldo;
    protected boolean status;

public Banco(int numeroConta, String tipoConta, String titularConta){
    this.setNumeroConta(numeroConta);
    this.setTipoConta(tipoConta);
    this.setTitularConta(titularConta);
    this.setSaldo(saldo);
    this.setStatus(status);
}

public void setNumeroConta(int numeroConta){
    this.numeroConta = numeroConta;
}

public double getNumeroConta(){
    return this.numeroConta;
}

public void setTipoConta(String tipoConta){
    this.tipoConta = tipoConta;
}
public String getTipoConta(){
    return this.tipoConta;
}

public void setTitularConta (String titularConta){
    this.titularConta = titularConta;
}
public String getTitularConta(){
    return this.titularConta;
}

public void setSaldo(double saldo){
    this.saldo = saldo;
}
public double getSaldo(){
    return this.saldo;
}

public void getStatus(boolean status){
    this.status = status;
}
public boolean setStatus(boolean status){
    return this.status;
}

public void status(){
    System.out.println("Conta : " + this.getNumeroConta());
    System.out.println("Tipo Conta" + this.getTipoConta());
    System.out.println("Titular da conta : " + this.getTitularConta());
    System.out.println("Saldo : " + this.getSaldo());
    System.out.println("Status : " + this.getStatus());
}



    public void abrirConta(int numConta, String tipoConta, String titularConta){
        this.setStatus(true);
        this.setNumeroConta(numConta);
        this.setTipoConta(tipoConta);
        this.setTitularConta(titularConta);
            if(tipoConta.equals("CC")){
                this.saldo = 50.0;
            }else if(tipoConta.equals("CP")){
                this.saldo = 150.0;
            }else{
                System.out.println("Tipo de conta incorreto.");
            }
            System.out.println("Conta aberta com sucesso!");
            
        }

    public void fecharConta(){
        if(this.status == false){
            System.out.println("Nao eh possivel fechar uma conta q nao existe");
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
                System.out.println("Nao eh possivel fechar uma conta com saldo.");
            }
        }
            System.out.println("Conta fechada!");
        }
        
        
    
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Foi adicionado: " + valor + " no seu saldo");
        System.out.println("Conta numero: " + this.getNumeroConta());
        System.out.println("Titular da conta :" + this.getTitularConta());
        System.out.println("Seu saldo atual eh: " + this.getSaldo());
    }

    public void sacar(double valor){
            if (this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso");
            } else{
            System.out.println("Saldo insuficiente para efutar o saque");
            }
        System.out.println("Foi sacado" + valor + "do seu saldo");
        System.out.println("Conta numero: " + this.getNumeroConta());
        System.out.println("Titular da conta :" + this.getTitularConta());
        System.out.println("Seu saldo atual eh: " + this.getSaldo());
    }



}
class Conta{
    public static void main (String [] args){
        Banco c1 = new Banco(2000, "CC", "Joao");
        c1.abrirConta(2000, "CC", "joao");
        c1.depositar(1000);

        Banco c2 = new Banco(2001, "CC", "Juliano");
        c2.abrirConta(2001, "CC", "Juliano");
        c2.depositar(1000);
    }
}