package Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println("Before swap " + arr[0] + " " + arr[1]);
        swap1(arr[0],arr[1]);
        System.out.println("After swap " + arr[0] + " " + arr[1]);
        System.out.println();
        System.out.println("Before swap " + arr[2] + " " + arr[3]);
        swap2(arr,2,3);
        System.out.println("After swap " + arr[2] + " " + arr[3]);
    }

    public static void swap1(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swap2(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
