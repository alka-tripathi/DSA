class Solution {
    public int beautySum(String s) {

        int n=s.length();
        int maxans=0;
        for(int i=0;i<n;i++){
            TreeMap<Character,Integer> map = new TreeMap<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
          
                map.put(ch,map.getOrDefault(ch,0)+1);

                int minF=Integer.MAX_VALUE;
                int maxF=0;
                for(int value:map.values()){
               minF=Math.min(minF,value);
                   maxF=Math.max(maxF,value);
                }
                  maxans+=(maxF-minF);
            }
          
        }
        return maxans;
        
    }
}