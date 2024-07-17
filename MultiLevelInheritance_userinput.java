package Opps;

import java.util.Scanner;

class student
{
    public int roll;
           String name;
        void getdata(int x,String y)
        {
            roll = x;
            name = y;
        }
}
class details extends student
{
    public int hin,eng,maths;
    void studentMarks(int a,int b,int c)
    {
        hin = a;
        eng = b;
        maths = c;
    }
}
class shows extends details
{
    public void studentshow()
    {
        System.out.println("Roll no: "+roll);
        System.out.println("Name: "+name);      
        System.out.println("Hindi:"+hin);
        System.out.println("English: "+eng);
        System.out.println("Maths:"+maths);  
    }
}
public class MultiLevelInheritance_userinput {
    public static void main(String[] args) {
        shows s = new shows();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll no.");
        int x = sc.nextInt();
        System.out.println("Enter Name:");
        String y = sc.next();
        s.getdata(x,y);
        
        System.out.println("English:");
        int a = sc.nextInt();
        System.out.println("Hindi:");
        int b = sc.nextInt();
        System.out.println("Maths:");
        int c = sc.nextInt();
        
        s.studentMarks(a, b, c);
        s.studentshow();
    }
    
}
