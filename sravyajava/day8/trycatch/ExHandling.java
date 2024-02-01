
    import java.util.Scanner;
    public class ExHandling {

        public static void main(String args[])
        {
            Scanner Sc=new Scanner(System.in);
            System.out.println("enter a value of a:  ");
            int a= Sc.nextInt();
            System.out.println("enter the value of b:  ");
            int b=Sc.nextInt();
            try
            {
                int c=a/b;
                System.out.println(c);
            }
            catch(ArithmeticException e){
                System.out.println("not possible to divide by zero");

            }
        }
}
