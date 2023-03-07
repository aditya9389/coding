package java.leetcode;

public class palendrom_09 {
    public boolean isPalindrome(int x) {
        int temp=0;
        int temp1=x;
        if(x<0){
            return false;

        }
        while(temp1 !=0)
        {
            temp=(temp*10)+ temp1%10;
            temp1 = temp1/10;

        }
        if(temp == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}