import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class draftAllE {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.now();
        Scanner sc = new Scanner(System.in);
        int numeroMes =0;
        boolean diasMes =true;
       

        System.out.println("Ingrese el mes del año a verificar");
        numeroMes = sc.nextInt();

        YearMonth specificYearMonth = YearMonth.of(2023, numeroMes);
        Month specificMonth = specificYearMonth.getMonth();
        System.out.println(specificMonth);
        int lengthOfMonth = specificMonth.length(diasMes);
        System.out.println("El mes que selecionaste cuenta con el siguiente numero de dias: " + lengthOfMonth);


    }
}
