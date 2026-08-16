package BitManipulation;

public class turnOnKthBit {
    public static void main(String[] args) {
        int n = 89;
        System.out.println("Value before the on : " + n);
        int k = 2;
        int mask = 1 << k;
        int result = n | mask;
        System.out.println("Value after the on : " + result);
    }
}
