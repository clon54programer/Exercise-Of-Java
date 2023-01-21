public class App {
    //que practico aqui resolvi el problema de como hacer que muestre los numero del 1 al al 100(con un bucle while)
    public static void main(String[] args) throws Exception {
        int i = 1;
        boolean main = true;
        

        /**
         *  @param bucle es el encargado sde sumar su valor de  par cumplir la condicion 
         */
        while (main) {
            int bucle = 1;
            bucle = 1 + ++i;// aui esto para el valor se sume a bucle

            System.out.println(bucle);
            if(bucle == 100){
                System.out.println("termino el bucle de java");
                break;
            }
        }
    }
}