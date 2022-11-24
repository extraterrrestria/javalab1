import java.util.Scanner;

public class lab1_3 {
   public static void main(String[] args) {
      Scanner scan3 = new Scanner(System.in);
      float X, Y;
      int count = 0;

      System.out.print("Количество точек: ");
      int points = scan3.nextInt();
      if (points < 1) {
         System.out.println("error");
         System.exit(-1);
      }

      System.out.print("Радиус окружности: ");
      double rad = scan3.nextDouble();
      if (rad < 1) {
         System.out.println("error");
         System.exit(-1);
      }

      for (int i = 1; i <= points; i++) {
         System.out.printf("X" + i + " точки: ");
         X = scan3.nextDouble();
         System.out.printf("Y " + i + " точки: ");
         Y= scan3.nextDouble();

         if ((X*X + Y*Y) <= rad*rad) { count += 1;}
      }

      System.out.printf(count + " точек попало в окружность");
   }
}