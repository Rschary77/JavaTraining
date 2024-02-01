import java.util.Scanner;
public class TestEH2 {
    public static void main(String args[]) throws NovowelException
    {
        Scanner Sc=new Scanner(System.in);

        System.out.println("enter a string");
        String s=Sc.nextLine();
        StExc e= new StExc();
        e.vowels(s);


    }
}
