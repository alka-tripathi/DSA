class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n==1){
            nums1[0]=nums2[0];
            return;
        }
        int k=m+n-1;
        int l=m-1;
        int r=n-1;
        while(l>=0 && r>=0 && k>=0){
            if(nums2[r]>nums1[l]){
                nums1[k--]=nums2[r];
                r--;
            }else{
                nums1[k--]=nums1[l];
                l--;
            }
        }
//remaing element
while(r>=0){
    nums1[k--]=nums2[r--];
}

        
    }
}