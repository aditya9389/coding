import java.util.Scanner;

public class rangesumqueries {
    public static int[] intializeblock(int [] arr, int n) //n is for new block here already a sqrroot
    {
        int[] b= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            b[i/n]+=arr[i];
        }
        return b;
    }

    public static void update(int[] arr,int[] block,int ind,int newval)
    {
        int change= newval-arr[ind];
        arr[ind]=newval;
        int b=block.length;
        block[ind/b]+=change;
    }

    public static int rangesum(int[] arr,int[] block,int st,int end)
    {
        int res=0;
        int k=block.length;
        int n=arr.length;
        int start_block=st/k;
        int end_block=end/k;
        if(start_block==end_block)
        {
            for(int i=st;i<=end;i++)
                res+=arr[i];
        }
        else{
            for(int i=start_block+1;i<end_block;i++)
                res+=block[i];

            int i=st;
            while(i/k==start_block)
                res+=arr[i++];

            i=end;
            while(i/k==end_block)
                res+=arr[i--];
        }
        return res;
    }
    public static void main(String[] args) {
        int queries=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("give number of ele in array");
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("give element number- "+ (i+1));
            arr[i]=sc.nextInt();
        }
        int newblockn= (int) Math.sqrt(n);
        int[] block= new int[newblockn];
        block=intializeblock(arr,newblockn);
        System.out.println("give number of queries");
        queries=sc.nextInt();
        while(queries--!=0)
        {
            System.out.println("give 1 for rangesum or 2 for update or 0 for exit");
            int q=sc.nextInt();
            if(q==1)
            {
                System.out.println("give starting and ending of range");
                int st=sc.nextInt();
                int end=sc.nextInt();
                if(st>=0&&end<n)
                System.out.println("sum of range from " + st+ "to " + end + " is=" + rangesum(arr,block,st,end));
                else
                    System.out.println("range out of array length");
            }
            else if(q==2)
            {
                System.out.println("give index and new value");
                int ind=sc.nextInt();
                int newval=sc.nextInt();
                if(ind>=0&&ind<n)
                    update(arr,block,ind,newval);
                else
                    System.out.println("given ind is out of range");
            }
            else if(q==0)
                break;
            else
                System.out.println("choose from given queries only");
        }
    }
}