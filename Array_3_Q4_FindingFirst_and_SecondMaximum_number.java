package college_Wallah;

public class Array_3_Q4_FindingFirst_and_SecondMaximum_number {
    static int Find_1st_Max(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int SecondMax(int [] arr){
        int max = Find_1st_Max(arr);


        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]== max){ arr[i]=Integer.MIN_VALUE;
        }
      }

        int secondMax =Find_1st_Max(arr);
       return secondMax;
    }


    public static void main(String[] args) {
      /*  System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE); */

        int arr[]= {5,4,1,6,2};
        System.out.println("The first maximum elements of array is: "+Find_1st_Max(arr));
        System.out.println("The second maximum elements of an arrray is: "+SecondMax(arr));


    }
}

