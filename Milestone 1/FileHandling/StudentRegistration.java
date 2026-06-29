import java.io.*;
import java.util.*;

class StudentRegistration {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        int id = sc.nextInt();

        System.out.println("Enter Student User Name:");
        String name = sc.next();

        System.out.println("Enter Student Course:");
        String course = sc.next();

        System.out.println("Enter Mobile Number:");
        String mobile = sc.next();

        System.out.println("Enter Password:");
        String password = sc.next();

        try {
            FileWriter fw = new FileWriter("students.txt", true);

            fw.write(id + "," + name + "," + course + "," + mobile + "," + password + "\n");

            fw.close();

            System.out.println("Registration Successful!!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
