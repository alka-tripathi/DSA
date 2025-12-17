class Solution {
    public static void solution(int i,int sum,int k,List<Integer> list,List<List<Integer>> base){
          if(k==list.size() && sum==0){
            base.add(new ArrayList<>(list));
            return;
          }
        for(int j=i;j<=9;j++){
            list.add(j);
            solution(j+1,sum-j,k,list,base);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> base = new ArrayList<>();
        if(n<k){
            return base;
        }
        List<Integer> list = new ArrayList<>();
        solution(1,n,k,list,base);
        return base;
    }
}