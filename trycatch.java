package LAB7;

import java.util.Scanner;

class WrongAgeException extends Exception{
    WrongAgeException(String message){
        super(message);
    }
}

class father {
    int age;
    father(int age) throws WrongAgeException{
        if(age < 0){
            throw new WrongAgeException("Wrong Fathers age");
        }     
    
    this.age = age; 
    System.out.println("Fathers age ="+age);
} 
}


class son extends father{
    int sonage;

    son(int age, int sonage) throws WrongAgeException {
        super(age);

        if(sonage >= age){
            throw new WrongAgeException("Sons age cannot be more than fathers age");
        }

        if(sonage < 0){
            throw new WrongAgeException("Sons age cannot be less than zero");
        }
        this.sonage = sonage;
        System.out.println("Sons age ="+sonage);
        // System.out.println("Fathers age ="+age);
    }
}




public class trycatch {
    public static void main(String[] args) {
        int fage,sage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fathers age = ");
        fage = sc.nextInt();
        System.out.print("Enter sons age = ");
        sage = sc.nextInt();
        try{
            son s = new son(fage,sage);
        } catch(WrongAgeException e) {
            System.out.println("Exception caught\n"+ e.getMessage());
        }
    }
    
    
}
