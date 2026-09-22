import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;
        System.out.println("Dime cuántas horas tienes: ");
        horas = sc.nextInt();
        System.out.println("Dime cuántos minutos tienes: ");
        minutos = sc.nextInt();
        System.out.println("Dime cuántos segundos tienes: ");
        segundos = sc.nextInt();
        if (segundos >= 60){
            minutos = minutos + 1;
            segundos = segundos - 60;
            if (minutos >= 60){
                horas = horas +1;
                minutos = minutos -60;
            }
        }
        segundos = segundos + 1;
        if (segundos >= 60){
            minutos = minutos + 1;
            segundos = segundos - 60;
            if (minutos >= 60){
                horas = horas +1;
                minutos = minutos -60;
            }
        }
        System.out.println("Después de sumarle 1 segundo tenemos: " + horas +" hora/s " + minutos + " minuto/s " + segundos + " segundo/s.");
    }
}
