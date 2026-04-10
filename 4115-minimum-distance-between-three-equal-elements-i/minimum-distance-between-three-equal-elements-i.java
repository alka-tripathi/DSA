class Solution {
    public static int minDistance(int arr[],int a){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a) list.add(i);
        }
        if(list.size()<3) return Integer.MAX_VALUE;
        int minD=Integer.MAX_VALUE;

        for(int i=0;i<=list.size()-3;i++ ){
            int a1=list.get(i);
            int a3=list.get(i+2);
            int d=2*Math.abs(a1-a3);
            minD=Math.min(minD,d);
        }
        return minD;
    }
    public int minimumDistance(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int minD=Integer.MAX_VALUE;
        for(int a:map.keySet()){
            if(map.get(a)>=3){
            int mD=minDistance(nums,a);
              minD=Math.min(mD,minD);
            }
          
        }
        return minD==Integer.MAX_VALUE?-1:minD;
        
    }
}