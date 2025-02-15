import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Book 1:");
        System.out.print("Type: ");
        String type1 = scanner.nextLine();
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        
        System.out.println("Book 2:");
        System.out.print("Type: ");
        String type2 = scanner.nextLine();
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Price: ");
        double price2 = scanner.nextDouble();
        
        Book book1 = (type1.equals("Fiction")) ? new Fiction(title1, author1, price1) : new NonFiction(title1, author1, price1);
        Book book2 = (type2.equals("Fiction")) ? new Fiction(title2, author2, price2) : new NonFiction(title2, author2, price2);
        
        if (book1 instanceof Fiction) {
            System.out.println("Fiction Book Details:");
        } else {
            System.out.println("Non-Fiction Book Details:");
        }
        book1.displayDetails();
        
        if (book2 instanceof Fiction) {
            System.out.println("Fiction Book Details:");
        } else {
            System.out.println("Non-Fiction Book Details:");
        }
        book2.displayDetails();
    }
}
