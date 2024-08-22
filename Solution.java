import java.util.Arrays;

public class minimumMovesToEqual {
    public void solve(int[] nums) {
        Arrays.sort(nums);
    }
}

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        minimumMovesToEqual obj = new minimumMovesToEqual();
        System.out.println(obj.solve(nums));
    }
}