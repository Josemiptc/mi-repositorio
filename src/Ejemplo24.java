import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        double suma = 0;
        int cont = 0;
        double media;
        boolean diez = false;

        do {
            System.out.println("Introduce una nota: ");
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10){
                cont++;
                suma = suma + nota;
                if (nota == 10){
                    diez = true;
                }

            }
        }while (nota != -1 );
        media = suma / cont;
        if (diez == true){
            System.out.println("La nota media es: " + media + " y si has tenido al menos un diez.");
        }else {
            System.out.println("La nota media es: " + media + " y no has tenido al menos un diez.");
        }
    }
}
