import java.io.*;

class WriteFile {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("student.txt");

            fw.write("Name : Krishna\n");
            fw.write("Roll No : 999");

            fw.close();

            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
