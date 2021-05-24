
package java_lab_2.QUES_5;

import java.util.Scanner;

 class Point
   {
      private int x;
      private int y;
      public int getX()
      {
         return(x);
      }
      public int getY()
      {
          return(y);
      }
      
      public void setXY(int x,int y)
      {
          this.x=x;
          this.y=y;
      }
  }

class Line extends Point
{
    private Point point1;
    private Point point2;
    
    public Point getPoint1()
    {
        return(point1);
    }
    public Point getPoint2()
    {
        return(point2);
    }
    public void setter(Point p1,Point p2)
    {
        this.point1=p1;
        this.point2=p2;
    }
    
}
public class TestLine {
     public static void main(String args[])
    {
        int x1,y1,x2,y2;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of x");
        x1= sc.nextInt();
        System.out.print("Enter value of y");
        y1 = sc.nextInt();
        
        
        Line obj1 = new Line();
        obj1.setXY(x1, y1);
      
        
        System.out.print("Enter value of x");
        x2= sc.nextInt();
        System.out.print("Enter value of y");
        y2 = sc.nextInt();
        
        Line obj2 = new Line();
        obj2.setXY(x2, y2);
         
        Line  obj = new Line();   
        // Create object for Line Class
          obj.setter(obj1, obj2);
        System.out.println("Two points are :");
        System.out.println("("+ obj.getPoint1().getX()+","+obj.getPoint1().getY()+")"+" and "+
       "("+ obj.getPoint2().getX()+","+obj.getPoint2().getY()+")" );
    }
}
