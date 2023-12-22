import java.util.InputMismatchException;
import java.util.Scanner;
public class mesDias {
    public static void main(String[] args) {
        String[] mesesAño = new String[13];
        Scanner sc = new Scanner(System.in);
        double numero1 = 0;
        boolean siSeCumple = true;



    mesesAño[0] = "1/ Enero";
    mesesAño[1] = "2/ Febrero";
    mesesAño[2] = "3/ Marzo";
    mesesAño[3] = "4/ Abril";
    mesesAño[4] = "5/ Mayo";
    mesesAño[5] = "6/ Junio";
    mesesAño[6] = "7/ Julio";
    mesesAño[7] = "8/ Agosto";
    mesesAño[8] = "9/ Septiembre";
    mesesAño[9] = "10/ Octubre";
    mesesAño[10] = "11/ Noviembre";
    mesesAño[11] = "12/ Diciembre";
    for (int i = 0; i < 12; i++) {
        System.out.println(mesesAño[i]);
            }


while (siSeCumple) {
    try {
        System.out.println("Ingrese el numero del mes a evaluar");
    numero1 = sc.nextDouble();
    siSeCumple = false;
    }catch (InputMismatchException e){
        System.out.println("Error: Ingrese un numero valido.");
       sc.nextDouble();
    }
}

    switch ((int) numero1){
        case 1:
            System.out.println("El mes de Enero tiene 31 días");
            break;
        case 2:
            System.out.println("El mes de Febrero tiene 28 días");
            break;
        case 3:
            System.out.println("El mes de Marzo tiene 31 días");
            break;
            case 4:
            System.out.println("El mes de Abril tiene 30 días");
            break;
            case 5:
            System.out.println("El mes de Mayo tiene 31 días");
            break;
            case 6:
            System.out.println("El mes de Junio tiene 30 días");
            break;
            case 7:
            System.out.println("El mes de Julio tiene 31 días");
            break;
            case 8:
            System.out.println("El mes de Agosto tiene 31 días");
            break;
            case 9:
            System.out.println("El mes de Septiembre tiene 30 días");
            break;
            case 10:
            System.out.println("El mes de Octubre tiene 31 días");
            break;
            case 11:
            System.out.println("El mes de Noviembre tiene 30 días");
            break;
            case 12:
            System.out.println("El mes de Diciembre tiene 31 días");
            break;
        default:
            System.out.println("Mes no reconocido");
            break;
}
    }

}




