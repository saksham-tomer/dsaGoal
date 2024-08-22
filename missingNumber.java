//two solutions
//1. using sort and compare
//2. using XOR
//XOR is the best solution
//XOR is commutative and associative
//XOR of a number with itself is 0
//XOR of a number with 0 is the number itself
//XOR of all the numbers from 1 to n is the missing number

//3.use the sum of the numbers from 1 to n
//using the formula n*(n+1)/2
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 3, 0, 1 }; // Example array
        int missingNumber = solution.missingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }
}
