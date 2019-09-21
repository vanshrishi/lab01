package Lab01;


import java.util.Scanner;

public class context {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        scanner.nextLine().trim();
        Book[] books= new Book[n];
        for (int i =0;i<n;i++){
            String bookName =scanner.nextLine().trim();
            String authorName=scanner.nextLine().trim();
            String ISBN= scanner.nextLine().trim();
            books[i]=new Book(bookName,authorName,ISBN);
        }
        for (int i=0;i<books.length;i++){
            System.out.println(books[i]);

        }
        scanner.close();
    }
}