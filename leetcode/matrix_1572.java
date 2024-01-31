package java.leetcode;
public class matrix_1572{
        public int diagonalSum(int[][] mat)
        {
            int i=0;
            int j=mat.length-1;
            int sum=0;
            for(int d=0;d<mat.length;d++)
            {
                sum=sum+mat[i][j];
                i++;
                j--;
                    
                if((mat.length%2!=0)&&(d==mat.length/2))
                {
                    continue;
                }
                sum+=mat[d][d];
            }
            return sum;
        }
}
