class Solution {
    public static void subSets(int i,int arr[],List<Integer> list, List<List<Integer>> result){
   if(i==arr.length){
    result.add(new ArrayList<>(list));
    return;
   }
         list.add(arr[i]);
        subSets(i+1,arr,list,result);
        list.remove(list.size()-1);
        subSets(i+1,arr,list,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
         subSets(0,nums,list,result);
         return result;
        
    }
}