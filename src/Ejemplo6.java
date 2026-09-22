import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int radio;
        System.out.println("Cual es tu radio: ");
        radio = sc1.nextInt();

        double perimetro = 2 * radio * Math.PI;
        double area = radio * radio * Math.PI;

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);
    }
}
