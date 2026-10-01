import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo_inicial;
        int entrada;
        double cantidad_ingresar;
        double cantidad_retirar;
        System.out.println("Saldo inicial: ");
        saldo_inicial = sc.nextDouble();
        System.out.println("Saldo: " + saldo_inicial + " €");
        do {
            System.out.println("1. ingresar 2. Retirar 0. Salir");
            entrada = sc.nextInt();

            if (entrada == 1){
                System.out.println("Cantidad a ingresar: ");
                cantidad_ingresar = sc.nextDouble();
                saldo_inicial = saldo_inicial + cantidad_ingresar;
                System.out.println("Saldo: " + saldo_inicial + " €");
            }else if (entrada == 2){
                System.out.println("Cantidad a retirar: ");
                cantidad_retirar = sc.nextDouble();
                saldo_inicial = saldo_inicial - cantidad_retirar;
                System.out.println("Saldo: " + saldo_inicial + " €");
            }
        }while(entrada != 0);
    }
}
