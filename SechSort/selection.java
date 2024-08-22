
//get the minimum and swap
package SechSort;

public class selection {
    public static String selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0;
                if (nums[j] <= nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            sb.append("-> ").append(n);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 46, 24, 52, 20, 9 };
        System.out.println(selectSort(nums));
    }
}