
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListdemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Carrot");
        shoppingList.add("Beetroot");
        shoppingList.add("Cucumber");
        System.out.println(" Shopping List: " + shoppingList);

        for (String element : shoppingList) {
            System.out.println(element);
            // Try to modify the list while reading
            if (element.equals("Carrot")) {
                shoppingList.add("Pumpkin");
                System.out.println("Added Pumpkin while reading.");
            }
        }
       
        System.out.println(" Shopping List new : " + shoppingList);

        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Ele1");
        sharedList.add("Ele2");
        sharedList.add("Ele3");


        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100); // Small delay 
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception : " + e);
            }
        });
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500); // Delay to allow reading to start first
                sharedList.add("Ele4");
                System.out.println("Added Ele4 ");

                Thread.sleep(500);
                sharedList.remove("Ele1");
                System.out.println("Removed Ele1 ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        readerThread.start();
        writerThread.start();

        



    }
}