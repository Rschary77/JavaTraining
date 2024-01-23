import java.util.Scanner;
public class Marks {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the first subject marks");
        int s1 = Sc.nextInt();
        System.out.println("enter the second subject marks");
        int s2 = Sc.nextInt();
        System.out.println("enter the final subject marks");
        int s3 = Sc.nextInt();
        if (s1 == 100 & s2 == 100 & s3 == 100) {

            int total = s1 + s2 + s3;
            System.out.println("total is" + total);
            float percentage = ((s1 + s2 + s3) / total) * 100;
            System.out.println("percentage is" + percentage + "%");


        } else {
            System.out.println("robert is fail");
        }
    }
}
