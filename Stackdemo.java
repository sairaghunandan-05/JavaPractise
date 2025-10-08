

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack<Integer> stacknew = new Stack<>();

        stacknew.push(1);
        stacknew.push(2);
        stacknew.push(3);
        stacknew.push(4);
        stacknew.push(5);

        System.out.println(stacknew);
        Integer relement = stacknew.pop();
        System.out.println(stacknew);

        Integer peeks = stacknew.peek();

        System.out.println(peeks);

        System.out.println(stacknew);
        System.out.println(stacknew.isEmpty());
        System.out.println(stacknew.size());

        int search = stacknew.search(3);
        System.out.println(search);
     

        // linkedlist as stacknew

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        linkedList.getLast();// peek

        linkedList.removeLast(); //pop

        linkedList.size();
        linkedList.isEmpty();

        // arraylist as stacknew 

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.get(arrayList.size() - 1); // peek

        arrayList.remove(arrayList.size() - 1); // pop









    }
}