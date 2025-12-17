import java.util.*;

public class typeconversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // type conversion or widening conversion or implicit conversion
            // byte>short>int>float>long>double

            // allowed
            float number = sc.nextInt();
            System.out.println(number);

            // type casting or lossy conversion
            float a = (float)1.1;
            int b = (int)a;
            System.out.println(b);


            // type promotion  use in expression byte ,short,char change into int
            // lomg, float,double change into big one which exist
             char p = 'b';
             char q = 'c';
             System.out.println(p-q);
            //  here p-q is 1 type promotion is happening when in expression
          
          
          
            // char r = p-q;
            // here type cast needed


        }
    }
}
