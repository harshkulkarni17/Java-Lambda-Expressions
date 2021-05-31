import java.util.*;
public class example2 {
    public static void main(String[] args) {
        //Prior to Java 8 
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
        for (String feature : features)
        { 
            System.out.println(feature); 
        } 

        //In Java 8:
        List<String> features1 = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features1.forEach(n -> System.out.println(n)); 
        
        //using method reference 
        features1.forEach(System.out::println);
    }
}
