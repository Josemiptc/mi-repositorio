import java.util.Scanner;

public class Ejemplo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Dime la nota de tu examen: ");
        nota = sc.nextInt();
        switch (nota) {
            case 0:
                System.out.println("La nota es Muy deficiente.");
                break;
            case 1:
                System.out.println("La nota es Muy deficiente.");
                break;
            case 2:
                System.out.println("La nota es Muy deficiente.");
                break;
            case 3:
                System.out.println("La nota es Insuficiente.");
                break;
            case 4:
                System.out.println("La nota es Insuficiente.");
                break;
            case 5:
                System.out.println("La nota es Suficiente.");
                break;
            case 6:
                System.out.println("La nota esta bien.");
                break;
            case 7:
                System.out.println("La nota es Notable.");
                break;
            case 8:
                System.out.println("La nota es Notable.");
                break;
            case 9:
                System.out.println("La nota es Sobresaliente.");
                break;
            case 10:
                System.out.println("La nota es Sobresaliente.");
                break;
            default:
                System.out.println("Nota no válida,introduce un numero del 0 al 10.");
        }
    }
}
