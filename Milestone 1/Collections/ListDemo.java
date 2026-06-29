import java.util.*;

class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C Programming");
        list.add("Data Structures");

        System.out.println("List Elements: " + list);

        System.out.println("First Element: " + list.get(0));

        list.remove("Python");

        System.out.println("After Removing Python: " + list);
    }
}
