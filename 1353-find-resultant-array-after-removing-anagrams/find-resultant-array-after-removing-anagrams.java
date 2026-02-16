class Solution {
    //isAnagram
    public static boolean isAnagram(String str1,String str2){
        if (str1.length() != str2.length()) {
            return false;
   }
                char[] arr1 = str1.toCharArray();
                   char[] arr2 = str2.toCharArray();
               Arrays.sort(arr1);
           Arrays.sort(arr2);
                 return Arrays.equals(arr1, arr2);
}
       
    
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            arr.add(words[i]);
        }
        for(int i=arr.size()-1;i>0;i--){
            if(isAnagram(arr.get(i),arr.get(i-1))){
                arr.remove(i);
            }
        }
        return arr;
        
    }
}