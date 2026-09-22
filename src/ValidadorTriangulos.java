import java.util.Scanner;

public class ValidadorTriangulos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double lado1;
        double lado2;
        double lado3;

        System.out.println("Dime cuanto mide 1r lado: ");
        lado1 = sc.nextDouble();
        System.out.println("Dime cuanto mide 2do lado: ");
        lado2 = sc.nextDouble();
        System.out.println("Dime cuanto mide 3r lado: ");
        lado3 = sc.nextDouble();

        if ((lado2 + lado1) > lado3 && (lado2 + lado3) > lado1 && (lado3 + lado1) > lado2){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("El triángulo es equilatero.");
            } else if (lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado1!= lado2 || lado3 == lado2 && lado3!= lado1 ) {
                System.out.println("Es un triángulo isosceles.");
                
            }else System.out.println("Es un triángulo escaleno.");

        }else System.out.println("Este triángulo no es valido.");
    }
}
