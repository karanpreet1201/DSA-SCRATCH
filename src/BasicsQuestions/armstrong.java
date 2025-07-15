package BasicsQuestions;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(isArmstrong(num));
        sc.close();
    }

    public static boolean isArmstrong(int num){
        int count = countDigit(num);
        int tempNum = num;
        int sum = 0;
        while(tempNum > 0){
            int temp = tempNum % 10;
            sum += (int) Math.pow(temp,count);
            tempNum /= 10;
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static int countDigit(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
