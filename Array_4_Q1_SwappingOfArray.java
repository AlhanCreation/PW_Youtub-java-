package college_Wallah;

class swap{   // swap using temp variable
    void swappingByTemp(int a, int b){
        System.out.println("BEFORE SWAP");
        System.out.println("a element is :"+a);
        System.out.println("b element is :"+b);


        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("AFTER SWAP");
        System.out.println("a element is :"+a);
        System.out.println("b element is :"+b);
    }

    // swap elements without using swap !

    void swapping(int a , int b){
        System.out.println("BEFORE SWAP");
        System.out.println("a element is :"+a);
        System.out.println("b element is :"+b);
                     // logic a = 5 , b = 2
                    // a = 5+2 = 7
                   //  b = 7-2  = 5   ---successfully b= 5
                  //   a = 7-5 = 2    ---successfully a =2
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("AFTER SWAP");
        System.out.println("a element is :"+a);
        System.out.println("b element is :"+b);


    }
}

public class Array_4_Q1_SwappingOfArray {
    public static void main(String[] args) {
        swap obj = new swap();
        obj.swappingByTemp(5,2);
        obj.swapping(5,2);

    }
}
