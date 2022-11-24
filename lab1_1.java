import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class lab1_1 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("День рождения: ");
      int b_day = scan.nextInt();
      System.out.print("Месяц рождения: ");
      int b_month = scan.nextInt();
      System.out.print("Год рождения: ");
      int b_year = scan.nextInt();

      if (b_day < 1 || b_day > 31) {
         System.out.println("error");
         System.exit(-1);
      }

      Calendar date = new GregorianCalendar();
      int c_day = date.get(Calendar.DAY_OF_MONTH);
      int c_month = date.get(Calendar.MONTH) + 1;
      int c_year = date.get(Calendar.YEAR);


      if ((b_month - 1) < 1 || (b_month - 1) > 12 || b_day > date.getActualMaximum(Calendar.DAY_OF_MONTH) ) {
         System.out.println("error");
         System.exit(-1);

      }

      if (b_year < 1 || b_year > 2022) {
         System.out.println("error");
         System.exit(-1);
      }

      if (c_day < b_day) {
         c_month -= 1;
         date.set(2022, c_month - 1, 2);
         c_day += date.getActualMaximum(Calendar.DAY_OF_MONTH);
      }
      if (c_month < b_month) {
         c_year -= 1;
         c_month += 12;
      }

      System.out.print((c_year - b_year) +" лет, " + (c_month - b_month) + " месяцев, "+ (c_day - b_day) + " дней" );
   }
}