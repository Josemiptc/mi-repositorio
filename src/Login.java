import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseña = "1234Abc";
        String entrada;
        int MAX_INTENTOS = 3;
        int intentos = 0;
        do {
            System.out.println("Contraseña: ");
            entrada = sc.next();
            intentos = intentos + 1;
            if (intentos == MAX_INTENTOS) {
                break;
            }
            if (!entrada.equals(contraseña)) {
                int restantes = MAX_INTENTOS - intentos;
                System.out.println("Incorrecta. Te quedan " + restantes + " intentos");
            }else System.out.println("Acceso concedido.");
        }while(!entrada.equals(contraseña));

    }
}
