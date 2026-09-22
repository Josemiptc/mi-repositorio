import java.util.Scanner;

public class CalificadorExamenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        String practicas;
        System.out.println("Dime tu nota numérica: ");
        nota = sc.nextDouble();
        if (nota < 0 || nota > 10){
            System.out.println("La nota no es válida.");
        }else {
            System.out.println("¿Has entregado todas las practicas?Escribe si o no: ");
            practicas = sc.next().toLowerCase();
            if (practicas.equals("si")){
                if (nota < 5){
                    System.out.println("Estas suspenso.");
                }else if (nota >= 5 && nota < 7){
                    System.out.println("Estas aprobado.");
                } else if (nota >= 7 && nota < 9) {
                    System.out.println("Tienes un notable.");
                } else  {
                    System.out.println("Tienes un sobresaliente.");
                }
            } else if (practicas.equals("no")) {
                if (nota >= 5){
                    System.out.println("Estas suspenso por tener practicas pendientes.");
                }else {
                    System.out.println("Estas suspenso.");
                }


            } else System.out.println("Entrada no válida.");
        }
    }
}
