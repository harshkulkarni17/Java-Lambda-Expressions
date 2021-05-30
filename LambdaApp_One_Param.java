
interface Shape1 {
    void getMeasure(int side);
}
public class LambdaApp_One_Param {
    public static void main(String[] args) {
        Shape1 square = (side) -> {
            System.out.println("Shape Square with Area : " + side * side + " sq. units");
        };
        square.getMeasure(9);
    }
}
