interface Addition{
    void add(int n1,int n2);
}

class Calci{
    public static void Sum(int num1 , int num2) {
        System.out.println("Addition of " + num1 + " & " + num2 + " : " + (num1+num2));
    }
}

public class StaticMethodRef {

    public static void main(String[] args) {
        
        Calci.Sum(10, 10);
        // Refering to static method
        // Addition refer = Calci::Sum; //Method Reference
        // refer.add(10, 10);
    }

}