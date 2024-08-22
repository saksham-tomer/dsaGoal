
//If the number is below the lower limit the floor is the first element of the array

//If the number is above the higher limit the floor is the last element of the array

//If the number exists then the floor and the ceil  is the number itself

//if the number lies within the range of the array then the first number greater than is the ceil and the number before that is the floor

import java.io.PrintStream;

class ceilingInSorted {
    static class Pair {
        static int floor;
        static int ceil;

        Pair(int floor, int ceil) {
            Pair.floor = floor;
            Pair.ceil = ceil;
        }

        @Override
        public String toString() {
            return "Pair{floor=" + floor + ", ceil=" + ceil + "}";
        }
    }

    public static Pair ceiling(int[] nums, int x) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (x <= nums[0]) {
                return new Pair(nums[0], -1);
            } else if (x >= nums[l - 1]) {
                return new Pair(nums[l - 1], -1);
            } else if (x == nums[i]) {
                return new Pair(nums[i], nums[i]);
            } else if (nums[i] >= x) {
                return new Pair(nums[i - 1], nums[i]);
            }
        }
        return new Pair(-1, -1);
    }

    public static void main(String[] args) {
        PrintStream stream = new PrintStream(System.out);
        int[] nums = { 1, 2, 8, 10, 10, 12, 19 };
        int x = 20;

        Pair result = ceiling(nums, x);
        stream.print(result);
        stream.flush();
    }
}
