import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        System.out.println("Dime 1 número: ");
        num1 = sc.nextInt();
        System.out.println("Dime otro número: ");
        num2 = sc.nextInt();
        System.out.println("Dime que operacion quieres usar: + , - , / , *: ");
        String operacion = sc.next();

        if (operacion.equals("+")) {
            resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operacion.equals("-")) {
            resultado = num1 - num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operacion.equals("*")) {
            resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
        } else if (operacion.equals("/")) {
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);}
        }
}
