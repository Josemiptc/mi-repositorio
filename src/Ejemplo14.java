import java.util.Scanner;

public class Ejemplo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Dime la nota de tu examen: ");
        nota = sc.nextDouble();
        if (nota < 0) {
            System.out.println("No puede haber notas negativas.");
        } else if (nota < 3) {
            System.out.println("La nota es Muy Deficiente.");
        } else if (nota < 5) {
            System.out.println("La nota es insuficiente");
        } else if (nota < 6) {
            System.out.println("La nota es Suficiente");
        } else if (nota < 7) {
            System.out.println("La nota esta Bien");
        } else if (nota < 9) {
            System.out.println("La nota es Notable");
        } else if (nota <= 10) {
            System.out.println("La nota es Sobresaliente");
        }else if (nota > 10){
            System.out.println("La nota no puede ser mayor que 10.");}
    }
}