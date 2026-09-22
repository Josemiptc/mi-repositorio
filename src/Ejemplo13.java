import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double valor1;
        double valor2;
        int orden;
        System.out.println("Dime el primer número: ");
        valor1 = sc1.nextDouble();

        System.out.println("Dime el segundo número: ");
        valor2 = sc1.nextDouble();

        System.out.println("Pulsa 1 si quires ordenar los números en orden ASCENDENTE , pulsa otro numero para orden DESCENDENTE: ");
        orden = sc1.nextInt();

        if (orden == 1){
            if (valor1 > valor2){
                System.out.println(valor2 + "," + valor1);
            }else {
                System.out.println(valor1 + "," + valor2);
            }
        }else{
            if (valor1 > valor2){
                System.out.println(valor1 + "," + valor2);
            }else {
                System.out.println(valor2  + "," + valor1);
            }
        }
    }
}
