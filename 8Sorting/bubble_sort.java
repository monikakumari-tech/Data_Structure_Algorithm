
public class bubble_sort {

    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("arrray is sorted ");
                break;  
            }
        }
        // for(int i=0; i<arr.length; i++){
            // System.out.print(arr[i]);
        // }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 7, 8 }; // 6 elements index[0,1,2,3,4,5]
        bubble(arr);
    }

}