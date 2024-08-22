
//adjacent swaps
//in the first iteration the max will be at the last index so the iteration will be reduced by 1
// as the last will be sorted
package SechSort;

public class bubbleSort {
    private static String bubble(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp = 0;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            sb.append(
                    "->").append(n);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int nums[] = { 13, 46, 24, 52, 20, 9 };
        System.out.println(bubble(nums));
    }
}
