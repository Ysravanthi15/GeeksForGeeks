class Solution {
    int minToggle(int[] arr) {
        // code here
         int tZ = 0;

        // count total zeros
        for (int num : arr) {
            if (num == 0) {
                tZ++;
            }
        }

        int oL= 0;
        int zL = 0;

        int ans = Integer.MAX_VALUE;

        // partition at every position
        for (int i = 0; i <= arr.length; i++) {

            int zR = tZ - zL;

            ans = Math.min(ans, oL + zR);

            // update counts for next partition
            if (i < arr.length) {
                if (arr[i] == 1) {
                    oL++;
                } else {
                    zL++;
                }
            }
        }

        return ans;
    }
}