
package java_lab_2.QUES_3.Main;

class Shape{
    public void draw()
    {
        System.out.println("Drawing Shape");
    }
    public void erase()
    {
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape{
     public void draw()
    {
        System.out.println("Drawing Circle");
    }
    public void erase()
    {
        System.out.println("Erasing Circle\n");
    }
}
class Triangle extends Shape{
   public void draw()
    {
        System.out.println("Drawing Triangle");
    }
    public void erase()
    {
        System.out.println("Erasing Triangle\n");
    }  
}
class Square extends Shape{
     public void draw()
    {
        System.out.println("Drawing Square");
    }
    public void erase()
    {
        System.out.println("Erasing Square\n");
    }
}
public class main {
    public static void main(String args[])
    {
       
        Circle c=new Circle();
        c.draw();
        c.erase();
        Triangle t=new Triangle();
        t.draw();
        t.erase();
        Square s=new Square();
        s.draw();
        s.erase();
    }
}
