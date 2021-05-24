
package Ques_3;

import java.util.Scanner;

class BookDetails {
private Book [] book=new Book[5];

public void setBooks()
{
    System.out.println("Enter Book Details : ");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter Book Number ");
        int bookNo=sc.nextInt();
        
        book[i].setBookNo(bookNo);
        System.out.println("Enter Book Title ");
        sc.nextLine();String title=sc.nextLine();
        book[i].setTitle(title);
        System.out.println("Enter Author ");
       sc.nextLine(); String author=sc.nextLine();
        book[i].setAuthor(author);
        System.out.println("Enter Book Publication ");
       sc.nextLine();  String publication=sc.nextLine();
        book[i].setPubliction(publication);
        System.out.println("Enter Book Price ");
        float price=sc.nextFloat();
        book[i].setPrice(price);
    }
}

public void printBooks()
{
    System.out.println("Book Details : ");
    for(int i=0;i<5;i++)
    {
        System.out.println((i+1)+"th BookNo is : "+book[i].getBookNo()+"\nBook Title : "+book[i].getTitle()+"\nBook Publication : "+book[i].getPublication()+"\nBook Author : "+book[i].getAuthor()+"\nBook Price : "+book[i].getPrice());
    }
}

public void searchBookByTitle(String title)
{
    int f=0;
    System.out.println("\n Search Book By Title in Process ");
    for(int i=0;i<5;i++)
    {
        if(book[i].getTitle()==title)
        {
           System.out.println((i+1)+"th BookNo is : "+book[i].getBookNo()+"\nBook Title : "+book[i].getTitle()+"\nBook Publication : "+book[i].getPublication()+"\nBook Author : "+book[i].getAuthor()+"\nBook Price : "+book[i].getPrice());
         f=1;
        }
    }
    if(f==0)
    {
        System.out.println("Book With this Title Does Not Exist");
    }
}
    

public void searchBookByAuthor(String author)
{
    int f=0;
    System.out.println("\n Search Book By Author in Process ");
    for(int i=0;i<5;i++)
    {
        if(book[i].getAuthor()==author)
        {
           System.out.println((i+1)+"th BookNo is : "+book[i].getBookNo()+"\nBook Title : "+book[i].getTitle()+"\nBook Publication : "+book[i].getPublication()+"\nBook Author : "+book[i].getAuthor()+"\nBook Price : "+book[i].getPrice());
         f=1;
        }
    }
    if(f==0)
    {
        System.out.println("Books of given Author Does Not Exist");
    }
}

}
