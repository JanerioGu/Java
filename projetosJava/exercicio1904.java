import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class exercicio1904 {
    public static void main(String[] args) {
        List <String> frutas = new ArrayList<>();

        frutas.add("banana");
        frutas.add("Kiwi");
        frutas.add("Morango");
        frutas.add("Abacaxi");

        System.out.println("Frutas da lista: " + frutas);

        /*System.out.println("Frutas da lista: ");
        for(String elemento : frutas){
            System.out.println(elemento);
        }*/

        System.out.println("Tamanho da lista : " + frutas.size());

        Collections.sort(frutas);
        System.out.println("Ordem crescente da lista : " + frutas);

        Collections.sort(frutas, Collections.reverseOrder());
        System.out.println("Ordem decrescente da lista : " + frutas);

        frutas.remove("Morango");
        System.out.println("Ordem decrescente da lista : " + frutas);

        /*if(frutas.contains("Frutaaa")){
            System.out.println("Frutaaa existe na lista");
        }
        else{
            System.out.println("Frutaaa não existe na lista");
        }*/

        for(String elemento : frutas){
            if(elemento.equalsIgnoreCase("banana")){
                System.out.println("Banana esta na lista");
            }
        }
    }
}
