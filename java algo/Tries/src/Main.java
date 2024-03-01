import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        node dic=node.newnode();
        while(true)
        {
            System.out.println("press 1 for insert , 2 for search , 3 for delete and 4 for to stop");
            int i=sc.nextInt();
            if(i==4)
                break;
            String word;
            switch (i)
            {
                case 1 :
                    System.out.println("give word to insert");
                    word= sc.next();
                    node.insert(dic,word);
                    System.out.println("the word " + word + " is inserted in dictionary");
                    break;
                case 2 :
                    System.out.println("give word to search");
                    word= sc.next();
                    if(node.search(dic,word))
                    System.out.println("the word " + word + " is in dictionary");
                    else
                        System.out.println("the word " + word + " is not in dictionary");
                    break;
                case 3 :
                    System.out.println("give word to delete");
                    word=sc.next();
                    if(node.deleteword(dic,word))
                        System.out.println("the word "+ word + " is deleted");
                    else
                        System.out.println("the word "+ word + " may not be available in dic");
                    break;
            }
        }

    }
}