class Solution {
    public static void subset(int arr[],List<Integer> ans ,int i, List<List<Integer>> mainlist){
 if(i>=arr.length){
    if(!mainlist.contains(ans)){
        mainlist.add(new ArrayList<>(ans));
    }
    return;
   
 }
    ans.add(arr[i]);
    subset(arr,ans,i+1,mainlist);
    ans.remove(ans.size()-1);
    subset(arr,ans,i+1,mainlist);
   
}
    public List<List<Integer>> subsetsWithDup(int[] nums) {
Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
         List<List<Integer>> mainlist=new ArrayList<>();
       subset(nums,ans,0,mainlist);
        return mainlist;
        
    }
}