package college_Wallah;

import java.util.Scanner;

// count the number of triplet whose sum is equal  to  the given value of target (x)  // x = 12 ;
                                    // array= { 1, 4 ,5 , 6, 3} // pairs ( 1,5,6) , ( 4, 5 ,3)  *** ans = 2
public class Array_3_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of array" );
        for(int i= 0 ; i<n ; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum :");
        int target = sc.nextInt();
        System.out.println(pairSum(array,target));
    }
    ///******************** logic *********************************
    static int  pairSum(int[] array, int target){
        int ans = 0;
        int n = array.length;

        for(int i = 0 ;i <n ; i++ ){  // first number pick
            for(int j = i +1 ; j < n ; j++){  // second number
                for( int k = j + 1 ; k < n ; k++){ // third number
                    if ( array[i] + array [j] + array[k] == target){
                        ans++;}
                }
            }
        }
        return ans ;
    }
}


