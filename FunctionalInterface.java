
interface  Food //When an interface will have exactly  1 abstract method we can say it as a Functional Interface
{
    void OrderFood(); // -> by default public abstract void OrderFood();
}

// class Zomato implements Food{
//    public void OrderFood() {
//        System.out.println("Order placed !! Arriving Soon !!");
//    }
// }

public class FunctionalInterface {

    public static void main(String[] args) {


        //1.
// 	Food food = new Zomato(); // Polymorphic statement
//    food.OrderFood();


        //2.
        // Anonymous Class Implementation
        // Food food = new Food() {
        //     @Override
        //     public void OrderFood() {
        //         System.out.println("Order placed !! Arriving Soon !!");
        //     }
        // };
        // food.OrderFood();

        //3.
    Food food = () -> // Function Implementation with lambda function
    {
        System.out.println("Order placed !! Arriving Soon !!");
    };
    food.OrderFood();
    }
}
