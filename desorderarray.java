import java.util.Scanner;
public class desorderarray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array  = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<array.length-1;i++)
        {
            //int max  = array[i];
            for(int j= i+1;j<array.length;j++)
            {
                if(array[i]<array[j])
                {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }

        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"  ");
        }

    }
    
}