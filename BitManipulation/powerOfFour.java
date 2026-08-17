package BitManipulation;

public class powerOfFour {
    public static void main(String[] args) {
       int n = 13; 
       System.out.println(isPower(n));
    }
    public static boolean isPower(int n) {
        return ((n & (n - 1)) == 0) && isPerfectSquare(n);
    }
    public static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }
}
