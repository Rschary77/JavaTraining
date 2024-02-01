import java.util.Scanner;
public class TestEH1 {
    public static void main(String args[]) throws OddNumberException {
        Scanner Sc=new Scanner(System.in);
        IntExcep i=new IntExcep();
        System.out.println("enter a value of a:  ");
        int a=Sc.nextInt();
        i.oddnumber(a);


    }
}
