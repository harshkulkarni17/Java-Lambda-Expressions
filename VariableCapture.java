interface Student
{
    void marks();
}

public class VariableCapture {

    public int obtainmarks = 80; // Instance variable
    static int totalmarks = 100; // Static Variable

    public static void main(String[] args) {
        char grade = 'B'; // Local Variable
        Student student = () ->
        {   
            System.out.println("Total Marks : " + totalmarks);
            System.out.println("Obtained Marks : " + new VariableCapture().obtainmarks);
            System.out.println("Grade : " + grade);
        };
        student.marks();
    }
}

