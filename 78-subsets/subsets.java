class Solution {
    public static void solution(int i,int arr[],List<List<Integer>> result,ArrayList<Integer> list){
        if(i==arr.length){
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[i]);
        solution(i+1,arr,result,list);
        list.remove(list.size()-1);
        solution(i+1,arr,result,list);
        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
         ArrayList<Integer> list = new ArrayList<>();
         solution(0,nums,result,list);
         return result;
    }
}