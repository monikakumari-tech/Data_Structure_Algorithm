public class selection_sort {


    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int mini = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[mini]>arr[j]){
                  mini = j;
                }
            }
            int temp =arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,8,4,7}; //element 6 [ 0 1 2 3 4 5]
        selection(arr);
    }
}
