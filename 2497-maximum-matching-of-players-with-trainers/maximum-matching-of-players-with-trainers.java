class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);
        int n=players.length;
        int m=trainers.length;

        int l=n-1;
        int r=m-1;
        int ans=0;
        while(l>=0 && r>=0){
            if(players[l]<=trainers[r]){
                ans++;
                l--;
                r--;
            }else{
                l--;

            }
        }
        return ans;
        
    }
}