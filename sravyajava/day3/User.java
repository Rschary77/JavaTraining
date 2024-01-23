import java.util.Scanner;
public class User {

        public static void main(String args[])
        {
            String name,email,city;
            long mobile_no;
            System.out.println("enter the details below");
            Scanner Sc=new Scanner(System.in);

            name = Sc.nextLine();
            mobile_no= Sc.nextLong();
            email=Sc.nextLine();
            city=Sc.nextLine();
            System.out.println("hi"+name+"!");
            System.out.println("the details you entered are:" + name+ "-"+mobile_no+email);
            System.out.println("-"+city);


        }
    }

