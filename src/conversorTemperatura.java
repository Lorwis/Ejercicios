import java.util.Scanner;

public class conversorTemperatura {
    public static void main(String[] args) {
        double grados = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura a transformar: ");
        grados = sc.nextDouble();

        System.out.println("Selecione la opción de converción a realizar: ");
        System.out.println("1/ Celcius to Fahrenheit");
        System.out.println("2/ Fahrenheit to Celcius");

        int opcion = sc.nextInt();
        System.out.println(opcion);

        switch (opcion){
            case 1:
                double fahrToCel = (grados * 9/5) + 32;
                System.out.println("El valor ingresado en Celcius es..." + (fahrToCel));
                break;
            case  2:
                double celtoFahr = (grados - 32)*5/9;
                System.out.println("El valor ingresado en Fahrenheit es..." + (celtoFahr));
                break;
            default:
                System.out.println("Ingrese una opción valida: ");
        }

    }
}
