public class SCircle extends AbsShape{
    int r=4;
    public  void  calculate_area()
    {
        double area=3.14*r*r;
        System.out.println("area of circle is :"  + area);
    }
    public  void  calculate_peri()
    {
        double peri= 2*3.14*r;
        System.out.println("perimeter of circle is :" +peri);
    }
}
