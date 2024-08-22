//switch with neighboring elements 
//do till the first element   
//the subarray will get sorted 

// The method takes an array of integers as input.
// It iterates over the array starting from the second element (index 1).
// For each element, it compares it with the elements before it (already sorted part of the array).
// It shifts elements that are greater than the current element (key) to one position ahead to make space for the key.
// Finally, it places the key in its correct position.

package SechSort;

public class insertionSort {
    public static String insertion(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            sb.append("->").append(n);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = { 13, 46, 24, 52, 20, 9 };
        System.out.println(insertion(nums));
    }
}
