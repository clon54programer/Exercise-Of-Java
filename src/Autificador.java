import java.util.Scanner;

public class Autificador {
    public static void main(String[] args) {
        //aqui creare un programa que pida una contaseña y tienes tres intentos

        Scanner input = new Scanner(System.in);
        final String Contrasena = "12345";

        for(int i = 1; i <= 3;i++){
            
            System.out.println("por favor cual es su contraseña");
            String Password = input.nextLine();

            if(Password.equals(Contrasena)){
                // eguals es metodo si ve si otro objeto es igual al otro
                System.out.println("Enhorabuena");
                break;
            }if (i == 3) {
                System.out.println("usted no se sabe su contraseña");   
            } 
            else{
                System.out.println("tiene otro intento, este es su intento numero "+i);
            }
        }
        //ahora con while 

        int a = 1;
        boolean master = true;
        System.out.println("por favor coloque otra vez la contraseña");

        while(master){
            String Password = input.nextLine();

            if(Password.equals(Contrasena)){
                // eguals es metodo si ve si otro objeto es igual al otro
                System.out.println("Enhorabuena");
                break;
            }if (a == 3) {
                System.out.println("usted no se sabe su contraseña");   
            } 
            else{
                System.out.println("tiene otro intento, este es su intento numero "+a);
            }
            a++;
        }
        //ahora con do while
        String password;
        int b = 1;
        do {
             System.out.println("deme la contraseña");
            password = input.nextLine();
            //logica
            if(password.equals(Contrasena)){
                break;
            }

            if(b == 3){
                System.out.println("Usted no se sabe la contraseña");
                break;
            }else{
                System.out.println("tiene otro intento, este es su intento numero "+b);
            }


            b++;
        } while (password.equals(Contrasena));
        System.out.println("Enhorabuena");
    }
}
