class Solution {

        public static void solution(int arr[],int i,int target,List<Integer> list,  List<List<Integer>>  base){
            if(target==0){
             base.add(new ArrayList<>(list));
            return;
        }
        if(i==arr.length || target<0){
            return;
        }
        
        for(int j=i;j<arr.length;j++){
           if(j>i && arr[j]==arr[j-1]) continue;
           if(arr[j]> target) break;
             list.add(arr[j]);
           
            solution(arr,j+1,target-arr[j],list,base);
            list.remove(list.size()-1);
        }
        
    
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>>  base = new ArrayList<>();
       Arrays.sort(candidates);
        List<Integer> list= new ArrayList<>();
        solution(candidates,0,target,list,base);
        return base;
    }
}