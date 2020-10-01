import java.util.*;

class longestarraybinarysum
{
    public static void main(String[] args)
    {
        
        int [] a1  = {0,1,0,1,1,1,1};
        int [] a2  = {1,1,1,1,1,0,1};
        int  n = 7;
        int maxl = 0;
        int [] arr = new int[15];
        Arrays.fill(arr,-1);
        int pres1 = 0;
        int pres2 = 0;
        for(int i=0;i<n;i++)
        {
            pres1 += a1[i];
            pres2 += a2[i];
            int diff = pres1-pres2;
            int index = n+diff;
            if(diff==0)
            {
                maxl = i+1;

            }
            else if(arr[index]== -1)
            {
               arr[index] = i;

            }
            else
            {
                int len = i-arr[index];
                if(len>maxl)
                maxl = len;

            }
        }
        System.out.println(maxl);

     }

       

 

 }
