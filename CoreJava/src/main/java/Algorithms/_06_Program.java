package programs;

import java.util.ArrayList;
import java.util.List;

public class _06_Program {
    public int[] twoSum(int[] nums, int target) {

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    temp.add(i);
                }
            }
        }

        int[] result = temp.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        _06_Program obj = new _06_Program();
        for (int k : obj.twoSum(nums, target)) {
            System.out.println(k);
        }
    }
}
