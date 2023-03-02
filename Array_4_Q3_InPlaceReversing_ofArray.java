package college_Wallah;

class InplaceReversing{
    int swapping(int arr[]){
        int n = arr.length;
         for (int i=0; i<n; i++){
             for(int j=n-1; j>n; j--){
                 arr[i] = arr[i]+arr[j];
                 arr[j] = arr[i]-arr[j];
                 arr[i] = arr[i]-arr[j];
                 return(arr[i]+arr[j]);
             }
         }
         return -1;
    }
}
public class Array_4_Q3_InPlaceReversing_ofArray {
    public static void main(String[] args) {
        int arr [] = {2,3,4,5,6,7};
        InplaceReversing obj = new InplaceReversing();

        obj.swapping(arr);
    }

}
