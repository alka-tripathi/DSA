class Solution {
    public static void solution(int i,int arr[],List<Integer> list, List<List<Integer>> result,int target){
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(i>=arr.length){
            return;
        }
    if(arr[i]<=target){
        list.add(arr[i]);
        solution(i,arr,list,result,target-arr[i]);
         list.remove(list.size()-1);
    }
       
        solution(i+1,arr,list,result,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solution(0,candidates,list,result,target);
        return result;
        
    }
}