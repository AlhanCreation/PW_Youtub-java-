package college_Wallah;
import java.util.Scanner;


                             // Que number one.   find the total number of pairs in the array whose sum is equal to the given value target (x);
                                                        // target = 7 , array { 3,6,3,5,8,2,}
                                                                        // output = 2
public class Array_3_Q1 {
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
                if ( array[i] + array [j] == target){
                    ans++;
                }
            }
        }
        return ans ;
    }
}

