package BitManipulation;

public class swapTwoNo {
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        System.out.println(x+ " " +y);
        swap1(x , y);
        swap2(x , y);
        swap3(x , y);
    }
    public static void swap1(int x , int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x+ " " +y);
    }
    public static void swap2(int x , int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x+ " " +y);
    }
    public static void swap3(int x , int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x+ " " +y);
    }
}

