import java.util.Scanner;

class marks {

    // 1. Calculates grade for a single subject
    public int calculateGrade(int marks) {
        if (marks < 100 && marks >= 90) {
            return 10;
        } else if (marks < 90 && marks >= 80) {
            return 9;
        } else if (marks < 80 && marks >= 70) {
            return 8;
        } else if (marks < 70 && marks >= 60) {
            return 7;
        } else {
            System.out.println("Fail in subject with marks: " + marks);
            return 0;
        }
    }

    // 2. Calculates average and grade for three subjects
    public int calculateGrade(int marks1, int marks2, int marks3) {
        int average = (marks1 + marks2 + marks3) / 3;
        return calculateGrade(average);
    }

    // 3. Calculates grade based on overall percentage
    public int calculateGrade(double percentage) {
        if (percentage > 90) {
            return 10;
        } else if (percentage >= 80 && percentage <= 90) {
            return 9;
        } else if (percentage >= 70 && percentage < 80) {
            return 8;
        } else if (percentage >= 60 && percentage < 70) {
            return 7;
        } else {
            System.out.println("Fail based on overall percentage: " + percentage);
            return 0;
        }
    }
}

public class cg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for three subjects (out of 100):");

        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        marks m1 = new marks();

        System.out.println("Grade for subject 1: " + m1.calculateGrade(marks1));
        System.out.println("Grade for average of three subjects: " + m1.calculateGrade(marks1, marks2, marks3));

        double percentage = (marks1 + marks2 + marks3) / 3.0;
        System.out.println("Grade based on overall percentage (" + percentage + "%): " + m1.calculateGrade(percentage));

        sc.close();
    }
}
