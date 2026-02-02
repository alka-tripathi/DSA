class Solution {
    public static void solution(int i,int arr[],List<Integer> list,List<List<Integer>> result){
        if(i==arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
    
        list.add(arr[i]);
        solution(i+1,arr,list,result);
        list.remove(list.size()-1);
         while(i<arr.length-1 && arr[i]==arr[i+1]){
            i++;
        }
        solution(i+1,arr,list,result);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
    solution(0,nums,list,result);
    return result;
    }
}