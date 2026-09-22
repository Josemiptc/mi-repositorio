import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dinero_hora;
        System.out.println("Dime cuánto cobras por hora: ");
        dinero_hora = sc.nextDouble();
        int horas_trabajadas;
        System.out.println("Dime cuantas horas has trabajado: ");
        horas_trabajadas = sc.nextInt();
        double sueldo_bruto = 0;
        double sueldo_neto = 0;
        double diferencia = 0;
        double impuestos = 0;
        // Calculo el bruto
        if (horas_trabajadas > 35){
            sueldo_bruto = 35 * dinero_hora;
            horas_trabajadas = horas_trabajadas - 35;
            sueldo_bruto = sueldo_bruto + horas_trabajadas * (dinero_hora * 1.5);
        }else
            sueldo_bruto = horas_trabajadas*dinero_hora;

        // Calculo lo que queda quitando impuestos (neto)
        if (sueldo_bruto > 500){
            sueldo_neto = sueldo_neto + 500;
            diferencia = sueldo_bruto - 500;
            if (diferencia > 0){
                if (diferencia >= 400){

                    sueldo_neto = sueldo_neto + (400 - 400 * 0.25);
                    impuestos = impuestos + (400 * 0.25);
                    diferencia = diferencia - 400;
                    if (diferencia > 0) {
                        sueldo_neto = sueldo_neto + (diferencia - diferencia * 0.45);
                        impuestos = impuestos + (diferencia * 0.45);
                    }
                }else {
                    sueldo_neto = sueldo_neto + (diferencia - diferencia * 0.25);
                    impuestos = impuestos + (diferencia * 0.25);
                }
            }
        }else sueldo_neto = sueldo_bruto;
        System.out.println("El sueldo bruto es: " + sueldo_bruto);
        System.out.println("Te han quitado " + impuestos + "€ en impuestos");
        System.out.println("El sueldo neto es: " + sueldo_neto);
    }
}