package java.leetcode;

public class shuffle_1470 {
    
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp,j=1,k=n,temp1;
        for(int i=0;i<n;i++)
        {
            temp=nums[k];
            for(int m=k;m>j;m--)
            {
                nums[m]=nums[m-1];

            }
            nums[j]=temp;
            k++;
            j+=2;
        }
        return nums;
    }
}