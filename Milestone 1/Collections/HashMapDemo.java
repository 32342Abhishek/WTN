import java.util.*;

class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Vamsi");
        students.put(102, "Kiran");
        students.put(103, "Shiva");

        System.out.println("Student Details: " + students);

        System.out.println("Student with ID 103: " + students.get(103));

        students.put(102, "Kiran Kumar");

        System.out.println("After Update: " + students);

        students.remove(101);

        System.out.println("After Removing 101: " + students);
    }
}
