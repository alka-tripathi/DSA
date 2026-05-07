class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        int tty=0;
        for(int i=0;i<bills.length;i++){
            int coin=bills[i];
            if(coin==5){
                f++;
            }else if( coin==10){
                if(f==0)return false;
                f--;
                t++;
            }else {
    
                if(f>0 && t>0){
                    f--;
                    t--;
                }else if(f>=3){
                    f=f-3;
                }else{
                    return false;
                }

            }
        }

    return true;
        
    }
}