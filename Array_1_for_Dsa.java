package college_Wallah;

class Questions{

    void addition_of_array(){
        // add all the elements of array
        int sum = 0;
        int [] add = {1,2,3,4,5,6,7,8,9};
        for(int i = 0 ; i < add.length; i++) {
            sum += add[i];
        }
        System.out.println(sum);
    }

    void Find_The_maximum_value_From_the_array(){
        int ans = 0;
        int[] maximum = {4,6,2,7,9,1};//ans :9
        for(int i = 0 ; i<maximum.length; i++){
            if(maximum[i] > ans)
            { ans = maximum[i]; }
        }
        System.out.println("Maximum value is: "+ ans);
    }

    void Search_the_x_inGivenArray(){
        int x = 5;// let x = 5
        int ans = 0;


        int[] Search = {2,3,4,5,6,7,8,9};

        for (int i =1 ; i< Search.length;i++)
        {
                  if (Search[i]==x) {
                     ans  = i ;
                     break;
                  }
        }
        System.out.println("Found "+ x + " at index: "+ ans);

}


public class Array_for_Dsa {
    public static void main(String[] args) {
        Question obj = new Question();
        //obj.addition_of_array();
        //obj.Find_The_maximum_value_From_the_array();
       // obj.Search_the_x_inGivenArray();
    }


    }
}
