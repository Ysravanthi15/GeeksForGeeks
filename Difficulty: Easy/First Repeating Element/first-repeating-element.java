class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
        
    }
}
