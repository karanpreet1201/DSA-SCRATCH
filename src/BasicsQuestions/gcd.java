package BasicsQuestions;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        while(dividend % divisor !=0){
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        System.out.print(divisor);
        sc.close();
    }
}
