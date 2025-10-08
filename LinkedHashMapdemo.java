

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapdemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true); // double linked list

        linkedHashMap.put("O", 180);
        linkedHashMap.put("A", 230);
        linkedHashMap.put("G", 240);

        linkedHashMap.get("A");
        linkedHashMap.get("O");
        linkedHashMap.get("G");
        linkedHashMap.get("A");
        linkedHashMap.get("O");
        linkedHashMap.get("A");
        linkedHashMap.get("G");

        for (Map.Entry<String, Integer> entryset : linkedHashMap.entrySet()) {
            System.out.println(entryset.getKey() + ": " + entryset.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Raghu", 91);
        hashMap.put("Nandan", 80);
        hashMap.put("Sai", 78);

        Integer res = hashMap.getOrDefault("V", 0);
        hashMap.put("Sai", 92);
        System.out.println(hashMap);

    }
}