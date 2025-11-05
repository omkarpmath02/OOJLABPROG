import java.util.*;

class account {
    String name;
    String accno;
    String acctype;
    float balance;

account( String name, String accno,String acctype,int balance){
    this.name = name;
    this.accno = accno;
    this.acctype = acctype;
    this.balance = balance;
}

void deposit(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount to be deposited = ");
    int x = sc.nextInt();

    balance += x;
}

void display_details(){
    System.out.println("Name = "+ name);
    System.out.println("Balance = " + balance);
    System.out.println("accno = " + accno);
}
}



class savaccount extends account {

    savaccount( String name, String accno,String acctype,int balance){
        super(name, accno, acctype,balance);
    }

    void compoundinterest(float yrs, float r){
        System.out.println("Compound interest called");
        this.balance = this.balance*(float)(Math.pow((1.0+(r/100)), yrs)); 
    }

    void withdraw(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > balance){
            System.out.println("Insufficient Funds ");
        } else {
        balance = balance - a;
        }
    }
}



class curraccount extends account {
    static int minbalance = 10000;

    curraccount(String name, String accno,String acctype,int balance){
        super(name, accno, acctype,balance);
    }

     void withdraw(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > balance){
            System.out.println("Insufficient Funds ");
        } else if (balance < minbalance) {
            balance -=500;
            balance -= a;
        }   else {
        balance = balance - a;
        } 
    } 

    void cheque(){
        System.out.println("cheque is called");
        deposit();
    }
}




public class cycle5 {
    public static void main(String[] args) {

    curraccount c1 = new curraccount("parth", "1234", "tp", 15000);
    savaccount s1 = new savaccount("parv", "3456", "pt", 11000);

    c1.cheque();
    c1.deposit();
    c1.display_details();
    
    s1.deposit();
    s1.compoundinterest(2, 10);
    s1.display_details();

    }  
}
