package BitManipulation;

public class isNisPowerOfTwo {
    public static void main(String[] args) {
        int n = 1024;
        System.out.println(isPowerofTwo1(n));
        System.out.println(isPowerofTwo2(n));
    }
    public static boolean isPowerofTwo1(int n) {
        if(n <= 0) return false;
        while(n % 2 == 0) {
            n = n / 2;
        }
        if(n == 1) return true;
        return false;
    }
    public static boolean isPowerofTwo2(int n) {
        if(n <= 0) return false;
        return (n & (n - 1 ))== 0;
    }
}
