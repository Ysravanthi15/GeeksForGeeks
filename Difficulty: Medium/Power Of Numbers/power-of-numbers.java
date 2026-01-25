class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev = 0, temp = n;

        // reverse the number
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        long result = 1;
        long base = n;

        // fast exponentiation
        while (rev > 0) {
            if ((rev & 1) == 1) {
                result *= base;
            }
            base *= base;
            rev >>= 1;
        }

        return (int)result;
    }
}
