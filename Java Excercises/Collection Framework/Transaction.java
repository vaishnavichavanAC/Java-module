
package collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

class Transaction {

    private int txId;
    private LocalDate txDate;
    private float txAmount;
    private boolean txStatus;
    private boolean txArrears;

    // Constructor
    public Transaction(int txId, LocalDate txDate, float txAmount,
                       boolean txStatus, boolean txArrears) {

        this.txId = txId;
        this.txDate = txDate;
        this.txAmount = txAmount;
        this.txStatus = txStatus;
        this.txArrears = txArrears;
    }

    // Getters
    public int getTxId() {
        return txId;
    }

    public LocalDate getTxDate() {
        return txDate;
    }

    public float getTxAmount() {
        return txAmount;
    }

    public boolean isTxStatus() {
        return txStatus;
    }

    public boolean isTxArrears() {
        return txArrears;
    }
}

public class TransactionMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Collection Framework
        ArrayList<Transaction> transactions = new ArrayList<>();

        // Taking input for 5 transactions
        for (int i = 1; i <= 5; i++) {

            System.out.println("\nEnter details for Transaction " + i);

            System.out.print("Enter Transaction ID: ");
            int txId = sc.nextInt();

            System.out.print("Enter Transaction Date (yyyy-mm-dd): ");
            String date = sc.next();

            LocalDate txDate = LocalDate.parse(date);

            System.out.print("Enter Transaction Amount: ");
            float txAmount = sc.nextFloat();

            System.out.print("Enter Transaction Status (true/false): ");
            boolean txStatus = sc.nextBoolean();

            System.out.print("Enter Transaction Arrears (true/false): ");
            boolean txArrears = sc.nextBoolean();

            // Create Transaction object
            Transaction transaction = new Transaction(
                    txId,
                    txDate,
                    txAmount,
                    txStatus,
                    txArrears
            );

            // Store object in Collection
            transactions.add(transaction);
        }

        // Lambda expression using Consumer
        Consumer<Transaction> displayTransaction = (transaction) -> {

            System.out.println("Transaction ID: "
                    + transaction.getTxId());

            System.out.println("Transaction Date: "
                    + transaction.getTxDate());

            System.out.println("Transaction Amount: "
                    + transaction.getTxAmount());

            System.out.println("Transaction Status: "
                    + transaction.isTxStatus());

            System.out.println("Transaction Arrears: "
                    + transaction.isTxArrears());

            System.out.println("----------------------------");
        };

        // Apply Lambda to every Transaction object
        System.out.println("\n========== TRANSACTIONS ==========");

        transactions.forEach(displayTransaction);

        sc.close();
    }
}

