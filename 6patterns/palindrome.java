import java.util.*;

public class palindrome {
    public static void palipattern(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1) {
                    System.out.print("");
                } else {
                    System.out.print(j);
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int z = sc.nextInt();
            palipattern(z);

        }
    }
}
