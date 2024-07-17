package Opps;

//for specific exceptions

import java.util.Scanner;

public class for_specific_exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Number:52 ");
        int c[] = new int [10];
        try
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Addition is: "+(a/b));
            //c[13] = 3;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic error: "+e.getMessage());
        }
        System.out.println("this message id out of the code");
        
    }
}
