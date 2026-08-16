package BitManipulation;

import java.util.Scanner;

public class checkKthSetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tha number : ");
        int number = sc.nextInt();
        System.out.println();
        System.out.print("Enter tha position : ");
        int k = sc.nextInt();
        System.out.println();
        System.out.println(isSet(number , k));
    }
    public static boolean isSet(int n , int k) {
        int mask = 1 << k;
        return (n & mask) != 0;
    }
}