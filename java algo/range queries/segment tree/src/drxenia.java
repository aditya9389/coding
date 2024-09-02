import java.util.Arrays;
import java.util.Scanner;

/*
Dr.xenia and bit operation this is a problem in codeforces in this we need to do or operation on 1st step of adjacent
elements then xor on thrir adjacent result then or then xor
so it will make a segment tree like structure in which it grow up by or then xor. on odd layer it would be or
on even it would be xor whatever comes as last single element it will be anwser
*/
public class drxenia {
    public static void build(int ind,int low, int high, int[] arr,int[] seg,boolean odd)
    {
        if(low==high)
        {
            seg[ind]=arr[low];
            return;
        }
        int mid=(low+high)/2;
        build(2*ind+1,low,mid,arr,seg,!odd);
        build(2*ind+2,mid+1,high,arr,seg,!odd);
        if(odd)
        seg[ind]=(seg[2*ind+1]|seg[2*ind+2]);
        else
            seg[ind]=(seg[2*ind+1]^seg[2*ind+2]);
    }
    public static void update(int ind,int low, int high, int ind2,int val,int[] seg,boolean odd)
    {
        if(low==high)
        {
            seg[ind]=val;
            return;
        }
        int mid=(low+high)/2;
        if(ind2<=mid)
            update(2*ind+1,low,mid,ind2,val,seg,!odd);
        else
            update(2*ind+2,mid+1,high,ind2,val,seg,!odd);
        if(odd)
            seg[ind]=(seg[2*ind+1]|seg[2*ind+2]);
        else
            seg[ind]=(seg[2*ind+1]^seg[2*ind+2]);

    }
    public static void main(String[] args)
    {
        int n;      //here n is for number of operation and size of arr for elements will be n^2
        System.out.println("give number of operations");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int el= (int) Math.pow(n,2);
        int[] arr =new int[el];
        System.out.println("give elements for array");
        for(int i=0;i<el;i++)
            arr[i]=sc.nextInt();
        int[] seg = new int[4*el];
        if(n%2==0)
        build(0,0,el-1,arr,seg,false);
        else build(0,0,el-1,arr,seg,true);
        System.out.println("succufully build seg tree"+ Arrays.toString(seg));
        int q;
        System.out.println("give no. of queries");
        q=sc.nextInt();
        while((q--)!=0)
        {
            System.out.println(seg[0]);
            int i=sc.nextInt();
            int val=sc.nextInt();
            if(n%2==0)
                update(0,0,el-1,i-1,val,seg,false);
            else
                update(0,0,el-1,i-1,val,seg,true);

        }
    }
}
