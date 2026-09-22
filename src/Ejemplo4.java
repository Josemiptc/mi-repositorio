import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        System.out.println("¿Cual es el lado del cuadrado? ");
        lado = sc.nextInt();
        sc.close();
        float area = lado * lado;
        System.out.println("El area es: "  + area);



    }
}
