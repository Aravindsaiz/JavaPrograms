import java.util.Scanner;
public class fibonacci 
{
    public static int storehouse [];
    public static int fibseries(int a,int b[])
    {
        if(a==0)
        return 0;
        else if(a==1)
        return 1;
        else
        {
            if(find(a)==0)
            {
                storehouse[a] = fibseries(a-1,b)+fibseries(a-2,b);
                //System.out.println("at "+a+" "+storehouse[a]);
                return fibseries(a-1,b)+fibseries(a-2,b);
            }
            else
            {
                return find(a);

            }
            
        }
        
    }
    public static int find(int n)
    {
        if(storehouse[n]!=0)
        return storehouse[n];
        else
        return 0;
    }

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        storehouse = new int[n];
        storehouse[0]=0;
        storehouse[1]=1;
        System.out.println(fibseries(n-1,storehouse));
    }
    
}