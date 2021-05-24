
import java.util.Scanner;

public class EmployeeData {
 public static void main(String args[])
 {
        Scanner sc=new Scanner(System.in);
       
        Employee e1=new Employee();
          
        System.out.print("Enter The 1st Employee Number: ");
        int empNo=sc.nextInt();
        System.out.print("Enter The 1st Employee Name: ");
        sc.nextLine();
        String empname=sc.nextLine();
        System.out.print("Enter The 1st Employee Salary: ");
        int empSal=sc.nextInt();
         e1.setData(empNo, empname, empSal);
         
              Employee e2=new Employee();
          
        System.out.print("Enter The 2nd Employee Number: ");
        empNo=sc.nextInt();
            System.out.print("Enter The 2nd Employee Name: ");
          sc.nextLine();empname=sc.nextLine();
        System.out.print("Enter The 2nd  Employee Salary: ");
         empSal=sc.nextInt();
         e2.setData(empNo, empname, empSal);
         
              Employee e3=new Employee();
          
        System.out.print("Enter The 3rd Employee Number: ");
        empNo=sc.nextInt();
         System.out.print("Enter The 3rd Employee Name: ");
          sc.nextLine();empname=sc.nextLine();
        System.out.print("Enter The 3rd Employee Salary: ");
         empSal=sc.nextInt();
         e3.setData(empNo, empname, empSal);
              Employee e4=new Employee();
          
        System.out.print("Enter The 4th Employee Number: ");
        empNo=sc.nextInt();
         System.out.print("Enter The 4th Employee Name: ");
          sc.nextLine();empname=sc.nextLine();
        System.out.print("Enter The 4th Employee Salary: ");
        empSal=sc.nextInt();
        e4.setData(empNo, empname, empSal);
              Employee e5=new Employee();
          
        System.out.print("Enter The 5th Employee Number: ");
        empNo=sc.nextInt();
        System.out.print("Enter The 5th Employee Name: ");
         sc.nextLine(); empname=sc.nextLine();
        System.out.print("Enter The 5th Employee Salary: ");
        empSal=sc.nextInt();
        e5.setData(empNo, empname, empSal);
         System.out.println("\nFirst Employee Number is "+e1.getEmpNo()+"Employee Name is "+e1.getEmpName()+" and Salary is "+e1.getEmpSal());
         System.out.println("2nd Employee Number is "+e2.getEmpNo()+"Employee Name is "+e2.getEmpName()+" and Salary is "+e2.getEmpSal());
         System.out.println("3rd Employee Number is "+e3.getEmpNo()+"Employee Name is "+e3.getEmpName()+" and Salary is "+e3.getEmpSal());
         System.out.println("4th Employee Number is "+e4.getEmpNo()+"Employee Name is "+e4.getEmpName()+" and Salary is "+e4.getEmpSal());
         System.out.println("5th Employee Number is "+e5.getEmpNo()+"Employee Name is "+e5.getEmpName()+" and Salary is "+e5.getEmpSal());
 }
}
