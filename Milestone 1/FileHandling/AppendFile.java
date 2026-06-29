import java.io.*;

class AppendFile {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("student.txt", true);

            fw.write("\nCourse Details : Java");

            fw.close();

            System.out.println("Data Appended Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
