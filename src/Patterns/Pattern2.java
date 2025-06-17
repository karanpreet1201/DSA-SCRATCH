package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n){
            int coloumn = 1;
            while(coloumn <= row){
                System.out.print("*   ");
                coloumn++;
            }
            System.out.println();
            row++;
        }
    }
}
