package college_Wallah;

import java.util.Scanner;

public class Array_4_ReversingOrderOfArray {
    /* QUE:- revers the order of given array
       case1 : [1,2,3,4,5]
       output:- [5,4,3,2,1]
     */

    static int[] reversArray(int []arr){
        int n = arr.length;
        int j=0;
        int ans [] = new int[n];

        // traversing array in from n-1
        for(int i = n-1; i >= 0 ; i--){
            ans[j++] = arr[i];
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.print("Enter the length of array : ");
       // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();


        int [] arr ={1,2,3,4,5,6};

//        System.out.print("Enter the elements of array: ");
//        for (int i=0;i<n;i++){
//            arr[i]= sc.nextInt();

        int ans [] = reversArray(arr);

        for (int i=0;i <ans.length;i++){
            System.out.print(ans[i]+" ");
             }

    }
}
