import java.util.Scanner;

public class practice {

   public static int digiSum(int x) {

      int Sum = 0;

      while (x > 0) {
         int lastDigit= x % 10;
         Sum += lastDigit;
         x /= 10;
      }
      return Sum;

   }

   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         System.out.println("enter the number");
         int digits = sc.nextInt();

         System.out.println("sum of digit of " + digits + " is : " + digiSum(digits));
      }

   }

}
