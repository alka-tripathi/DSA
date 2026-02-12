class Solution {
    public static void permutation(int j,int arr[],List<Integer> list,List<List<Integer>> result,boolean used[]){
     if(j==arr.length){
   result.add(new ArrayList<>(list));
   return;
       }

        for(int i=0;i<arr.length;i++){
            if(used[i]) continue;
            used[i]=true;
            list.add(arr[i]);
            permutation(j+1,arr,list,result,used);
            used[i]=false;
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        permutation(0,nums,list,result,used);
        return result;

        
    }
}