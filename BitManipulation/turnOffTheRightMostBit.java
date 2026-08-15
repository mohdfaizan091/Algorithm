package BitManipulation;

import java.util.*;
public class turnOffTheRightMostBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int givenNo = sc.nextInt();
        int result = turnoff(givenNo);
        System.out.println("value after turn off : " + result);
        int result2 = turnoff2(givenNo);
        System.out.println("value after turn off : " + result2);
    }
    // approach 01
	public static int turnoff(int givenNumber){
		int rightMostKthPosition = 0;

        while(givenNumber%2 == 0) {

        	givenNumber = givenNumber >> 1;
        	rightMostKthPosition++;
    	}

        int mask = ~ 1;
    	int settheBit = givenNumber & mask;
        int output = settheBit << rightMostKthPosition;
		return output;	
	}

    // approach -2 

    public static int turnoff2(int turnoff2){
        return (turnoff2-1) & (turnoff2);
    }
}
