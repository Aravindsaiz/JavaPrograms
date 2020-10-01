import java.util.Scanner;
public class diagonal 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3*3 matrix");
        int [][] matrix = new int[3][3];
    /**     for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int k =0;k<3;k++)
        {
            for(int i =0, j =k;i<3&&j<3;i++,j++)
            {
                System.out.print(matrix[i][j]+"  ");
                
            }
        } **/
        char c = 'A';
        int n = (int)c;
        System.out.println(n);
    }
    
}
