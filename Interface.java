package Opps;
/* Abstraction : data hiding
types: 1. interface
          we can achieve 100% abstraction
          we cant define body of the class and method

        abstract method
       2. abstract class and abstract method
          we can achieve 0-100%
          we can create abstract and also concrete method 
          we can define te body  */
abstract class Vehical
{
    int tyres;
    abstract public void start();
    public void body()
    {
        System.out.println("Hello World");    
    }
}
class Bike extends Vehical
{
    @Override
    public void start()
    {
        tyres = 2;
        System.out.println("Bike have "+tyres+" tyres");
        System.out.println("Bike starts with kicks");
    }
}
class Cars extends Vehical
{
    @Override
    public void start()
    {
        tyres = 4;
        System.out.println("Car have "+tyres+" tyres");
        System.out.println("Cars starts with keys");
    }
}

public class Interface {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        
        Cars c = new Cars();
        c.start();
    }
}
