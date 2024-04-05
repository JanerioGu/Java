class Banco {
    public int numeroConta;
    private String tipoConta;
    protected String titularConta;
    protected double saldo;
    protected boolean status;

    public Banco(int numeroConta, String tipoConta, String titularConta){
        this.setNumeroConta(numeroConta);
        this.setTipoConta(tipoConta);
        this.setTitularConta(titularConta);
        if(tipoConta.equals("CC")){
            this.saldo = 50.0;
        } else if(tipoConta.equals("CP")){
            this.saldo = 150.0;
        } else{
            System.out.println("Tipo de conta incorreto.");
        }
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso!");
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

    public void setTitularConta(String titularConta){
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

    public void setStatus(boolean status){
        this.status = status;
    }
    
    public boolean getStatus(){
        return this.status;
    }

    public void abrirConta(int numConta, String tipoConta, String titularConta){
        this.setStatus(true);
        this.setNumeroConta(numConta);
        this.setTipoConta(tipoConta);
        this.setTitularConta(titularConta);
        if(tipoConta.equals("CC")){
            this.saldo = 50.0;
        } else if(tipoConta.equals("CP")){
            this.saldo = 150.0;
        } else{
            System.out.println("Tipo de conta incorreto.");
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.status == false){
            System.out.println("Não é possível fechar uma conta que não existe");
        } else{
            if(this.saldo == 0){
                this.status = false;
                this.numeroConta = 0;
                this.tipoConta = null;
                this.titularConta = null;
                System.out.println("Conta fechada com sucesso");
            } else{
                System.out.println("Não é possível fechar uma conta com saldo.");
            }
        }
        System.out.println("Conta fechada!");
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Foi adicionado: " + valor + " no seu saldo");
        System.out.println("Conta numero: " + this.getNumeroConta());
        System.out.println("Titular da conta: " + this.getTitularConta());
        System.out.println("Seu saldo atual é: " + this.getSaldo());
    }

    public void sacar(double valor){
        if (this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso");
        } else{
            System.out.println("Saldo insuficiente para efetuar o saque");
        }
        System.out.println("Foi sacado " + valor + " do seu saldo");
        System.out.println("Conta numero: " + this.getNumeroConta());
        System.out.println("Titular da conta: " + this.getTitularConta());
        System.out.println("Seu saldo atual é: " + this.getSaldo());
    }

    public void pagarMensalidade(){
        if(this.status == true){
            if(this.tipoConta.equals("CC")){
                if(this.getSaldo() >= 12){
                    this.saldo -= 12;
                    System.out.println("Mensalidade paga!");
                    System.out.println("Nº conta: " + this.numeroConta);
                    System.out.println("Titular: " + this.titularConta);
                    System.out.println("Saldo atual: " + this.saldo);
                } else{
                    System.out.println("Saldo insuficiente para pagar a mensalidade...");
                }
            } else if(this.tipoConta.equals("CP")){
                if(this.getSaldo() >= 20){
                    this.saldo -= 20;
                    System.out.println("Mensalidade paga!");
                    System.out.println("Nº conta: " + this.numeroConta);
                    System.out.println("Titular: " + this.titularConta);
                    System.out.println("Saldo atual: " + this.saldo);
                } else{
                    System.out.println("Saldo insuficiente para pagar a mensalidade...");
                }
            } else{
                System.out.println("Tipo de conta errado!");
            }
        } else{
            System.out.println("Você precisa criar uma conta primeiro!");
        }
    }
}

class Conta {
    public static void main (String [] args){
        Banco c1 = new Banco(1, "CC", "Erycka");
        /*c1.depositar(100);*/
        /*c1.pagarMensalidade();*/
        /*c1.sacar(50);*/
        /*c1.fecharConta();*/
    }
}
