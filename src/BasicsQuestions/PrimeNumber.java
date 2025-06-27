package BasicsQuestions;

public class PrimeNumber {
    public static void main(String[] args){
        int n = 18;
        int i = 2;
        boolean isPrime = false;

        while(i < n){
            if(n % i == 0){
                isPrime = true;
            }
            i++;
        }
        if(!isPrime){
            System.out.print("PRIME");
        }
        else{
            System.out.print("NOT PRIME");
        }


    }
}
