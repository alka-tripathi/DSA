class Solution {
    public static boolean dfs(int arr[],int start){
        Queue<Integer> q= new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()){
            int currIndex=q.poll();

            if (arr[currIndex] < 0) continue;
            if(arr[currIndex]==0)return true;

            if(arr[currIndex]+currIndex<arr.length) q.add(arr[currIndex]+currIndex);
            if(currIndex-arr[currIndex]>=0) q.add(currIndex-arr[currIndex]);

            arr[currIndex]=-arr[currIndex];
        }
        return false;
    }
    public boolean canReach(int[] arr, int start) {
        if(start>=arr.length)return false;

        return dfs(arr,start);
        
    }
}