import java.util.Scanner;

public class factorialNumero {
    static boolean repeatCicle = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese un numero");
            int factorial = scanner.nextInt();
            int x = 1;
            int resultado = 1;
            while (x <= factorial) {
                resultado = resultado * x;
                x++;
            }
            System.out.println("Factorial: " + resultado);
            System.out.println("Si desea continuar precione cualquier letra y de click, si no simplemente escriba (no)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }


        }
        scanner.close();
    }
}