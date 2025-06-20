package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 0;
        int space = 1;
        int star = n;

        while(row < n){
            // Spaces print in coloumn
            int coloumn = 0;
            while(coloumn < space){
                System.out.print("   ");
                coloumn++;
            }

            // Printing star
            int temp = 1;
            while(temp <= star){
                System.out.print("*  ");
                temp++;
            }

            // Next line work....
            System.out.println();
            star--;
            row++;
            space++;
        }

        sc.close();
    }
}
