package college_Wallah;

class Question {

    // 1 Que
    // calculate the number of occurrences of a particular element x.
    // array with 4 elements (5,6,5,1,5)
    // out put is 3 times the number of 5 is occurs


    /* 1st answer
    int count = 0;
    void CheckArray(int[]array,int x){
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                count++;
            }
        }
        System.out.println("The total number of occurrences are: "+ count);
    }  */

    // 2nd que

    // find the least index  occurrence of an element in a given array
    int last_index = -1;
    void CheckArray(int[]array,int x){
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                last_index=i;
            }
        }
        System.out.println("The least occurrences x: "+ last_index);
    }




}

public class Array_2 {

    public static void main(String[] args) {

        /* 1 ans
        int [] array = {5,6,5,1,5};
        Question obj = new Question();
        obj.CheckArray(array,5);*/

        /*2nd ans
        int [] array = {5,6,5,3,5,4};
        Question obj = new Question();
       // obj.CheckArray(array,5);
        obj.CheckArray(array,8);
        */


    }
}

