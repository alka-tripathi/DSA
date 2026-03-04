class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans[]= new int[k]; //ans ke liye hai ye
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> Integer.compare(map.get(a),map.get(b)));
        for(int val:map.keySet()){
            pq.add(val);//value store ho rhi hai
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll();
        }
        return ans;

        
        
    }
}