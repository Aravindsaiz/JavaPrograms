import java.util.Scanner;
public class rearrangeArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in the array");
        int n  = sc.nextInt();
        int []array = new int[n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<array.length;i++)
        {
            array[i]  =sc.nextInt();
        }
        int size = array.length;
        int temp = 0;
        int min =0;
        int max =0;
      
        for(int i=0;i<size-1;i++)
    
        {
            if(i%2==0)// find max
            {
                max  = i;
                for(int j =i;j<size;j++)
                {
                    if(array[j]>array[max])
                    {
                        temp  = array[max];
                        array[max] = array[j];
                        array[j]  = temp;
                        
                        
                    }
                    
                }
                
                

            }
            
            if(i%2!=0)// find min
            {
                min  = i;
                for(int j =i;j<size;j++)
                {
                    if(array[j]<array[min])
                    {
                        temp  = array[min];
                        array[min] = array[j];
                        array[j]  = temp;
                        
                    }
                }
                
                
                

            }

        }

        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+"  ");
        }
        
    }
}