import java.util.*;

public class LinkedListdemo {
    public static void main(String[] args) {
        // ways of creating linkedlist
        // 1. using constructor
        LinkedList<String> cities = new LinkedList<>();

        // 2. using Arrays.asList       
        List<String> arrayList = Arrays.asList("A", "B", "C");
        LinkedList<String> list2 = new LinkedList<>(arrayList);

        //3. using different objects as elements
        class Person {
            String name;
            Person(String name) { this.name = name; }
        }

        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Alice"));
        people.add(new Person("Bob"));


       

        //  Adding elements
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");

        //  Adding at first and last positions
        cities.addFirst("Bangalore");
        cities.addLast("Hyderabad");

        System.out.println("Cities list: " + cities);

        //  Removing elements
        cities.remove("Chennai");
        cities.removeFirst();
        cities.removeLast();

        System.out.println("After removals: " + cities);

        //  Accessing elements
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());
        System.out.println("City at index 1: " + cities.get(1));

        //  Updating elements
        cities.set(1, "Pune");
        System.out.println("After update: " + cities);

        //  Size 
        System.out.println("Size of the list: " + cities.size());

        //  Converting to array
        String[] cityArray = cities.toArray(new String[0]);
        System.out.println("Array from LinkedList: " + Arrays.toString(cityArray));

        //  Sorting 
        Collections.sort(cities);
        System.out.println("Sorted : " + cities);

        //  Sorting in reverse 
        cities.sort(Comparator.reverseOrder());
        System.out.println("Sorted in reverse : " + cities);

        //  Creating LinkedList from another collection
        List<String> moreCities = Arrays.asList("Ahmedabad", "Surat", "Jaipur");
        LinkedList<String> cityList = new LinkedList<>(moreCities);
        System.out.println("New LinkedList: " + cityList);
    }
}
