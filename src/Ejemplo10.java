import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double valor;
        System.out.println("Dime un número positivo o negativo: ");
        valor = sc1.nextDouble();
        if (valor >= 0){
            System.out.println("El número es positivo.");
        }else{
            System.out.println("El número es negativo.");
        }
    }
}
