import java.util.Scanner;
class Node2
{
    Node2 left;
    int  data;
    Node2 right;
}
public class doublell 
{
    public static Node2 head;
    public static Node2 tail;
    public static void createList(int d)
    {
        if(head.data==0)
        {
            head.data=d;
            head.right = null;
            System.out.println("head created");
            
        }
        else
        {
            insertList(d);
        }

    }
    public static void insertList(int d)
    {
        Node2 temp = head;
    
        while(temp.right!=null)
        {
            
            temp = temp.right;
            
        }
        System.out.println();
        Node2 temp2 = new Node2();
        temp2.left = temp;
        temp.right = temp2;
        temp2.data = d;
        temp2.right = null;
    }
    public static void printList()
    {
        Node2 temp = head;
        while(temp.right!=null)
        {
            System.out.print(temp.data+"  ");
            temp  = temp.right;
        }
        System.out.print(temp.data);
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        head = new Node2();
        head.data = 0;
        createList(10);
        insertList(30);
        insertList(20);
        printList();
      
        

    }
    
}