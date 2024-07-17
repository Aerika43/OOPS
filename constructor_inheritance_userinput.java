package Opps;

import Practice.*;
import java.util.Scanner;

class empdataa{
    public int empno;
    public String name;
    public empdataa(int x,String y)
    {
        empno = x;
        name = y;
    }
}
class empdetailss extends empdataa{
    public int age,sal;
    long ctcNo;
    public empdetailss(int x,String y,int a,int s,long n)
    {
        super(x,y);
        age = a;
        sal = s;
        ctcNo = n;
    }
}
class showsEmpp extends empdetailss{
    public showsEmpp(int x,String y,int a,int s,long n){
        super(x ,y ,a ,s ,n );
    }
    
    public void display()
    {
        System.out.println("Employee Id "+empno);
        System.out.println("Employee Name "+name);
        System.out.println("Age "+age);
        System.out.println("Contact Number "+ctcNo);
        System.out.println("Salary "+sal);
    }
}
public class constructor_inheritance_userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Id ");
        int x = sc.nextInt();
        System.out.println("Employee Name ");
        String y = sc.next();
        System.out.println("Age "); 
        int a = sc.nextInt();
        System.out.println("Salary ");
        int s = sc.nextInt(); 
        System.out.println("Contact Number ");
        long n = sc.nextLong();
       showsEmpp z = new showsEmpp(x ,y ,a ,s ,n ); 
       z.display();
    }
}


