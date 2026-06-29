import java.util.*;

class GymMembership {

    static int cost = 0;

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter No.of Months");
        int months = s.nextInt();

        while (months >= 12) {
            cost += 15000;
            months -= 12;
        }

        switch (months) {
            case 3:
                cost += 5000;
                System.out.println("Cost : " + cost);
                break;

            case 6:
                cost += 7000;
                System.out.println("Cost : " + cost);
                break;

            case 9:
                cost += 9000;
                System.out.println("Cost : " + cost);
                break;

            case 12:
                cost += 12000;
                System.out.println("Cost : " + cost);
                break;

            default:
                System.out.println("Error");
        }

        s.close();
    }
}
