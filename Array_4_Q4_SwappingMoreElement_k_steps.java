package college_Wallah;

// Rotate the given array "a" by k steps where k is no-negative
// k can be greater then n
 // ex {1,2,3,4,5,6}  rotate 3;--> k=3
//      4,5,6,1,2,3   after rotating

import java.util.Scanner;

class K{

void setArray(int arr[]){
    Scanner sc = new Scanner(System.in);
   int n= arr.length;
    System.out.println("give the elements of array:");
    for (int i = 0; i<n;i++){
        arr[i]=sc.nextInt();
    }
}
  void display(int x[]){
      int n= x.length;
      System.out.println("Printing the given array: ");
      for (int i = 0; i<n;i++){
          System.out.print(x[i]+" ");
      }
    }

    void condition(int[] arr,int k){
        int n =arr.length;
        k= k % n;
        int ans[]= new int[n];
        int j =0;

        for(int i = n-k ; i <n; i++){
            ans[j++]=arr[i];
        }
        for (int i = 0; i <n-k ; i++){
            ans[j++]=arr[i];

        }
        K obj = new K();
        obj.display(ans);
    }
}

public class Array_4_Q4_SwappingMoreElement_k_steps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        K obj = new K();
        obj.setArray(arr);
        obj.display(arr);
        System.out.println();
        System.out.println("Enter the number of k-steps :");
        int k = sc.nextInt();

        obj.condition(arr,k);





    }

}
