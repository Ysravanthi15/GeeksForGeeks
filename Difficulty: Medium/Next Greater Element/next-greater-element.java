class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            boolean falg=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    res.add(arr[j]);
                    falg=true;
                    break;
                }
            }
            if(falg==false){
            res.add(-1);
            }
        }
        
        return res;
    }
}