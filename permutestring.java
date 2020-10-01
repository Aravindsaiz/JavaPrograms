import java.util.Scanner;
public class permutestring 
{
    public static int count =0;
    public static void permute(String s,int i,int f)
    {
        if(i==f)
        {
            System.out.println(s);
            count++;
        }
        
        else
        {
            for(int l=i;l<=f;l++)
            {
                s = swap(s,i,l);
                permute(s,i+1,f);
                s = swap(s,i,l);
            }
        }
    }
    public static String swap(String s,int i,int f)
    {
        char temp;
        char []Array  = s.toCharArray();
        temp = Array[f];
        Array[f] = Array[i];
        Array[i] = temp;
        return String.valueOf(Array);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        permute(str,0,len-1);
        System.out.println(count);

    }

    
}