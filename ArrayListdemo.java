import java.util.*;

public class ArrayListdemo {
    public static void main(String[] args) {
        //Different ways of creating an ArrayList
        // 1. using constructor
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Veggies");
        list1.add("Fruits");
        list1.add("Nuts");

        // 2.using Arrays.asList
        List<String> list2 = Arrays.asList("Pumpkin", "Watermelon", "Pista");

        // 3.  using List.of 
        List<String> list3 = List.of("Apple", "Orange", "Cashew");

        // Displaying all lists
        System.out.println("List1 : " + list1);
        System.out.println("List2 : " + list2);
        System.out.println("List3 : " + list3);

        // 4. size()
        System.out.println("Size of list1: " + list1.size());

        // 5. Using set() to update an element
        list1.set(1, "Melon"); 
        System.out.println("list1: " + list1);

        // 6. Converting list1 to array
        String[] array = list1.toArray(new String[0]);
        System.out.println("Array from list1: " + array);

        // 7. Sorting 
        Collections.sort(list1);
        System.out.println("Sorted list1: " + list1);

        // 8. Sorting in decending
        list1.sort(Comparator.reverseOrder());
        System.out.println("Sorted list1 in reverse : " + list1);
    }
}
