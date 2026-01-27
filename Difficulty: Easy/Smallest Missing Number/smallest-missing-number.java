class Solution {
    public int findFirstMissing(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return n;
        
    }
}
