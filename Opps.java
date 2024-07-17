package Opps;
class Add{
    int a,b,c;
    public void getdata(int x,int y)
    {
        a = x;
        b = y;
    }
    public void showdata()
    {
        c = a + b;
        System.out.println("Addition is:"+c);
    }
}
public class Opps {
    public static void main(String[] args) {
        Add a = new Add();
        a.getdata(8,2);
        a.showdata();
    }
}
