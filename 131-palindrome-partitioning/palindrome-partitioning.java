class Solution {
    public static boolean isPalindrom(String s,int i,int j){
       StringBuilder str=new StringBuilder(s.substring(i,j+1));
       //str.reverse();
       return s.substring(i,j+1).equals(str.reverse().toString());
    }
    public static void backtrack(String s,int idx,List<String> list,List<List<String>> result){
if(idx==s.length()){
    result.add(new ArrayList<>(list));
    return;
}

 for(int i=idx;i<s.length();i++){
    if(isPalindrom(s,idx,i)){
        System.out.print(s.substring(idx,i+1)+" ");
        list.add(s.substring(idx,i+1));
        backtrack(s,i+1,list,result);
        list.remove(list.size()-1);
    }
 }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> list=new ArrayList<>();
        backtrack(s,0,list,result);
        return result;
    }
}