import java.util.*;

public class solution {
public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
    System.out.println("enter a no.");
    int number;
    int choice;
    int evenSum=0;
    int oddSum =0;
    do{
      System.out.println("enter the number");
      number= sc.nextInt();

      if(number%2 ==0){
        evenSum +=number;
      }else{
        oddSum+=number;
      }
System.out.print("Do you want to continue press 1 for yes or 0  for no");
choice = sc.nextInt();

          }      while(choice==1);

          System.out.println("sum of even number " + evenSum);
          System.out.println("sum of odd number" +oddSum);

    
}
   
}
}
