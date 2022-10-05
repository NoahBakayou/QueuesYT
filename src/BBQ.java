import java.util.LinkedList;
import java.util.Queue;

//https://www.youtube.com/watch?v=91CMnJeHJVc
//lol funny class name get it
public class BBQ {
    public static void main(String[] args) {

//      Queue<String> bbqLine = new LinkedList();
//      Any other object you use itself but Queue is related to linked list (just the way it is)
//
//        bbqLine.add("Jackson");
//        bbqLine.add("Tyreek");
//        bbqLine.add("Susan");
//
//        bbqLine.poll();
//        bbqLine.poll();
//
//        System.out.println(bbqLine.peek());
//
//        System.out.println(bbqLine);

//****** Everything above this line is from first 5 mins of YT Vid ******

        Queue<String> q = new LinkedList <String>(); //Queue and LinkedLisst are related

        q.add("A");
        q.add("B");
        q.add("C");

        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.toArray()[1]); //converts to array

    // Diff between Queue and Linked List.
        // Linked list is dis-contiguous while Queue is Contiguous

    }
}
