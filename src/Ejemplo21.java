import java.util.Scanner;

public class Ejemplo21 {
    public static void main(String[] args) {
        int año;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cualquier año: ");
        año = sc.nextInt();

        if (año % 400 == 0){
        System.out.println("El año es bisiesto.");
        } else if (año % 4 == 0 && año % 100 != 0) {
            System.out.println("El año es bisiesto");
        }else System.out.println("El año no es bisiesto.");
    }
}
