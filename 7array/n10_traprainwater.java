public class n10_traprainwater {

    public static void trap(int arr[]){


       int lftmost[] = new int[arr.length];
       int rgtmost[] = new int[arr.length];

        if(arr.length<=2 ){
System.err.println("no water trap");
        }

        //left most boundary
       lftmost[0] = arr[0];
       for( int i=1 ;i<arr.length ; i++){
           if(arr[i]<lftmost[i-1]){
            lftmost[i] = lftmost[i-1];
           }else{
            lftmost[i] = arr[i];
           }
           System.out.println(lftmost[i]);
       }


//right most boundary
 rgtmost[arr.length-1] = arr[arr.length-1];
       for( int i=arr.length-2 ;i>=0; i--){
        if(arr[i]<rgtmost[i+1]){
         rgtmost[i] = rgtmost[i+1];
        }else{
         rgtmost[i] = arr[i];
        }
       
    }
    int trapwater =0;
    for(int i=1; i<arr.length-1; i++){
         trapwater += (Math.min(lftmost[i], rgtmost[i]))-arr[i];
    }
System.out.println(trapwater);
    }
    public static void main(String[] args) {
        int height[] ={4,2,0,2,0,2};
        trap(height);
    }
}
