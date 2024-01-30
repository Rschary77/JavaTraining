public class STest {
    public static void main(String args[])
    {
        AbsShape T= new Triangle();
        AbsShape C=new SCircle();
        T.calculate_area();
        T.calculate_peri();
        C.calculate_area();
        C.calculate_peri();
    }
}
