public class node {
    node[] child = new node[26];
    boolean isword;
    public static node newnode()
    {
        node temp=new node();
        temp.isword=false;
        for(int i=0;i<26;i++)
            temp.child[i]=null;
        return temp;
    }
    public static void insert(node root,String key)
    {
        for(int i=0;i<key.length();i++)
        {
            if(root.child[key.charAt(i)-'a']==null)
                root.child[key.charAt(i)-'a']=newnode();
            root=root.child[key.charAt(i)-'a'];
        }
        root.isword=true;
    }
    public static boolean search(node root, String key)
    {
        for(int i=0;i<key.length();i++)
        {
            if(root.child[key.charAt(i)-'a']==null)
                return false;
            root=root.child[key.charAt(i)-'a'];
        }
        return root.isword;
    }
    public static boolean deleteword(node root,String key)
    {
        if(!search(root,key))
            return false;
        for(int i=0;i<key.length();i++)
        {
            root=root.child[key.charAt(i)-'a'];
        }
        root.isword=false;
        return true;
    }
}
