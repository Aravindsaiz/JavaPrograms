import java.util.Scanner;
public class reversewithpreserve 
{
    public static String reverseString(String s)
    {
        int length = s.length();
        String s1 ="";
        for(int i=length-1;i>=0;i--)
        {
            s1 = s1+s.charAt(i);
        }
        return s1;
    }
    public static void main(String [] args)
    {
        //Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        String s = "I am not String";
        String [] array = s.split(" ");
        int k=0;
        int index = array[k].length();
        for(int i =0;i<array.length;i++)
        {
            array[i] = reverseString(array[i]);
        }
        String s1 ="";
        for(int i =array.length-1;i>=0;i--)
        {
            for(int j =0;j<array[i].length();j++)
            {
                if(s1.length()==index)
                {
                    s1  = s1+" ";
                    k++;
                    index = index+array[k].length()+1;
                    j--;
                }
                else
                {
                    s1 = s1+array[i].charAt(j);
                   

                }
                
            }

        }

        System.out.println(s1);
    }
    
}