import java.util.Scanner;
/*
In this version we can make any amount of segment tree, and also we don't need to give seg tree ref again and again
we implemented oops here its making our code more friendly and easy
*/
public class striver2st {
    int[] seg;
    public striver2st(int n)
    {
        seg = new int[n];
    }
    public void build(int ind,int low, int high, int[] arr)
    {
        if(low==high)
        {
            seg[ind]=arr[low];
            return;
        }
        int mid=(low+high)/2;
        build(2*ind+1,low,mid,arr);
        build(2*ind+2,mid+1,high,arr);
        seg[ind]=Math.min(seg[2*ind+1],seg[2*ind+2]);
    }
    public int query(int ind,int low,int high,int l,int r)
    {
        if(low>r||high<l)
            return Integer.MAX_VALUE;
        else if(low>=l&&high<=r)
            return seg[ind];
        else
        {
            int mid=(low+high)/2;
            int left=query(2*ind+1,low,mid,l,r);
            int right=query(2*ind+2,mid+1,high,l,r);
            return Math.min(left,right);
        }
    }
    public void update(int ind,int low, int high, int ind2,int val)
    {
        if(low==high)
        {
            seg[ind]=val;
            return;
        }
        int mid=(low+high)/2;
        if(ind2<=mid)
            update(2*ind+1,low,mid,ind2,val);
        else
            update(2*ind+2,mid+1,high,ind2,val);
        seg[ind]=Math.min(seg[2*ind+1],seg[2*ind+2]);
    }


    public  static void main(String[] args)
    {
        int n;
        System.out.println("give size of array");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("give elements for array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        striver2st seg = new striver2st(4*n);
        seg.build(0,0,n-1,arr); //if we pass array in function its referecne copy is given to
        // then hence seg will still point same although function can change value at those memories
        System.out.println("succufully build seg tree"+ seg);
        int q;
        System.out.println("give no. of queries");
        q=sc.nextInt();
        while((q--)!=0)
        {
            int type;
            System.out.println("give 1 if range , 2 if update");
            type=sc.nextInt();
            if(type==1)
            {
                System.out.println("give range");
                int l=sc.nextInt();
                int r=sc.nextInt();
                System.out.println(seg.query(0,0,n-1,l,r));
            }
            else{
                System.out.println("give index and val for update");
                int i=sc.nextInt();
                int val=sc.nextInt();
                seg.update(0,0,n-1,i,val);
                arr[i]=val;
            }
        }
    }
}
