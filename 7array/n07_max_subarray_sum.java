
public class n07_max_subarray_sum {


    public static void printSubArray(int numbers []){
        
        int maxSum =Integer.MIN_VALUE;

         for(int i =0 ;i<numbers.length; i++){
            // int start =i;
            int currSum =0;
            for( int j=i; j<numbers.length; j++){
                // int end =j;
                // currSum =0;
                // for( int k=start ;k<=end;k++){
                    currSum+=numbers[j];
                // }
                // System.out.println(currSum);
            if(maxSum<currSum){
                maxSum =currSum;
            } 
            }
         }
         System.out.println("max sum =" + maxSum);
    }

    public static void main(String[] args) {  
        int numbers[] = {1,-2,6,-1,3};
        printSubArray(numbers);
    }
    }
    

