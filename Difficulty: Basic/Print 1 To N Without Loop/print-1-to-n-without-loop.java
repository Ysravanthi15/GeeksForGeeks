class Solution {
    public void printNos(int n) {
        // Code here
        helper(1,n);
    }
    void helper(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        helper(i + 1, n);
    }
}
