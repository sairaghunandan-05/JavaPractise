import java.util.*;

public class Vectordemo {
    public static void main(String[] args) {
        //Creation of a Vector
        // 1. using constructor
        Vector<String> vector1 = new Vector<>();
        vector1.add("Apple");
        vector1.add("Banana");
        System.out.println("Vector1 : " + vector1);

        // 2. From another collection (ArrayList)
        List<String> arrayList = Arrays.asList("Cat", "Dog", "Elephant");
        Vector<String> vector2 = new Vector<>(arrayList);
        System.out.println("Vector2  : " + vector2);

        // 3. Using Arrays.asList
        Vector<String> vector3 = new Vector<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Vector3 : " + vector3);

        // 4. Using List.of 
        Vector<String> vector4 = new Vector<>(List.of("One", "Two", "Three"));
        System.out.println("Vector4 " + vector4);

        
        

        // Operations 

        vector1.add(0, "Mango"); // Add

        vector1.remove("Banana"); // Remove

        System.out.println("Vector1 : " + vector1);

        System.out.println("Vector 1 " + vector1.get(1)); // Accessing 

        vector1.set(1, "Strawberry"); // Update 

        System.out.println("Vector1 after set(): " + vector1);

        System.out.println("Size of vector1: " + vector1.size()); // size

        String[] array1 = vector1.toArray(new String[0]);//vector to array
        System.out.println("Array from vector1: " +array1);

        Collections.sort(vector1); // sortimg
        System.out.println("Sorted vector1 : " + vector1);

        vector1.sort(Comparator.reverseOrder()); // sorting in reverse
        System.out.println("Sorted vector in reverse: " + vector1);
    }
}
