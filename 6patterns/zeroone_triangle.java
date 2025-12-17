import java.util.*;

/**
 * 0-1triangle
 */
public class zeroone_triangle {

    public static void zerotriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
             
            }
            System.out.println(); 
        }
    }

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            int z = sc.nextInt();
            zerotriangle(z);
        }

    }

}
