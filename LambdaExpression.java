
interface Classroom //When an interface will have exactly  1 abstract method we can say it as a Functional Interface
{
    // int Assignment(); // -> by default public abstract void OrderFood();
    // void Assignment(String type);
    void Assignment(String type, int Number);
}

public class LambdaExpression {
    public static void main(String[] args) {


        // Zero Parameter lambda function
        // Classroom classroom = () ->
        // {
        //     System.out.println("Succesfully Submitted !");
        //     return 12;
        // };

        // int NumberOfAssign =  classroom.Assignment();
        // System.out.println("Assignment Number : "+ NumberOfAssign);


        // One Parameter lambda function

    //    Classroom classroom = (type) ->
    //     {
    //         System.out.println(type + " Succesfully Submitted !");
    //     };
    //     classroom.Assignment("Assignment");



        // Multiple Parameter lambda function

       Classroom classroom = (type , Number) ->
        {
            System.out.println(type +" number "+ Number +" Succesfully Submitted !");

        };
        classroom.Assignment("Assignment" ,12);



    }
}
