class Solution {
    int floorSqrt(int n) {
        // code here
        if(n%2==0){
            int s=(int)Math.sqrt(n);
            return s;
        }
        else{
            int r=(int)Math.sqrt(n);
            return r;
        }
    }
}