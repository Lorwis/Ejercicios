import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Calculadora {
    static boolean isOpption5Called = true;

    public static void main(String[] args) {
        final String ERROR_NUMERO_INVALIDO = " Ingrese un valor numerico ";
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean numeroInvalido1 = true;
        boolean numeroInvalido2 = true;

        // Menu de opciones
        while (numeroInvalido1) {
            try {
                System.out.println("Ingrese el primer numero: ");
                num1 = sc.nextDouble();
                numeroInvalido1 = false;


            } catch (InputMismatchException e) {
                System.out.println(ERROR_NUMERO_INVALIDO);
                sc.nextLine();
            }
        }
        //TODO Crear otro bucle while para cuando haya una excepcion.

            while (numeroInvalido2) {
                try {
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = sc.nextDouble();
                    numeroInvalido2 = false;
                } catch (InputMismatchException e) {
                    System.out.println(ERROR_NUMERO_INVALIDO);
                    sc.nextLine();
                }
            }

        System.out.println("Selecione la operación: ");
        System.out.println("1/ suma");
        System.out.println("2/ resta");
        System.out.println("3/ multiplicación");
        System.out.println("4/ división");
        System.out.println("5/ Raiz Cuadrada");
        System.out.println("6/ Redondeo");
        System.out.println("7/ Potencia");


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
                    if (num2 == 0) {
                        System.out.println("No es posible dividir entre cero");
                    } else {
                        double división = num1 / num2;
                        System.out.println("El resultado es: " + división);
                    }
                    break;
                // Raíz cuadrada
                case 5:
                    double raízCuadrada = Math.sqrt(num1);
                    System.out.println("El resultado es: " + raízCuadrada);
                    break;
                case 6:
                    double redondeo = Math.round(num1);
                    System.out.println(redondeo);
                    break;
                case 7:
                    if (num2 == 0){
                        System.out.println("Todo numero elevado a la 0 es igual a 1");
                    }else {
                    double potencia = Math.pow(num1, num2);
                    System.out.println(potencia);
                    }

                default:
                    System.out.println("Ingrese una opción valida: ");
            }



    }
}
