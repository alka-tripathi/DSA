class Solution {
    public static List<List<Integer>> subsetSol(int arr[],List<Integer> ans ,int i){
        if(i>=arr.length){
            List<List<Integer>> result=new ArrayList<>();
            result.add(new ArrayList<>(ans));
            return result;
        }
        ans.add(arr[i]);
        List<List<Integer>> include=subsetSol(arr,ans,i+1);
        ans.remove(ans.size()-1);

        List<List<Integer>> exclude= subsetSol(arr,ans,i+1);
        include.addAll(exclude);
        return include;

    }
    public List<List<Integer>> subsets(int[] nums) {
List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = subsetSol(nums,list,0);
        return ans;
        
    }
}