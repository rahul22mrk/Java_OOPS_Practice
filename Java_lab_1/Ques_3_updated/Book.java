/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ques_3_updated;

class Book {
    
    private int bookNo;
    private String title;
    private String publication;
    private String author;
    private float price;
    public void setData(int bookNo,String title,String author,String publication,float price)
    {
        this.bookNo=bookNo;
        this.title=title;
       this.publication=publication;
       this.author=author;
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
