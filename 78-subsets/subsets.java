class Solution {
    public static void solution(int arr[],int i,List<Integer> list,List<List<Integer>> base){
        if(i==arr.length){
            base.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        solution(arr,i+1,list,base);
        list.remove(list.size()-1);
        solution(arr,i+1,list,base);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> base = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solution(nums,0,list,base);
        return base;
    }
}