import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;


/* Crie uma calculadora simples de financiamento que calcula o valor total a ser pago com base no valor financiado, na taxa de juros mensal e no número de parcelas. A calculadora deve calcular também o valor de cada parcela.

Regras de negócio:

- O valor total a ser pago é calculado através da seguinte fórmula: valor financiado + (valor financiado x taxa de juros x número de parcelas).

- O valor de cada parcela é calculado através da seguinte fórmula: valor total / número de parcelas.

- Os valores informados (valor financiado, taxa de juros mensal e número de parcelas) devem ser positivos.

- O programa deve apresentar ao usuário o valor financiado, o valor dos juros, o valor total, a quantidade de parcelas e o valor de cada parcela.*/


class Calculadora{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Insira o valor que você deseja simular o financiamento: ");
            double vlrFinan = input.nextDouble();

            System.out.println("Insira a quantiade de parcelas: ");
            int qtdParcela = input.nextInt();

            System.out.println("Insira a taxa de juros desejada: ");
            double taxaJuro = input.nextDouble();

            System.out.println("Deseja juros composto (1) ou juros simples (2)");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                        System.out.println("você escolheu juros composto. Segue tabela:");

                    break;
                
                case 2:
                        System.out.println("voce escolheu juro simples. Segue tabela");
            
                default:
                    break;
            }

            try{
                CalculadoraJuros c1 = new CalculadoraJuros(vlrFinan, taxaJuro, qtdParcela);
                c1.simulacao();
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
            }

            input.close();
    }


}

class CalculadoraJuros{

    public double vlrFinan;
    public double taxaJuro;
    public int qtdParcela;

    /*Os valores informados (valor financiado, taxa de juros mensal e número de parcelas) devem ser positivos. */

    public CalculadoraJuros(double vlrFinan, double taxaJuro, int qtdParcela){
        
        if (vlrFinan < 0 || taxaJuro < 0 || qtdParcela <0) {
            throw new RuntimeException("O valor financiado, taxa de juros e/ou numero de parcelas devem ser maior que 0");
        }

        this.vlrFinan = vlrFinan;
        this.taxaJuro = taxaJuro / 100;
        this.qtdParcela = qtdParcela;
    }
        public void simulacao(){
            double vlrTotal = vlrFinan + (vlrFinan * taxaJuro * qtdParcela);

            double vlrParcela = vlrTotal/qtdParcela;

            System.out.println("Valor financiado: " + "R$"+ vlrFinan);
            System.out.println("Valor dos juros: " + taxaJuro +"%");
            System.out.println("O valor total é: " + "R$"+vlrTotal);
            System.out.println("A quantidade de parcelas serão: " + qtdParcela);
            System.out.println("O valor de cada parcela é: " + "R$"+vlrParcela);
        }
}