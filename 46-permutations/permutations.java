class Solution {
    public static void solution(int arr[],boolean used[],List<Integer> list,
    List<List<Integer>>  base){
       if(list.size()==arr.length){
       base.add(new ArrayList<>(list));
       return;
       }
        for(int i=0;i<arr.length;i++){
            if(used[i]) continue;
            used[i]=true;
            list.add(arr[i]);
            solution(arr,used,list,base);
            used[i]=false;
            list.remove(list.size()-1);

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  base = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        solution(nums,used,list,base);
        return base;
        
    }
}