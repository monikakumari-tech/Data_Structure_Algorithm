public class n06_subArray {
    public static void printSubArray(int numbers []){
        int tp =0;
         for(int i =0 ;i<numbers.length; i++){
            for( int j=i; j<numbers.length; j++){
                for( int k=i ;k<=j ;k++){
                    System.out.print(numbers[k]+" ");
                }
                tp++;
                System.out.println();
            }
            
            System.out.println();
         }
         System.out.println("total is" + tp);
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,};
        printSubArray(numbers);
    }
}
