import java.util.Scanner;
public class Area {
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the length");
        double l=Sc.nextDouble();
        System.out.println("enter the breadth");
        double b=Sc.nextDouble();
        double a=0;
        a=l*b;
        double c= (int)a;
       System.out.println("area of the rectangle is"+ c);


    }
}
