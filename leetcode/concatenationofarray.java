package java.leetcode;

class concation {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length*2];
        int i=0;
        while(i!=nums.length)
        {
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
            i++;
        }
        return arr;
    }
}
