
import java.util.Scanner;

class marks{ 
    
public int cal_grade (int marks){
    if(marks < 100 && marks >= 90){
        return 10;
    } else if (marks <90 && marks >= 80){
        return 9;
    } else if (marks <80 && marks >= 70){
        return 8;
    } else if (marks <70 && marks >= 60){
        return 7;
    } else {
        System.out.print("fail");
        return 0;
    }
}


public int cal_grade (int marks1, int marks2, int marks3){
    int avg = (marks1+marks2+marks3)/3;
    return cal_grade(avg);
}

public int cal_grade(double per){ 
    if(per > 90){
        return 10;
    } else if (per >=80 && per<90){
        return 9;
    } else if (per <80 && per >= 70){
        return 8;
    } else if (per <70 && per >= 60){
        return 7;
    } else {
        System.out.println("fail");
        return 0;
    }
}

}

public class grade {
    public static void main(String[] args) {
        int marks1;
        int marks2;
        int marks3;
        double per;
        System.out.println("enter the marks");
        Scanner sc = new Scanner(System.in);
        marks1=sc.nextInt();
        marks2=sc.nextInt();
        marks3=sc.nextInt(); 
        per=sc.nextDouble();       

        marks m1 = new marks();
        
        int res = m1.cal_grade(marks1);
        System.out.println("result = " + res);

        System.out.println("result 2 ="+m1.cal_grade(marks1, marks2, marks3));
        System.out.println("result 3 ="+m1.cal_grade(per));
    }
}