import java.util.Scanner;

public class activity_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        
        System.out.println("intente romper este bucle");
        do {
            
            System.out.println("deme un numero por favor");
            number = input.nextInt();;

        } while (number >= 0);
        System.out.println("termino el bucle");
    }
}
