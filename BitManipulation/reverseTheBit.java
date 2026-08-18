package BitManipulation;

import java.util.*;
public class reverseTheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the value of number : ");
        int n = sc.nextInt();
        System.out.println();
        int i=0;
        int j=31;
        while(i<j) {
            int iMask = 1 << i;
            int jMask = 1 << j;
            boolean is_i_bit_on = ((n & iMask) != 0);
            boolean is_j_bit_on = ((n & jMask) != 0);
            if(is_i_bit_on != is_j_bit_on) {
                n ^= iMask;
                n ^= jMask;
            }
            i++;
            j--;
        }
        System.out.println("The value after reversing" + " : " + n);
    }
}
