package BitManipulation;
import java.util.*;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value n in 2^n : ");
        int n = scan.nextInt();
        int result = findPower(n);
        System.out.println("The power of 2^n is : " + result); 
    }
    public static int findPower(int n) {
        return 1 << n;

    }

}