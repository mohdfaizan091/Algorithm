package BitManipulation;

public class toogleTheKthBit {
    public static void main(String[] args) {
        int n = 91;
        System.out.println("Value before the toggle : " + n);
        int k = 3;
        int mask = 1 << k;
        int result = n ^ mask;
        System.out.println("Value after the toggle : " + result);
    }
}
