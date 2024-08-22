//check for negative number 
//if negative then it cannot be a palindrome

class Solution {
    public boolean isPalindrome(int x) {
        // If x is negative, it cannot be a palindrome
        if (x < 0)
            return false;

        // Initialize variables
        int original = x;
        int reversed = 0;

        // Reverse the integer
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the original number is equal to the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int testNumber = 121; // Example number to test
        boolean result = solution.isPalindrome(testNumber);
        System.out.println(testNumber + " is a palindrome: " + result);
    }
}
