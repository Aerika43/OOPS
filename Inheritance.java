package Opps;
class Sum
{
    public int a,b;
    void getdata(int x,int y)
    {
        a = x;
        b = y;      
    } 
}
class Show extends Sum{
    public void show()
    {
        int c = a + b;
        System.out.println("Addition"+c);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Show s = new Show();
        s.getdata(2, 3);
        s.show();
    }
    
}
