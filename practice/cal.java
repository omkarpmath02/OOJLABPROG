import java.util.Scanner;

class time {
    int hours;
    int min;

time(int hours, int min){
    this.hours=hours;
    this.min=min;
}

void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter time in hours and min");
    hours = sc.nextInt();
    min = sc.nextInt();
}

void display(){
    System.out.println("hours = "+hours);
    System.out.println("min= " + min);
}

void add(time t1, time t2){
    int totalmin= t1.min + t2.min; 
    int totatlhr= t1.hours + t2.hours + totalmin/60;
    totalmin = totalmin%60;

    time t3 = new time(totatlhr,totalmin); 
    t3.display();
}
}


public class cal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter time in hours and min= ");
        int hours = sc.nextInt();
        int min = sc.nextInt();

        System.out.print("enter time 2 in hours and min= ");
        int hours2 = sc.nextInt();
        int min2 = sc.nextInt();
        time t1 = new time(hours, min);
        time t2 = new time(hours2, min2);

        t1.add(t1, t2);
        
    }    
}

