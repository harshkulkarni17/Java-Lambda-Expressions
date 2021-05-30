interface Shape {
    void getMeasure();
}
public class LambdaApp_Zero_Params {
    public static void main(String[] args) {
        Shape triangle = () -> {
            int height = 4;
            int base = 3;
            System.out.println("Shape Triangle with Area : " + (base * height) / 2);
        };
        triangle.getMeasure();
    }
}
