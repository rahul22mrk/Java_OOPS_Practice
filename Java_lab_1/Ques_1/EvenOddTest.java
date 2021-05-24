
import java.util.Scanner;

public class EvenOddTest {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num=sc.nextInt();
        EvenOdd e=new EvenOdd();
        e.setNumber(num);
        e.checkEvenOdd();
        System.out.println("Number is : "+e.getNumber());
        if(e.getEvenOddN()==true)
            System.out.println("It is a Even Number");
        else
            System.out.println("It is  is a Odd NUmber");
    }
}
