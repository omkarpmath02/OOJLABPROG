import java.util.*;
abstract class shape {
    int a;
    int b;
    abstract void printarea();
}

class rectangle extends shape {
    void printarea(){
        System.out.println("enter rectangle dimensions ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("AREA RECT = " + a*b);
    }
}

class triangle extends shape {
    void printarea() {
        System.out.println("enter triangle dimensions ");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.println("AREA TRI = " + (0.5*base*h));
    }
}

class circle extends shape {
    void printarea(){
        System.out.println("enter circle dimensions ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        System.out.println("AREA CIRCLE = " + (3.14*r*r));
    }
}


public class hello {
    public static void main(String args[]){

        rectangle r1 = new rectangle();
        triangle t1 = new triangle();
        circle c1 = new circle();
        
        r1.printarea();
        t1.printarea();
        c1.printarea();
    }
}