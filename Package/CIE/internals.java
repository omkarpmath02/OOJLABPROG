package CIE;

public class internals {
    public int[] internalmarks = new int[5];

    public void setmarks(int[] marks){
        if(marks.length == 5){
            for(int i=0; i<5; i++){
                internalmarks[i] = marks[i];
            }
        } else {
            System.out.println("please enter for 5 subjects");
        }
    }

    void displayMarks() {
        System.out.print("Internal Marks: ");
        for (int m : internalmarks)
            System.out.print(m + " ");
        System.out.println();
    }


}
