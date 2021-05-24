
package java_lab_2.QUES_5;

import java.util.Scanner;

class Point
   {
      private int x;
      private int y;
      public int get_x()
      {
         return(x);
      }
      public int get_y()
      {
          return(y);
      }
      
      public void set_xy(int x,int y)
      {
          this.x=x;
          this.y=y;
      }
  }

class Line extends Point
{
    private Point point1;
    private Point point2;
    
    public Point get_point1()
    {
        return(point1);
    }
    public Point get_point2()
    {
        return(point2);
    }
    public void setter(Point p1,Point p2)
    {
        this.point1=p1;
        this.point2=p2;
    }
    
}
public class javaClass {
    public static void main(String[] args) {
     
        
        int x1,y1,x2,y2;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of x");
        x1= sc.nextInt();
        System.out.print("Enter value of y");
        y1 = sc.nextInt();
        
        
        Line obj1 = new Line();
        obj1.set_xy(x1, y1);
      
        
        System.out.print("Enter value of x");
        x2= sc.nextInt();
        System.out.print("Enter value of y");
        y2 = sc.nextInt();
        
        Line obj2 = new Line();
        obj2.set_xy(x2, y2);
         
        Line  obj = new Line();   
        // Create object for Line Class
          obj.setter(obj1, obj2);
        System.out.println("Two points are :");
        System.out.println("("+ obj.get_point1().get_x()+","+obj.get_point1().get_y()+")"+" and "+
       "("+ obj.get_point2().get_x()+","+obj.get_point2().get_y()+")" );
   }
}
