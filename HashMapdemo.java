

import java.util.*;

public class HashMapdemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>(17,0.5f);

        hashmap.put(3, "Raghu");
        hashmap.put(4, "Nandan");
        hashmap.put(2, "Sai");
        hashmap.put(2, "V");
        System.out.println(hashmap);

        String student = hashmap.get(3);
        System.out.println(student);

        String s = hashmap.get(69);
        System.out.println(s);

        System.out.println(hashmap.containsKey(2));
        System.out.println(hashmap.containsValue("Raghu"));

        for (int i : hashmap.keySet()) {
            System.out.println(hashmap.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = hashmap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toLowerCase());
        }
        System.out.println(hashmap);

//        hashmap.remove(31);
        boolean res = hashmap.remove(3, "Nitin");
        System.out.println("REMOVED  :" + res);
        System.out.println(hashmap);

        List<Integer> list = Arrays.asList(2, 4, 32, 43, 4, 432);
        list.contains(32);
    }
}