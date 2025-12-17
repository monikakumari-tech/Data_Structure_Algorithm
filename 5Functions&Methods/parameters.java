import java.util.*;

public class parameters {

    public static int Sum(int x, int y) {// parameters  or formal parameters are input of when we defined function
        int sum = x + y;
        return sum;
    }

    public static void main(String args[]) {
        

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Sum(a,b) these are actual parameters or arguments when function call
            System.out.println("sum is " + Sum(a, b));

            // In  call by value we are passing copy of arguments so if any change in these variable then it is not reflecting in main function WHEREAS in call by reference we are passing addresses of actual parameters



        }
    }
}
