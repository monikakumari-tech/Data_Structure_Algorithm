import java.util.*;

public class numberpyramid {

    public static void pyramid(int n) {
        int count =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
       
            for (int j = 1; j <= i; j++) {
                System.out.print( " "+ count);
                 
            }
        count++;
            System.out.println();
           
        }

    }

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            int z = sc.nextInt();
            pyramid(z);
        }
    }
}