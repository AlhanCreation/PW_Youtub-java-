package college_Wallah;
import java.util.Scanner;

                                  // que no 3. Find the unique in a given Array where all the elements are being repeated twice with one value being unique.
                                   // arr = ( 1,2,3,4,1,2,3)  ..... ans = 4 is the unique number
public class Array_3_Q3_arrayManipulation {
                                      static int FindUnique(int []array ){

                                          int n = array.length;
                                          for (int i = 0 ; i < n ; i++) {
                                              for(int j = i + 1 ; j < n ; j ++){
                                                  if( array[i]==array[j] ){
                                                      array[i]= -1;
                                                      array[j]= -1;
                                                  }
                                              }
                                          }
                                          int ans = -1;
                                          for (int i = 0 ; i < n ; i ++){
                                              if(array[i] > ans){
                                                  ans = array[i];}
                                          }
                                          return ans;
                                      }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] array = new int[n];

        System.out.println("Enter the elements of array :");
        for (int i = 0 ; i < n ; i ++){
            array[i]= sc.nextInt();
        }
        System.out.println("Unique elements : "+ FindUnique(array));
    }

}
