package collection;
import java.time.LocalDate;

public class Transaction {

    // Data members
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

    // Getters and Setters

    public int getTxId() {
        return txId;
    }

    public void setTxId(int txId) {
        this.txId = txId;
    }

    public LocalDate getTxDate() {
        return txDate;
    }

    public void setTxDate(LocalDate txDate) {
        this.txDate = txDate;
    }

    public float getTxAmount() {
        return txAmount;
    }

    public void setTxAmount(float txAmount) {
        this.txAmount = txAmount;
    }

    public boolean isTxStatus() {
        return txStatus;
    }

    public void setTxStatus(boolean txStatus) {
        this.txStatus = txStatus;
    }

    public boolean isTxArrears() {
        return txArrears;
    }

    public void setTxArrears(boolean txArrears) {
        this.txArrears = txArrears;
    }
}

