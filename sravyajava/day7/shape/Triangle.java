public class Triangle extends AbsShape {
    int b=4;
    int h=8;
    int x=6;
    int y=4;
    int z=2;
    public void calculate_area()
    {
        double area= 0.5*b*h;
        System.out.println("area of triangle is  :" +area);
    }
    public void calculate_peri()
    {

        int perimeter=x+y+z;
        System.out.println("perimeter of triangle is :" +perimeter);

    }
}
