package college_Wallah;

class InplaceReversing{

    void SwappingArray(int[] arr, int i , int j){
       int temp= arr[i];
       arr[i]= arr[j];
       arr[j]= temp;
    }
    void reversingArray(int[] arr){
        int i =0; int j = arr.length-1;
        while (i<j){
            SwappingArray(arr,i,j);
            i++;
            j--;
        }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
public class Array_4_Q3_InPlaceReversing_ofArray {
    public static void main(String[] args) {
        int arr [] = {2,3,4,5,6,7};
        InplaceReversing obj = new InplaceReversing();
        obj.reversingArray(arr);
        obj.printArray(arr);
    }

}
