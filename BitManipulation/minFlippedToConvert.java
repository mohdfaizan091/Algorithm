package BitManipulation;

public class minFlippedToConvert {
    public static void main(String[][] args) {
        int m = 160;
        int n = 175;
        int noOfFlippedBits = 0;
        while(m != 0 || n != 0) {
            if(m % 2 != n % 2) {
                noOfFlippedBits++;
            }
            m = m >> 1;
            n = n >> 1;
        }
        System.out.println("Total flipped bits to convert " + m + " to " + n + " is : " + noOfFlippedBits);
    }
}
