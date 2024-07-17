package Opps;

// compile time error
//run time error

import java.util.Scanner;

public class compiletime_runtime_error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int c[] = new int [10];
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Addition is: "+(a/b));
            c[13] = 3;
        }
        catch (Exception e){
            System.out.println("Arithmetic error: "+e.getMessage());
        }
        System.out.println("this message is out side of the code");
        
    }    
}
