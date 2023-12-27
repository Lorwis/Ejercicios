import java.util.InputMismatchException;
import java.util.Scanner;

public class conversorTemperatura {

    public static void main(String[] args) {
        double grados = 0;
        boolean numeroInvalido = true;
        final String ERROR_NUMERO_INVALIDO = " Ingrese un valor numerico ";

        Scanner sc = new Scanner(System.in);
while (numeroInvalido) {
try {
    System.out.println("Ingrese la temperatura a transformar: ");
    grados = sc.nextDouble();
    numeroInvalido = false;
}catch (InputMismatchException e){
    System.out.println(ERROR_NUMERO_INVALIDO);
    sc.nextLine();
}
}
        System.out.println("Selecione la opción de converción a realizar: ");
        System.out.println("1/ Celcius to Fahrenheit");
        System.out.println("2/ Fahrenheit to Celcius");

        int opcion = sc.nextInt();
        System.out.println(opcion);

        switch (opcion){
            case 1:
                double fahrToCel = (grados * 9/5) + 32;
                System.out.println("(Valor ingresado C°) La converción a Fahrenheit es..." + (fahrToCel));
                break;
            case  2:
                double celtoFahr = (grados - 32)*5/9;
                System.out.println("(Valor ingresado Fahrenheit) La converción a Celcius es..." + (celtoFahr));
                break;
            default:
                System.out.println("Ingrese una opción valida: ");
        }

    }
}
