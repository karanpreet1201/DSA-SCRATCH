package BasicsQuestions;

public class ReverseNumber {

        public static void main(String[] args) {
            int num = 123456789;
            int ans = 0;
            while(num > 0){
                int temp = num % 10;
                ans = ans * 10 + temp;
                num = num / 10;
            }
            System.out.print(ans);
        }
    }

