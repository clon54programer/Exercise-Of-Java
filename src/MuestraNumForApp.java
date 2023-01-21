public class MuestraNumForApp {
    /**
     * @category es para practicar 
     * @param residuo 1 es el encargado de ver si un numero es divisible por 2
     * @param residuo2 es el el encargado de ver si un numero es divisible por 3
     * {@value} si un umero es divisible por 2 o 3  
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        //primerea con for 
        
        System.out.println("este con el bucle for");
        for(int i = 0; i <= 100; i++){
            int residuo1 = (i%2);
            int residuo2 = (i%3);

            //la logica dsel progrma
            if(residuo1 == 0){
                System.out.println(i+" es divisble por 2 ");
            }if (residuo2 == 0) {
                System.out.println(i+" es divisible por 3");
            }
        }

        // segunda con while
        System.out.println("este con el bucle while");
        int a = 1;
        while (a <= 100) {
            //varibles
            int residuo3 = (a%2);
            int residuo4 = (a%2);

            //logica del bucle
            if(residuo3 == 0){
                System.out.println(a+" es divisble por 2 ");
            }if (residuo4 == 0) {
                System.out.println(a+" es divisible por 3");
            }

            a++;
        }

    }
}
