package Opps;

import java.util.Scanner;

public class array_bound_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c[]=new int [10];
        try
        {
            c[13] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        sc.close();
    }
}
