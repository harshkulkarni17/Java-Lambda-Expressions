
interface ComparatorTask {
   public boolean compare(int t1, int t2);
}
public class lambdaobject {
   public static void main(String[] args) {
      ComparatorTask ctask = (int t1, int t2) -> {return t1 > t2;}; // lambda expression
      boolean b = ctask.compare(10, 3);
      System.out.println("The result is: " + b);
   }
}