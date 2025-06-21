package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int space = 0;
        int star = n;

        while(row < n){
            // Printing space
            int coloumn =1;
            while(coloumn <= space){
                System.out.print("   ");
                coloumn++;
            }
            // Printing stars
            int temp = 1;
            while(temp <= star){
                System.out.print("* ");
                temp++;
            }

            System.out.println();
            star--;
            space = space + 2;
            row++;
        }
    }
}
