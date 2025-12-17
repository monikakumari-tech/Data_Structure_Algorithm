// java is 0-based indexing
// int mark[]= new int[20]  here new  keyword is used for to find a location for that array

// array as function argument public static void update( int mark[])

import java.util.*;


public class n03_linearsearch {




    public static int linearSearch (int marks[], int key) {

        for (int i = 0; i < marks.length; i++ ) {
            if (marks[i] == key) {
                System.out.println("key is at" + marks[i]);
                return i;
            }

;
            }
            return -1;
        }
    


    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int marks[] = { 2, 4, 6, 8, 10, 12, 14 };
            int key = sc.nextInt();
             int index = linearSearch(marks, key);
              if(index == -1){
                System.out.println("key not found");
              }else{
                System.out.println("key is at" + index);
              }
        }
    }
}