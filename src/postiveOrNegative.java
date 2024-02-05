import java.util.Scanner;

public class postiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.println("Ingrese el numero a evaluar");
        numero = sc.nextDouble();
        if (numero > 0){
            System.out.println("El numero ingresado es positivo");
        }else{
            System.out.println("El numero ingresado es Negativo");
        }
    }
}
