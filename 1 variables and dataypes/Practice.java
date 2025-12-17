import java.util.*;

public class Practice {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter numbers");
            float a = sc.nextFloat();
            float b = sc.nextFloat();    /*b ,a,c are the identifier */   
            Float c = sc.nextFloat();

            int Total = (int)((a+b+c)+(a + b + c) *0.18);
            System.out.println("average is :" + Total);
        }
    }
}