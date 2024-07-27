package Opps;

import java.util.Scanner;

class fact 
{
    public int fct(int n)
    {
        if(n==1)       
            return 1;     
        else
            return (n * fct(n - 1));
    }
}
public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for a factorial " + "");
        int n = sc.nextInt();
        fact f = new fact();
        System.out.println("Factorial is " + f.fct(n));
    }
}
