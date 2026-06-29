import java.util.*;

class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate (ignored)

        System.out.println("Set Elements: " + set);

        System.out.println("Contains 20? " + set.contains(20));

        set.remove(10);

        System.out.println("After Removing 10: " + set);
    }
}
