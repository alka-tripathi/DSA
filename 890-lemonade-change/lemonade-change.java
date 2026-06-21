class Solution {
    public boolean lemonadeChange(int[] bills) {

      int five=0;
      int ten=0;
      int tw=0;

        for(int i=0;i<bills.length;i++){
            int coin=bills[i];
            if(coin==5){
                five++;
            }else if(coin==10){
                if(five==0){
                    return false;
                }
               ten++;
               five--;
            }else {
                if(five>=1 && ten>=1){
                    five--;
                    ten--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
          

            }
        }
        return true;
        
    }
}