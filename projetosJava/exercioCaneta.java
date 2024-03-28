class Exemplo {
    public static void main(String[] args) {
        Caneta c2 = new Caneta("Faber Castel", "Preta");
        c2.status();
        c2.tampar();
    }
}

class Caneta {
    public String modelo;
    public String cor;
    public double carga = 1;
    public boolean tampada;
    public boolean escrever;

    public Caneta(String modelo, String cor) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setCarga(1);
        this.setTampada(true);
        this.setEscrever(false);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return this.carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setEscrever(boolean escrever) {
        this.escrever = escrever;
    }

    public boolean getEscrever() {
        return this.escrever;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Tampada: " + this.getTampada());
        System.out.println("Escrevendo: " + this.getEscrever());
        System.out.println();
    }

    public void tampar() {
        if (getTampada()) {
            System.out.println("A caneta já está tampada!");
        } else {
            this.tampada = true;
            System.out.println("A caneta foi tampada!");
        }
    }

    public void destampar() {
        if (!getTampada()) {
            System.out.println("A caneta já está destampada!");
        } else {
            this.tampada = false;
            System.out.println("A caneta foi destampada!");
        }
    }
}
