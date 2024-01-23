public class Student1 {
    private int student_id;
    private String student_name;
    private int grades;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        if(grades>0) {
            this.grades=grades;

            }

        else
        {
            System.out.println("enter a positive number");
        }
    }

}
