import java.util.Random;
/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * Type of Bank Account.
     */
    public enum BankAccountType {
        /**Can draw from with card or check.*/
        CHECKINGS,
        /**Can only draw from manually.*/
        SAVINGS,
        /**Can only draw from manually.*/
        STUDENT,
        /**Can only draw from manually.*/
        WORKPLACE
    }

    /**
     * account number.
     */
    private int accountNumber;

    /**
     * account type.
     */
    private BankAccountType accountType;
    /**
     * balance.
     */
    private double accountBalance;
    /**
     * name.
     */
    private String ownerName;
    /**
     * interest rate.
     */
    private double interestRate;
    /**
     * earned interest.
     */
    private double interestEarned;

    /**
     * BankAccount constructor that sets name and type of account.
     * @param name name of account
     * @param accountCategory type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
    }
    public double getBalance() {
        return accountBalance;
    }
    public double setBalance(double input) {
        return input;
    }
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}