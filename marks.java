
import java.util.Scanner;

class student {
    int USN;
    String name;
    int[] credits;
    int[] marks; 
    int n;

    void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter the name = ");
        this.name = sc.nextLine();
        System.out.print(" enter the USN = ");
        this.USN = sc.nextInt();
        System.out.print(" enter the no of subjects = ");
        n=sc.nextInt();
        this.credits= new int[n];
        this.marks= new int[n];
        System.out.println(" enter the CREDITS and MARKS resp = ");
        for(int i=0;i<n;i++){
            this.credits[i] = sc.nextInt();
            this.marks[i] = sc.nextInt();
        }
    }

    void display(){
        System.err.println("");
        System.out.println("USN = "+ USN);
        System.out.println("name = " +name);
        for (int i=0;i<n;i++){
        System.out.print(credits[i]+ "\t");
        System.out.println(marks[i]);
        }
    SGPA();
    }

    void SGPA(){
        double total_numer=0, total_credits=0;
        double SGPA;
        for(int i=0;i<n;i++){
            int sum = credits[i] * ((marks[i]+10)/10);
            total_numer+=sum;
        }

        for(int i=0;i<n;i++){
            total_credits+=credits[i];
        }

        SGPA = (total_numer/total_credits);
        System.out.println("SGPA =" +SGPA);
}
}

public class marks{
    public static void main(String args[]){
        student s1 = new student();
        s1.input();
        s1.display();
    }

}
