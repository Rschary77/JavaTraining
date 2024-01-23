import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        int n,f=1;
        Scanner Sc=new Scanner(System.in);
        System.out.println(" enter a number");
        n= Sc.nextInt();
        for( int i=1;i<=n;i++)
        {
            f=f*i;

        }
        System.out.println(f);



    }
}
