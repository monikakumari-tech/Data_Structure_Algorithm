import java.util.*;

public class inputs {
    public static void main(String args[]) {
        // here sc is object
        try (Scanner sc = new Scanner(System.in)) {

            // next is function catch otill space string
            String input = sc.next();
            System.out.println(input);

            // nextLine used to capture full string
            String name = sc.nextLine();
            System.out.println(name);

            //nextInt used to catch integer
            int number = sc.nextInt();
            System.out.println(number); 

            float price =sc.nextFloat();
            System.out.println(price);


            /*
             nextByte
             nextDouble
             nextBoolean
             nextShort
             nextLong
             */
        }
    }
}
