import java.util.*;

class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Item-1");
        queue.add("Item-2");
        queue.add("Item-3");

        System.out.println("Queue: " + queue);

        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue After Poll: " + queue);

        System.out.println("Front Element: " + queue.peek());
    }
}
