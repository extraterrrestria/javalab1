import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class lab1_2 {
   public static void main(String[] args) {
      Scanner scan2 = new Scanner(System.in);
      Calendar date2 = new GregorianCalendar();

      System.out.print("День: ");
      int day = scan2.nextInt();
      if (day < 1 ||day > 31) {
         System.out.println("error");
         System.exit(-1);
      }

      System.out.print("Месяц: ");
      int month = scan2.nextInt();
      
      if (month < 1 || month > 12 || day > date2.getActualMaximum(Calendar.DAY_OF_MONTH) ) {
         System.out.println("error");
         System.exit(-1);
      }

      if (month >= 3 & month < 6) { System.out.println("Весна"); }
      else if (month >= 6 & month < 9) { System.out.println("Лето"); }
      else if (month >= 9 & month < 12) { System.out.println("Осень"); }
      else if (month < 3 || month == 12) { System.out.println("Зима");}
   }
}