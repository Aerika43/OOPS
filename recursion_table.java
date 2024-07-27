package Opps;

import java.util.Scanner;
class table
{
    public void table(int t,int i)
    {
        if(i<=10)  
        {   
            System.out.println(t*i); 
            table(t,i+1);
        }

    }
}
public class recursion_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number for Table");
        int t = sc.nextInt();
        table a = new table();
        a.table(t,1);
    }  
}
