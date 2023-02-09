import java.util.Scanner;

public class AutificatorPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = input.nextLine();

        if(password.length() == 8){
            System.out.println("tu contraseña cumple los requisitos");
        }else{
            System.out.println("La contraseña no cumple los requisitos");
        }
    }
}
