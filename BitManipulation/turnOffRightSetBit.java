package BitManipulation;

public class turnOffRightSetBit {
    public static void main(String[] args) {
        int givenNumber = 1480;
        turnOff1(givenNumber);
        turnOff2(givenNumber);
    }
    // approach : 01
    public static void turnOff1(int givenNumber) {
        int rightMostKthPosition = 0;

        while (givenNumber % 2 == 0) {

            givenNumber = givenNumber >> 1;
            rightMostKthPosition++;
        }

        int mask = ~1;
        int settheBit = givenNumber & mask;

        int output = settheBit << rightMostKthPosition;

        System.out.println(output);
    }
    // approach : 02
    public static void turnOff2(int n) {
        System.out.println((n & n-1));
    }
}

