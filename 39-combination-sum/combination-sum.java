class Solution {
    public static void solution(int arr[],int i,int target,List<Integer> list,  List<List<Integer>>  base){
        if(i==arr.length || target<0){
            return;
        }
        if(target==0){
           if(!base.contains(list)){
             base.add(new ArrayList<>(list));
           }
            return;
        }
        list.add(arr[i]);
        solution(arr,i+1,target-arr[i],list,base);
        solution(arr,i,target-arr[i],list,base);
         list.remove(list.size()-1);
          solution(arr,i+1,target,list,base);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>  base = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        solution(candidates,0,target,list,base);
        return base;
    }
}