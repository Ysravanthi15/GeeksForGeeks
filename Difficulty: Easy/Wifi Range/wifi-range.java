class Solution {
    public boolean wifiRange(String s, int x) {
        // code here
        int n=s.length();
        boolean c[]=new boolean[n];
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == '1') {

                int st = Math.max(0, i - x);
                int e = Math.min(n - 1, i + x);

                for (int j = st; j <= e; j++) {
                    c[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {

            if (c[i] == false) {
                return false;
            }
        }

        return true;
    }
}