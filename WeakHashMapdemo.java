import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapdemo {

    public static void main(String[] args) throws InterruptedException {
        // Strong reference map for comparison
        Map<Object, String> strongMap = new HashMap<>();

        // WeakHashMap: keys are weakly referenced
        Map<Object, String> weakMap = new WeakHashMap<>();

        // Creating keys
        Object Key1 = new Object();
        Object Key2 = new Object();

        //  entries in both maps
        strongMap.put(Key1, "StrongMap Value");
        weakMap.put(Key2, "WeakMap Value");

        System.out.println("Before nulling keys and GC:");
        System.out.println("StrongMap: " + strongMap);
        System.out.println("WeakMap: " + weakMap);

        // Removing  references
        Key1 = null;
        Key2 = null;

        // Suggesting garbage collection
        System.gc();

        // Giving GC some time
        Thread.sleep(1000);

        System.out.println("\nAfter GC and nulling keys:");
        System.out.println("StrongMap: " + strongMap); // Entry remains
        System.out.println("WeakMap: " + weakMap);     // Entry may be removed

       
    }
}