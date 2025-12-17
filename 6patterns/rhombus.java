import java.util.*;

public class rhombus {

       public static void rhombo(int n){
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 | j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
System.out.println();
       }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int z = sc.nextInt();
            rhombo(z);
        }
    }
}
