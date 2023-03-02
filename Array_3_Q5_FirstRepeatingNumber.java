package college_Wallah;
import java.util.Scanner;

// Que number 5 : Given an array 'a' consisting of integers. Return the first value that is repeating in  this array. if no
//value is being repeated, return -1.
                  /// ex:- arr { 1,5,3,4,6,3,4,}   // output :- 3

public class Array_3_Q5_FirstRepeatingNumber {

    static int repeating(int [] arr){
        int n = arr.length;
        for( int i=0 ; i<n; i++){
            for(int j = i+1 ; j< n ; j++){
                if( arr[i]== arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Enter the length of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int [] arr =new int[n];

        System.out.print("Enter the elements of array: ");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("The first repeating element is: "+repeating(arr));
    }
}
