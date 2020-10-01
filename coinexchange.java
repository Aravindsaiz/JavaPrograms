import java.util.Scanner;
public class coinexchange {
    public static int nofways(int n)
    {
        int result = usecoin(1,n)+usecoin(2,n)+usecoin(5,n);
        return result;
    }
    public static int usecoin(int a,int b)
    {
        b = b-a;
        if(b==0)
        return 1;
        else if(b<0)
        return 0;
        else
        return nofways(b);
    }
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int sol = nofways(n);
        System.out.println(sol);
        sc.close();

    }
    
}