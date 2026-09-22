import java.util.Scanner;

public class ClasificacióndeIMC {
    public static void main(String[] args) {
        double peso;
        double altura;
        double IMC;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu peso en kg: ");
        peso = sc.nextDouble();
        System.out.println("Dime tu altura en metros: ");
        altura = sc.nextDouble();

        IMC = peso / (altura * altura);

        if (IMC < 18.5){
            System.out.println("Estas en bajo peso.");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println("Estas en un peso normal.");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println("Tienes sobrepeso.");
        } else if (IMC >= 30) {
            System.out.println("Tienes obesidad.");
        }
    }
}
