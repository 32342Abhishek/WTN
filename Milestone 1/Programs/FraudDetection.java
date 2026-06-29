import java.util.*;

class Transaction {

    String sender;
    String receiver;
    double amount;
    int timestamp;

    Transaction(String sender, String receiver, double amount, int timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.timestamp = timestamp;
    }
}

public class FraudDetection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Transaction[] transactions = new Transaction[n];

        for (int i = 0; i < n; i++) {

            String sender = sc.next();
            String receiver = sc.next();
            double amount = sc.nextDouble();
            int timestamp = sc.nextInt();

            transactions[i] = new Transaction(sender, receiver, amount, timestamp);
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (transactions[i].sender.equals(transactions[j].sender)
                        && transactions[i].receiver.equals(transactions[j].receiver)
                        && transactions[i].amount == transactions[j].amount
                        && Math.abs(transactions[i].timestamp - transactions[j].timestamp) <= 60) {

                    System.out.println("=========================================================");

                    System.out.println(
                            transactions[i].sender + " "
                                    + transactions[i].receiver + " "
                                    + transactions[i].amount + " "
                                    + transactions[i].timestamp);

                    System.out.println(
                            transactions[j].sender + " "
                                    + transactions[j].receiver + " "
                                    + transactions[j].amount + " "
                                    + transactions[j].timestamp);

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Fraud Transactions");
        }

        sc.close();
    }
}
