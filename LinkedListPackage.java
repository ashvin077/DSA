import java.util.LinkedList;

public class LinkedListPackage {
    public static void main(String[] args) {

        // declaration of an empty linked list
        LinkedList<String> list = new LinkedList<String>();

        // add element to list
        list.addFirst("a");     // add element at first of list
        list.addFirst("is");
//        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");   // add element at last of list
//        System.out.println(list);

        list.add("apple");       // by default, it adds elements at last
        list.size();            // it returns size of list

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" -> ");   // print all elements from list
        }

        System.out.println("null");

        System.out.println(list.get(2));    // returns element at index 2

        list.remove();  // removes first element of list
        list.remove("banana");   // removes 'apple' from list

        // list.clear(); // removes all the element from list, list will be empty after this call
        list.isEmpty();     // return true, if list doesn't contain any value
        list.contains("this"); // returns true if list contains specified value

        list.pop();     // remove and returns first element, equivalent to removeFirst()
        list.push("Hello");     // inserts element at front of the list, equivalent to addFirst()
    }
}
