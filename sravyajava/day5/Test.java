public class Test {
    public static void main(String args[]){

            person p1=new person();
            p1.setName("sravya");
            p1.setAge(23);
            p1.setCountry("india");
            System.out.println(p1.getName()+ "age is:"+p1.getAge() +"country is:");

        Car c1=new Car();
        c1.setCar_name("BMW");
        c1.setModel_name("i5 sport");
        c1.setYear(2018);
        System.out.println(c1.getCar_name()+ "  model name is "+c1.getModel_name() + "car year is" + c1.getYear()+ c1.milage);

Student1 std=new Student1();
std.setStudent_name("vamshi");
std.setStudent_id(101);
std.setGrades(0);

System.out.println("name is"+ std.getStudent_name()+ "id is" + std.getStudent_id() + std.getGrades());


    }



    }

