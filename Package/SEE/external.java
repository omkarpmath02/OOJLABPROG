package SEE;

import CIE.*;

public class external extends personal {
    
    public int[] seeMarks = new int[5];

    public external(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void setMarks(int[] marks) {
        if (marks.length == 5) {
            for (int i = 0; i < 5; i++) {
                seeMarks[i] = marks[i];
            }
        } else {
            System.out.println("Please enter marks for exactly 5 subjects.");
        }
    }

    void displayMarks() {
        System.out.print("SEE Marks: ");
        for (int m : seeMarks)
            System.out.print(m + " ");
        System.out.println();
    }
}
