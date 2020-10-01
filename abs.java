 class num
{
    public  void show()
    {

    }

}
class Integ extends num
{
    public void show()
    {
        System.out.println("printing from Integ");
    }
}


class Doub extends num
{
    public void show()
    {
        System.out.println("printing from Double");
    }
 

}
class experiment2
{
    public void print(num obj)
    {
        obj.show();
    }
}
public class abs 
{
    public static void main(String[] args)
    
    {
        num obj1 = new Integ();
        num obj2 = new Doub();
        experiment2 k = new experiment2();
        k.print(obj1);
        k.print(obj2);

         


    }

    
}