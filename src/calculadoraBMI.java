import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class calculadoraBMI {
    public static void main(String[] args) {
        final String ERROR_NUMERO_INVALIDO = " Ingrese un valor numerico ";
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        boolean numerosInvalido1 = true;
        boolean numerosInvalido2 = true;

while (numerosInvalido1)try {

    System.out.println("Ingrese su peso (kg)");
    num1 = sc.nextDouble();
    numerosInvalido1 = false;
}catch (InputMismatchException e){
    System.out.println(ERROR_NUMERO_INVALIDO);
    sc.nextLine();
}
while (numerosInvalido2)
           try {
               System.out.println("Ingrese estatura ejmemplo: 1.65");
               num2 = sc.nextDouble();
               numerosInvalido2 = false;
           }catch (InputMismatchException e){
               System.out.println(ERROR_NUMERO_INVALIDO);
               sc.nextLine();
           }

        System.out.println("seleccione rango de edad");
        System.out.println("1/ mayor de 20 años");

        int opción = sc.nextInt();
        System.out.println(opción);
        switch (opción){
            case 1:
                //adulto
                double calculo = num1/Math.pow(num2,2);
                System.out.println(calculo);
                if (calculo < 18.5){
                    System.out.println("Bajo peso");
                } else if (calculo >= 18.5 && calculo <= 24.9 ){
                    System.out.println("Peso normal");
                } if (calculo >= 25.0 && calculo <= 29.9){
                System.out.println("Sobrepeso");
            }else if (calculo >= 30.0) {
                System.out.println("Obesidad");
            } break;
        }


    }
}
