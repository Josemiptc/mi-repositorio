import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double valor1;
        double valor2;
        System.out.println("Dime un número: ");
        valor1 = sc1.nextDouble();
        System.out.println("Dime otro número: ");
        valor2 = sc1.nextDouble();

        if (valor1 > valor2){
            System.out.println(valor2 + " , " +  valor1);
        }else {
            System.out.println(valor1 + " , " +  valor2);
        }
    }
}
