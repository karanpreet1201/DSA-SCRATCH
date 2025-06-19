package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        while(row < n){
            int coloumn = 0;
            while(coloumn < n - row){
                System.out.print("*   ");
                coloumn++;
            }
            System.out.println();
            row++;
        }

        sc.close();
    }
}
