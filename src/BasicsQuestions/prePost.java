package BasicsQuestions;

public class prePost {
    public static void main(String[] args) {
        int a = 100;
        int b = a++;
        int c = b--;
        int d = ++a;
        int ans = 7 + a + a++ + 9 + b + --d + 90;
        System.out.print(ans);
    }
}
