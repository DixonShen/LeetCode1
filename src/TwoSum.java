/**
 * Created by DixonShen on 2016/3/20.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 *You may assume that each input would have exactly one solution.

 *Example:
 *Given nums = [2, 7, 11, 15], target = 9,
 *Because nums[0] + nums[1] = 2 + 7 = 9,
 *return [0, 1].
 */

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum {

    public static void main(String[] args) {

//        int[] a = {123,124,24,4,56,7,43,37,3,73,7322,6};
//        int[] result = twoSum(a,49);
//        Arrays.sort(result);
//        for(int b:result)
//            System.out.println(b);

        String s = "-2000";
        System.out.print(s.hashCode());


    }

    public static int[] twoSum(int[] nums, int target){
        int[] hash = new int[10000000];
        int[] result = new int[2];
        for (int i =0;i<nums.length;i++){
            hash[nums[i]] = i+1;
        }
        for(int a=0;a<(target/2);a++){
            if (hash[a]!=0&&hash[target-a]!=0){
                result[0] = hash[a]-1;
                result[1] = hash[target-a]-1;
                break;
            }
        }

        return result;
    }
}
