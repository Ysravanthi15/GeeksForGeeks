class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int j=start;j<=end;j++){
            if(!hs.contains(j)){
                return false;
            }
        }
        return true;
        
    }
}