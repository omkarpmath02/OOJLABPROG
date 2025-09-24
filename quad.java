
import java.util.*;

public class quad {
    public static void main(String[] args) {
        double a,b,c,D;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter coeff = ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();

        D=(b*b) - (4*a*c);
        
        if(D>0){
            double x1 = -b/(2*a) + Math.sqrt(D/2*a);
            double x2 = -b/(2*a) - Math.sqrt(D/2*a);
            System.out.println(x1);
            System.out.println(x2);
        } else if (D==0) {
            double x1 = -b/(2*a);
            double x2 = -b/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println("Imaginary Roots");
        }
    }
}
