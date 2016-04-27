public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] Increasing = new int[nums.length];
        Increasing[0] = 1;
        for(int i = 1; i <= nums.length - 1; i++){
            int length = 0;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i] && Increasing[j] > length){
                    length = Increasing[j];
                }
            }
            Increasing[i] = length + 1;
        }
        int longest = 0;
        for(int k = 0; k < Increasing.length; k++){
            if(Increasing[k] > longest){
                longest = Increasing[k];
            }
        }
        return longest;
    }
}