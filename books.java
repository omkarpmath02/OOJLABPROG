
import java.util.Scanner;

class book {
    String name;
    String author;
    float price;
    int num_pages;

    // public  book(){
    // }

    public book() {
        this.name = null;
        this.author = null;
        this.price = 0.0f;
        this.num_pages = 0;
    }

    void get_details(){
        Scanner sc = new Scanner(System.in);  
        System.out.println();    
        System.out.print("Ente name = ");
        this.name = sc.nextLine();
        System.out.print("Emter author name = ");
        this.author=sc.nextLine();
        System.out.print("Enter Price = ");
        this.price=sc.nextFloat();
        System.out.print("Enter no of pages = ");
        this.num_pages=sc.nextInt();
    }

    void tostring(){
        System.out.println();
        System.out.println("name = " +name);
        System.out.println("author = " +author);
        System.out.println("price = " +price);
        System.out.println("no of pages = " +num_pages);
    }
}



public class books {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no of books = ");  
        int n;
        n=sc.nextInt();
        // for(int i=0; i<n; i++){
        // book b1[] = new book();
        // }

        book[] b1 = new book[n];

        for(int i=0; i<n; i++){   
            b1[i] = new book(); 
            b1[i].get_details();
        }

        System.out.println("Details of the books are ");
        for(int i=0; i<n; i++){
            b1[i].tostring();
        }
    }
}
