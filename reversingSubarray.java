
public class reversingSubarray {
    public static boolean reverse(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] < nums[i + 1] && nums[i + 1] < nums[i + 2]) {
                continue;
            } else if (nums[i] > nums[i + 1] && nums[i + 1] > nums[i + 2]) {
                int next = i;
                int end = l;
                for (int j = next; j < end; j++) {
                    if (nums[j] < nums[j + 1])
                        continue;
                    else {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 4, 3 };
        System.out.println(reverse(nums));
    }
}
