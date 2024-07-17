package Opps;
//Mutiple Inheritance

interface square{
    public void sarea(int x);
}
interface circle{
    final double pi = 3.14;
    public void carea(double x);
}
interface rect{
    public void rct(int x,int y);
}
class area implements square, circle, rect{
    @Override
   public void sarea(int x)
    {
        System.out.println("Area of Square "+x*x);
    }
    @Override
     public void carea(double r)
    {
        System.out.println("Area of Cicle "+pi*r*r);
    }
    @Override
    public void rct(int x,int y)
    {
        System.out.println("Area of Rectangle "+(x*y));
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args) {
        area a = new area();
        a.carea(7);
        a.sarea(5);
        a.rct(2, 5);
    }
}
