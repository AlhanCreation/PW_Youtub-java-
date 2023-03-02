package college_Wallah;
import java.util.Scanner;


public class number_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Binary_num = sc.nextInt();

        int ans = 0; //converted decimal number
        int pw = 1; // 2 ^ 0 = 1

        while (Binary_num > 0) {

            int unit_digit = Binary_num % 10 ;
            ans = ans + (unit_digit + pw);
            Binary_num /= 10;
            pw = pw *2;
        }
        System.out.println(ans);


    }
}
