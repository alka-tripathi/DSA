class Solution {
    static String[] mapping={
        "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public static void solution(String str,List<String> list,String ans){
     if(str.length()==0){
        list.add(ans);
        return;
     }

        int digit=str.charAt(0)-'0'-2;
        String mapped=mapping[digit];
        for(int i=0;i<mapped.length();i++){
            char ch=mapped.charAt(i);
            //ans+=ch;
            solution(str.substring(1),list,ans+ch);
            
        }




    }
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        String ans="";
        solution(digits,result,ans);
        return result;
        
    }
}