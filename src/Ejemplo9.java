import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int edad;
        System.out.println("¿Cual es tu edad?: ");
        edad = sc1.nextInt();

        if (edad >= 18){
            System.out.println("Eres mayor de edad.");
        }else{
            System.out.println("Eres menor de edad.");
        }
    }
}
