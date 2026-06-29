import java.io.*;
import java.util.*;

class ReadFile {
    public static void main(String args[]) {
        try {
            File file = new File("student.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
