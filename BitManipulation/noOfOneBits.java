package BitManipulation;

public class noOfOneBits {
    public static void main(String[] args) {
        int n = 157;
        count1bits1(n);
        count1bits2(n);
    }
    // approach : 01
    public static void count1bits1(int n) {
        int m = n;
        int count = 0;
        while(m != 0) {
            if(m % 2 != 0) count++;
            m = m >> 1;
        }
        System.out.println("No of 1 bits in "  + n +" is  : " + count);
    }

    // approach : 02
    public static void count1bits2(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = (n & (n - 1));
        }
        System.out.println("No of 1 bits in : "  + count);
    }

}
