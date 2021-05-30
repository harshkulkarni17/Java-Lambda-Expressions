interface Shape2 {
    void getMeasure(int length, int breadth);
}

public class LambdaApp_Mul_Params {
    public static void main(String[] args) {
        Shape2 rectangle = (length, breadth) -> {
            System.out.println("Shape Rectangle with Area : " + length * breadth + " sq. units");
        };
        rectangle.getMeasure(2,4);
    }
}
