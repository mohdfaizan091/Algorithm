package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int[] nums = {0 , 1 ,3};
        approach01(nums);
        System.out.println();
        approach02(nums);
    }
    // approach : 01
    public static void approach01(int[] nums) {
        List<List<Integer>> ans = new  ArrayList<> ();
        List<Integer> temp = new ArrayList<>();
        countSubset(ans , temp , nums , 0);
        System.out.println(ans);
    }
    public static void countSubset(List<List<Integer>> ans , List<Integer> temp , int[] nums , int idx) {
        if(idx == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        //  pick
        temp.add(nums[idx]);
        countSubset(ans , temp , nums , idx + 1);
        // backtrack
        temp.remove(temp.size() - 1);
        // not pick
        countSubset(ans , temp , nums , idx + 1);
    }


    // aproach : 02 := bit manipulation
    public static void approach02(int[] nums) {
        int totalCombination = 1 << nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0 ; i<totalCombination ; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int bitIdx = 0 ; bitIdx<nums.length ; bitIdx++) {
                int bitmask = 1 << bitIdx;
                if((bitmask & i) != 0) {
                    temp.add(nums[bitIdx]);
                }
            }
            ans.add(temp);
        }
        System.out.println(ans);
    }
}
