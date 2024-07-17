package Opps;

//MULTILEVEL INHERITANCE
class Student {

    public int roll;
    String name;

    void getdata(int x, String y) {
        roll = x;
        name = y;
    }
}

class Details extends Student {

    public int hin, eng, maths;

    void studentMarks(int a, int b, int c) {
        hin = a;
        eng = b;
        maths = c;
    }
}

class Shows extends Details {

    public void studentshow() {
        System.out.println("Roll no: " + roll);
        System.out.println("Name: " + name);
        System.out.println("English: " + eng);
        System.out.println("Hindi:" + hin);
        System.out.println("Maths:" + maths);
        
    }
}

public class MultiLevel_Inheritance {

    public static void main(String[] args) {
        Shows s = new Shows();
        s.getdata(1, "Aerika");
        s.studentMarks(98, 86, 92);
        s.studentshow();
    }
}
