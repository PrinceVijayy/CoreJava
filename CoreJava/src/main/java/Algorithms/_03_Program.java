package programs;

import java.util.Arrays;

import static java.lang.Math.sqrt;

//h = 0.5 × √((a + b + c) × (-a + b + c) × (a - b + c) × (a + b - c)) / b
//area = 0.25 × √((a + b + c) × (-a + b + c) × (a - b + c) × (a + b - c))
public class _03_Program {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int resultArr []=new int[nums.length];
        if (nums.length >= 3) {
            for(int i=1;i< nums.length;i++){
                int a = nums[(nums.length)-i];
                int b = nums[nums.length-(i+1)];
                int c = nums[nums.length-(i+2)];
                double area = 0.25 * sqrt(((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c)));
                if (area > 0) {
                    resultArr[i-1]= a + b + c;
                }
            }
            Arrays.sort(resultArr);
            return resultArr[resultArr.length-1];
        }
        return 0;
    }

    public static void main(String[] args) {
        _03_Program obj=new _03_Program();
        int[] nums={1,2,1};
        System.out.println(obj.largestPerimeter(nums));
    }
}
