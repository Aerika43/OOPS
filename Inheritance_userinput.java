package Opps;

import java.util.Scanner;

class Cal
{
    public int a,b,c;
    void getdata(int x,int y)
    {
        a = x;
        b = y;      
    } 
}
class Show1 extends Cal{
    
    public void show1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for Operation:\n 1:Adiition ; 2:Subraction; 3:Multiplication ; 4:Division");
        c = sc.nextInt();
        switch(c)
        {
        case 1:
        c = a + b;
        System.out.println("Addition: "+c);
        break;
        
        case 2:
        c = a - b;
        System.out.println("Subraction: "+c);
        break;
        
        case 3:
        c = a * b;
        System.out.println("Multiplication: "+c);
        break;
        
        case 4:
        c = a / b;
        System.out.println("Division: "+c);
        break;
        
        default:
            System.out.println("Invalid Operation");
        }
    }
}
public class Inheritance_userinput {
    public static void main(String[] args) {
        Show1 c = new Show1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int x = sc.nextInt();
        System.out.println("Enter a Number:");
        int y = sc.nextInt();
        c.getdata(x, y);
       // int c = sc.nextInt();
        c.show1();
        
    }
}
