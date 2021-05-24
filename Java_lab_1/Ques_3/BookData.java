
package Ques_3;

import java.util.Scanner;

public class BookData {
   public static void main(String args[])
   {
       BookDetails bd=new BookDetails();
       bd.setBooks();
       bd.printBooks();
      
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title for Searching bookDetailsByTitle ");
       sc.nextLine();String title=sc.nextLine();
       bd.searchBookByTitle(title);
        System.out.println("Enter the title for Searching bookDetailsByTitle ");
       sc.nextLine();String author=sc.nextLine();
       bd.searchBookByAuthor(author);
       
   }
}
