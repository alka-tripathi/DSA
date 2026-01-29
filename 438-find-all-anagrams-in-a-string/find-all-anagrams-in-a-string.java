class Solution {
    public static boolean allZero(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> ans=new ArrayList<>();
         int n=s.length();
         int k=p.length();
         int freq[]=new int[26];

         for(int i=0;i<k;i++){
            freq[p.charAt(i)-'a']++;
         }

         int i=0;
         int j=0;
         while(j<n){
            freq[s.charAt(j)-'a']--;
            if(j-i+1==k){
                if(allZero(freq)){
                    ans.add(i);
                }
                freq[s.charAt(i)-'a']++;
                i++;
            }
            j++;
         }
         return ans;
        
    }
}