package Ques_3;

class Book {
    
    private int bookNo;
    private String title;
    private String publication;
    private String author;
    private float price;
    
    
    public void setBookNo(int bookNo)
    {
        this.bookNo=bookNo;
    }
    
    public int getBookNo()
    {
        return bookNo;
    }
        
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return title;
    }
    
    
    public void setPubliction(String publication)
    {
        this.publication=publication;
    }
    public String getPublication()
    {
        return publication;
    }
    
    
    public void setAuthor(String author)
    {
       this.author=author;
    }
    public String getAuthor()
    {
        return author;
    }
    
    
    public void setPrice(float price)
    {
        this.price=price;
    }
     public float getPrice()
    {
        return price;
    }
    
}
