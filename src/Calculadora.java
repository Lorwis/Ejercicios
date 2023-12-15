import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        final String ERROR_NUMERO_INVALIDO =  " Ingrese un valor numerico ";
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean numeroInvalido1 = true;
        boolean numeroInvalido2 = true;
        while (numeroInvalido1) {
            try {
                System.out.println("Ingrese el primer numero: ");
                num1 = sc.nextDouble();
                numeroInvalido1 = false;
                sc.nextDouble();

            } catch (InputMismatchException e) {
                System.out.println(ERROR_NUMERO_INVALIDO);
                sc.nextLine();
                numeroInvalido1=true;
            }
        }
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();

        // Menu de opciones

        System.out.println("Selecione la operación: ");
        System.out.println("1/ suma");
        System.out.println("2/ resta");
        System.out.println("3/ multiplicación");
        System.out.println("4/ división");

        //Necesitamos leer las operaciones
        int opción = sc.nextInt();
        System.out.println(opción);

        // Estructura de control Switch case
        switch (opción) {
            case 1:
            //suma
                double suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
                break;


            //Resta
                case 2:
                    double resta = num1 - num2;
                    System.out.println("El resultado es: " + resta);
                    break;

                    //Multiplicación

            case 3:
                double multipplicación = num1 * num2;
                System.out.println("El resultado es: " + multipplicación);
                break;
            case 4:
                if (num2 == 0 ) {
                    System.out.println("No es posible dividir entre cero");
                } else {
                    double división = num1 / num2;
                    System.out.println("El resultado es: " + división);
                }
                break;
            default:
                System.out.println("Ingrese una opción valida: ");





        }





    }

}
