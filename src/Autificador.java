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

        //autificador pero while

        System.out.println("coloque si, si se va logiar");
        String option = input.nextLine();

        while(option == "si"){
            int a = 1;

            String password = input.nextLine();

            //la logica
            if(password.equals(Contrasena)){
                System.out.println("Enhorabuena, se a logiado");
                break;
            }if (a == 3) {
                System.out.println("Usted no se sabe la contraseña");
            } else {
                System.out.println("tiene otro intento, es es un intento numero "+a);
            }



            a++;
        }

    
    }
}
