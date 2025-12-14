class Solution {
    public static void solution(int arr[],boolean[] used,List<List<Integer>> base,ArrayList<Integer> list){
    if(list.size()==arr.length){
       if(!base.contains(list)){
         base.add(new ArrayList<>(list));
    
       }
     return;
    }

    for(int i=0;i<arr.length;i++){
        if(used[i]) continue;
        used[i]=true;
        list.add(arr[i]);
        solution(arr,used,base,list);
        used[i]=false;
        list.remove(list.size()-1);
    }
             }
    public List<List<Integer>> permuteUnique(int[] nums) {
   List<List<Integer>> result=new ArrayList<>();
          ArrayList<Integer> list = new ArrayList<>();
          boolean used[]=new boolean[nums.length];
         solution(nums,used,result,list);
         return result;
        
    }
}