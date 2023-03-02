package college_Wallah;

public class Array_largestValueInTheArray {
    public static void main(String[] args) {
        int arr[] = {21,2,75,58,100};
                int max = arr[0];

                for (int i=0; i<arr.length;i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
        System.out.println(max);
    }
}
