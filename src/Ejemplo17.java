import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes;
        System.out.println("Dime un mes cualquiera: ");
        mes = sc.next();
        if (mes.equals("Enero")) {
            System.out.println("Tiene 31 días.");
        } else if (mes.equals("Febrero")) {
            System.out.println("Tiene 28 días.");
        } else if (mes.equals("Marzo")) {
            System.out.println("Tiene 31 días.");
        } else if (mes.equals("Abril")) {
            System.out.println("Tiene 30 días.");
        } else if (mes.equals("Mayo")) {
            System.out.println("Tiene 31 días.");
        } else if (mes.equals("Junio")) {
            System.out.println("Tiene 30 días.");
        } else if (mes.equals("Julio")) {
            System.out.println("Tiene 31 días.");
        } else if (mes.equals("Agosto")) {
            System.out.println("Tiene 31 días.");
        } else if (mes.equals("Septiembre")) {
            System.out.println("Tiene 30 días.");
        } else if (mes.equals("Octubre")) {
            System.out.println("Tiene 31 días.");
        } else if (mes.equals("Noviembre")) {
            System.out.println("Tiene 30 días.");
        } else if (mes.equals("Diciembre")) {
            System.out.println("Tiene 31 días.");
        } else System.out.println("Mes no válido,recuerda poner la primera letra en mayúscula.");
    }
}