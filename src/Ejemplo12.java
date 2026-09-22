import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double valor1;
        double valor2;
        System.out.println("Dime un numero: ");
        valor1 = sc1.nextDouble();
        System.out.println("Dime otro numero: ");
        valor2 = sc1.nextDouble();
        if (valor1 > valor2){
            System.out.println(valor1);
        }else {
            System.out.println(valor2);
        }
    }
}
