import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calendar date = new GregorianCalendar();
        int c_day = date.get(Calendar.DAY_OF_MONTH);
        int c_month = date.get(Calendar.MONTH) + 1;
        int c_year = date.get(Calendar.YEAR);

        System.out.print("День рождения: ");
        int b_day = scan.nextInt();
        if (b_day < 1 || b_day > 31) {
            System.out.println("error");
            System.exit(-1);
        }

        System.out.print("Месяц рождения: ");
        int b_month = scan.nextInt();

        date.set(2022, b_month - 1, 5);
        if (b_month < 1 || b_month > 12 || b_day > date.getActualMaximum(Calendar.DAY_OF_MONTH) ) {
            System.out.println("error");
            System.exit(-1);
        }

        System.out.print("Год рождения: ");
        int b_year = scan.nextInt();
        if (b_year < 1 || b_year > 2022) {
            System.out.println("error");
            System.exit(-1);
        }

        if (c_day < b_day) {
            c_month -= 1;
            date.set(2022, current_month - 1, 2);
            c_day += date.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        if (c_month < b_month) {
            c_year -= 1;
            c_month += 12;
        }

        System.out.print((c_year - b_year) +" лет, " + (c_month - b_month) + " месяцев, "+ (c_day - b_day) + " дней" );
    }
}
