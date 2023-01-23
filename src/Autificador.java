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
                System.out.println("Enhorabuena");
                break;
            }if (i == 3) {
                System.out.println("usted no se sabe su contraseña");   
            } 
            else{
                System.out.println("tiene otro intento, este es su intento numero "+i);
            }
        }

    
    }
}
