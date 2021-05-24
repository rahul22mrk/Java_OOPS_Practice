/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ques_3_updated;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class BookDetails {
    private Book [] book=new Book[5];

public void setBooks()
{
    System.out.println("Enter Book Details : ");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
        book[i]=new Book();
        System.out.println("Enter Book Number ");
        int bookNo=sc.nextInt();
        System.out.println("Enter Book Price ");
        float price=sc.nextFloat();
       System.out.println("Enter Book Title ");
        sc.nextLine();
        String title=sc.nextLine();
        
        System.out.println("Enter Author ");
       sc.nextLine(); 
       String author=sc.nextLine();
        
        System.out.println("Enter Book Publication ");
       
       String publication=sc.nextLine();
        

        book[i].setData(bookNo,title,author,publication, price);
        System.out.println("\n*****************************************************************************\n");
    }
}

public void printBooks()
{
    System.out.println("Book Details : ");
    for(int i=0;i<5;i++)
    {
        System.out.println("\n*****************************************************************************\n");
        System.out.println((i+1)+"th BookNo is : "+book[i].getBookNo()+"\nBook Title : "+book[i].getTitle()+"\nBook Publication : "+book[i].getPublication()+"\nBook Author : "+book[i].getAuthor()+"\nBook Price : "+book[i].getPrice());
       System.out.println("\n*****************************************************************************\n");
    }
}

public void searchBookByTitle(String title)
{
    int f=0;
    System.out.println("\n Search Book By Title in Process ");
    for(int i=0;i<5;i++)
    {System.out.println("\n*****************************************************************************\n");
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
    {System.out.println("\n*****************************************************************************\n");
        if(book[i].getAuthor()==author)
        {
           System.out.println((i+1)+"th BookNo is : "+book[i].getBookNo()+"\nBook Title : "+book[i].getTitle()+"\nBook Publication : "+book[i].getPublication()+"\nBook Author : "+book[i].getAuthor()+"\nBook Price : "+book[i].getPrice());
         f=1;
         break;
        }
    }
    if(f==0)
    {
        System.out.println("Books of given Author Does Not Exist");
    }
}
}
