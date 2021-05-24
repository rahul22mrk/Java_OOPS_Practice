
package java_lab_2.QUES_2;
class Fruit{
    public String taste,name;
    //public int size;
    public void eat(String name, String taste)
   {
   System.out.println("Name of the Fruit :"+ name);
   System.out.println("Taste of the Fruit is :"+ taste);
   }
}
class Apple extends Fruit
{
    
   @Override 
   public void eat(String name, String taste)
   {
      super.eat(name, taste);
  }
}
class Orange extends Fruit
{
     @Override 
  public void eat(String name, String taste)
   {
  
       super.eat(name, taste);
   }
}
public class Main {
    public static void main(String args[])
    {
        Fruit obj1 = new Apple();
        obj1.eat("Apple","Sweet");
        
        Fruit obj2 = new Orange();
        obj2.eat("Orange","Sour Soil");
    }
    
}
