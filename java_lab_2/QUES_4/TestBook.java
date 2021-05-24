
package java_lab_2.QUES_4;

import java.util.Scanner;

class Book{
    private int bookNo;
    private String title;
    private String publication;
    private String author;
    private float price;
    
    public void setData(int bookNo,String title,String publication,String author,float price)
    {
        this.author=author;
        this.bookNo=bookNo;
        this.title=title;
        this.publication=publication;
        this.price=price;
    }
    public int getBookNo()
    {
        return bookNo;
    }
    public String getTitle()
    {
        return title;
    }
    public String getPublication()
    {
        return publication;
    }
    public String getAuthor()
    {
        return author;
    }
    public float getPrice()
    {
        return price;
    }
}

class Computer extends Book
{
    private String type;
    public void setComputerBookData(String type)
    {
        this.type=type;
    }
    public String getComputerBookData()
    {
        return type;
    }
  
}

class Mathematics extends Book
{
    private String type;
    public void setMathsBookData(String type)
    {
        this.type=type;
    }
    public String getMathsBookData()
    {
        return type;
    }
    
    
}
public class TestBook {
    public static void main(String args[])
    {
        Computer c=new Computer();
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Computer Book Type : ");
        String compType=sc.next();
       
        c.setComputerBookData(compType);
       
       
       String publication;
       String author;
      float price;
        System.out.print("Enter the BookNo : ");
        int bookNo=sc.nextInt();
        System.out.print("Enter The Title : ");
        String title=sc.next();
        System.out.print("Enter the Book Publication : ");
        publication=sc.next();
        System.out.print("Enter The Name Of Author : ");
        author=sc.next();
        System.out.print("Enter the Book Price ");
        price=sc.nextFloat();
        c.setData(bookNo, title, publication, author, price);
      
        System.out.println("\n*************************************************************\n"+"\nBook Numbr is : "+c.getBookNo()+"\nBook Title is : "+c.getTitle()+"\nBook Type is : "+c.getComputerBookData()+"\nBook Publication is : "+c.getPublication()+"\nBook Author is : "+c.getAuthor()+"\nBook Price is : "+c.getPrice());
    
        System.out.println("\n\n*******************************************\n\n");
        Mathematics m =new Mathematics();
        
         System.out.print("Enter The Maths Book Type : ");
        String MathBookType=sc.next();
        m.setMathsBookData(MathBookType);
        
        System.out.print("Enter the Maths BookNo : ");
         bookNo=sc.nextInt();
        System.out.print("Enter The Math Book Title : ");
        title=sc.next();
        System.out.print("Enter the Math Book Publication : ");
        publication=sc.next();
        System.out.print("Enter The Name Of Author : ");
        author=sc.next();
        System.out.print("Enter the Book Price ");
        price=sc.nextFloat();
        m.setData(bookNo, title, publication, author, price);
      
        System.out.println("\n*************************************************************\n"+"\nBook Numbr is : "+m.getBookNo()+"\nBook Title is : "+m.getTitle()+"\nBook Type is : "+m.getMathsBookData()+"\nBook Publication is : "+m.getPublication()+"\nBook Author is : "+m.getAuthor()+"\nBook Price is : "+m.getPrice());
    
    }
    
}
