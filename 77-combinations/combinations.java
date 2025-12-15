class Solution {
    List<List<Integer>> base = new ArrayList<>();
    public static void solution(int start,int n,int k,List<Integer> list,List<List<Integer>> base){

        if(k==0){
            base.add(new ArrayList<>(list));
            return;

        }
        if(start>n)return;
        list.add(start);
        solution(start+1,n,k-1,list,base);
        list.remove(list.size()-1);
        solution(start+1,n,k,list,base);
        return;


    }
    public List<List<Integer>> combine(int n, int k) {

        
        List<Integer> list = new ArrayList<>();
       
        solution(1,n,k,list,base);
        return base;
        
    }
}