
public class powerOfTwo {
    // all power of two in binary format just have 1 set bit eg. 8 = 1000
    // so performing a bitwise and on number -1 will return 0 if it is a power of
    // two
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

}

// another approach
// number becomes 1 after continually div by 2
// public boolean isPowerOfTwo(int n) {
// if (n < 1) {
// return false;
// }

// while (n % 2 == 0) {
// n /= 2;
// }

// return n == 1;
// }
