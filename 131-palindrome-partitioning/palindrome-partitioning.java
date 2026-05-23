class Solution {
   public static boolean isPalindrom(String str){
        char arr[]= str.toCharArray();
        int l=0;
        int n=str.length();
        int r=n-1;
        while(l<=r){
            if(arr[l] != arr[r])return false;
            l++;
            r--;
        }
        return true;
    }
    public static void solution(int i,String s,List<String> list,List<List<String>> res){
        if(i==s.length()){
            res.add(new ArrayList<>(list));
            return;

        }

        for(int l=i+1;l<=s.length();l++){
            String temp=s.substring(i,l);
            if(isPalindrom(temp)){
                list.add(temp);
                solution(l,s,list,res);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        List<List<String>> res= new ArrayList<>();
        solution(0,s,list,res);
        return res;
        
    }
}