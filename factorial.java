import java.util.Scanner;
public class factorial 
{
    public static int factori(int a)
    {
        if(a==1)
        return 1;
        else
        {
            System.out.print(a+" ");
            return a*factori(a-1);
        }
       
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factori(n));
        sc.close();
    }
    
}