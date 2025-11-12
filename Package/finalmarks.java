import java.util.*;
import CIE.*;
import SEE.*;




public class finalmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        personal[] p = new personal[n];
        internals[] in = new internals[n];
        external[] ex = new external[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            p[i] = new personal(usn, name, sem);
            in[i] = new internals();
            ex[i] = new external(usn, name, sem);

            int[] inMarks = new int[5];
            int[] exMarks = new int[5];

            System.out.println("Enter 5 internal marks: ");
            for (int j = 0; j < 5; j++)
                inMarks[j] = sc.nextInt();
            in[i].setmarks(inMarks);

            System.out.println("Enter 5 SEE marks: ");
            for (int j = 0; j < 5; j++)
                exMarks[j] = sc.nextInt();
            ex[i].setMarks(exMarks);
        }

        System.out.println("\n----- FINAL MARKS OF STUDENTS -----");
        for (int i = 0; i < n; i++) {
            p[i].display();
            System.out.println("Final Marks (out of 100 per subject): ");
            for (int j = 0; j < 5; j++) {
                int finalMark = in[i].internalmarks[j] + (ex[i].seeMarks[j] / 2);
                System.out.print(finalMark + " ");
            }
            System.out.println("\n-----------------------------------");
        }
        sc.close();
    }
}
