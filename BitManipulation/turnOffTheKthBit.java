package BitManipulation;

public class turnOffTheKthBit {
    public static void main(String[] args) {
        int n = 37;
        System.out.println("Value before the on : " + n);
        int k = 2;
        int mask = ~ (1 << k);
        int result = n & mask;
        System.out.println("Value after the on : " + result);
    }
}
