package problems;

import java.util.ArrayList;
import java.util.List;

public class SubsetsInArray {

    public static List<List<Integer>> subsets(int[] nums){

        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<Integer>(), subsets);

        return subsets;
    }

    public static void generateSubsets(int index, int[] nums, ArrayList<Integer> current, List<List<Integer>> subsets) {

        subsets.add(new ArrayList<>(current));
        for (int i=index; i<nums.length;i++){
            current.add(nums[i]);
            generateSubsets(i+1, nums, current, subsets);
            current.remove(current.size() -1);
        }
    }

    public static void main(String... args){

        int[] nums = new int[]{1,2,3};
        System.out.println(subsets(nums));
    }
}
