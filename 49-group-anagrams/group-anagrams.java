class Solution {
    public static String sortString(String str){
        char[] charArray=str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> result=new ArrayList<>();
       
         HashMap<String,List<String>> map=new HashMap<>();
         for(int i=0;i<strs.length;i++){
            String sorted=sortString(strs[i]);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
         }
         for(String a:map.keySet()){
            List<String> str=map.get(a);
            result.add(str);
         }
         return result;
       
        
    }
}