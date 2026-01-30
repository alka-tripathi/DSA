class Solution {
    public static boolean isVowel(char ch){
    if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
        return true;
    }
    return false;
    }
    public int maxVowels(String s, int k) {

        int count=0;
        int maxcount=0;
        int l=0;
        for(int r=0;r<s.length();r++){

            if(isVowel(s.charAt(r))){
                count++;
            }
            if(r-l+1>k){
                if(isVowel(s.charAt(l))){
                    count--;
                }
                l++;
            }
            if(r-l+1==k){
                maxcount=Math.max(maxcount,count);
            }
        }
        return maxcount;
        
    }
}