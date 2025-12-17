public class n11_stock {

    public static void stock(int arr[]){
                 int buyPrice = Integer.MAX_VALUE;
                 int maxProfit = 0;
                 for( int i=0; i<arr.length; i++){
                    if(buyPrice <arr[i]){
                        int profit =arr[i] - buyPrice;
                        maxProfit = Math.max(maxProfit , profit);
                    }else{
                        buyPrice =arr[i];
                    }

                 }
                 System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int arr[] = {7,2,5,3,6,4,1};
        stock(arr);
    }
}
