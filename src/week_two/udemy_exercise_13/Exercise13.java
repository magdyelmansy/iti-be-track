import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println("Original List: "+products);

        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        List<String> filtered = products.stream().filter(p -> p.length() > 5).map(String::toUpperCase).sorted().toList();

        System.out.println("Filtered Products: "+filtered);
        // TODO: Print the filtered list
    }
}