import java.util.Scanner;
public class Calculator {
    public static void main(String args[])
    {


        int c=0;
        Scanner Sc=new Scanner(System.in);
        //System.out.println("(+,-,*,/,%)select a operator to perform the operation");
        //String op= Sc.nextLine();
        System.out.println("enter the first value");
        int a= Sc.nextInt();
        System.out.println("enter the second value");
       int  b=Sc.nextInt();
       String emt=Sc.nextLine();
        System.out.println("(+,-,*,/,%)select a operator to perform the operation");
        String op= Sc.nextLine();

        switch(op)
        {
            case "+":
                c=a+b;
                break;
            case "-":
                c=a-b;
                break;
            case "*":
                c=a*b;
                break;
            case "/":
                c=a/b;
                break;
            case "%":
                c=a%b;

                break;
            default:
                System.out.println("enter a valid operator");

        }
        System.out.println(c);


    }
}
