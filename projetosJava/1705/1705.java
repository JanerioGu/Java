class exemplo{
    public static void main(String[] args) {
            int numeros[] = {10,20,30,100};
            int pesos[] = {2, 3, 4};
            
            System.out.println("Resultado : ");

            Matematica matematica = new Matematica();
            
            for(int i= 0; i < 4; i++){
                try{
                    Matematica.dividir(numeros[i], pesos[i]);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }       
        }
} 

    class Matematica{
        public static void dividir(int num1, int num2){
            System.out.printf("%d / %d = %d \n", num1 , num2 , num1 / num2);
        }
    }
