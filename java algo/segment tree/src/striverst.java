import java.util.Arrays;
import java.util.Scanner;
public class striverst {
    /*
     this code is for range queries for min value in array by credit -striver(takeuforward).
     with java implementation
     here l,r are range in range query
     ind is index of segment tree which we increase for child like 2*ind+1
     ind2 in update query is index at which val is needed to update in arr main array
     high and low are imaginary range of each node of seg tree
    */
    public static void build(int ind,int low, int high, int[] arr,int[] seg)
    {
        if(low==high)
        {
            seg[ind]=arr[low];
            return;
        }
        int mid=(low+high)/2;
        build(2*ind+1,low,mid,arr,seg);
        build(2*ind+2,mid+1,high,arr,seg);
        seg[ind]=Math.min(seg[2*ind+1],seg[2*ind+2]);
    }
    public static int query(int ind,int low,int high,int l,int r,int[] seg)
    {
        if(low>r||high<l)
            return Integer.MAX_VALUE;
        else if(low>=l&&high<=r)
            return seg[ind];
        else
        {
            int mid=(low+high)/2;
            int left=query(2*ind+1,low,mid,l,r,seg);
            int right=query(2*ind+2,mid+1,high,l,r,seg);
            return Math.min(left,right);
        }
    }
    public static void update(int ind,int low, int high, int ind2,int val,int[] seg)
    {
        if(low==high)
        {
            seg[ind]=val;
            return;
        }
        int mid=(low+high)/2;
        if(ind2<=mid)
            update(2*ind+1,low,mid,ind2,val,seg);
        else
            update(2*ind+2,mid+1,high,ind2,val,seg);
        seg[ind]=Math.min(seg[2*ind+1],seg[2*ind+2]);

    }
    public static void main(String[] args)
    {
        int n;
        System.out.println("give size of array");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("give elements for array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] seg = new int[4*n];
        build(0,0,n-1,arr,seg); //if we pass array in function its referecne copy is given to
        // them hence seg will still point same although function can change value at those memories
        System.out.println("succufully build seg tree"+ Arrays.toString(seg));
        int q;
        System.out.println("give no. of queries");
        q=sc.nextInt();
        while((q--)!=0){
            int type;
            System.out.println("give 1 if range , 2 if update");
            type=sc.nextInt();
            if(type==1)
            {
                System.out.println("give range");
                int l=sc.nextInt();
                int r=sc.nextInt();
                System.out.println(query(0,0,n-1,l,r,seg));
            }
            else{
                System.out.println("give index and val for update");
                int i=sc.nextInt();
                int val=sc.nextInt();
                update(0,0,n-1,i,val,seg);
                arr[i]=val;
            }
        }
    }
}