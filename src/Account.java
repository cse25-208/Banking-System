import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {

	private String accountNumber;
	private BigDecimal balance = BigDecimal.ZERO;
	private int branch;
	private int accountStatus;
	private LocalDate dateOpened;

	public BigDecimal checkBalance() {
		return balance;
	}

	/**
	 * 
	 * @param amount
	 */
	public void deposit(BigDecimal amount) {
	if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0){
		throw new IllegalArgumentException("Amount must be positive");
	}
	  balance = balance.add(amount);

	}

	/**
	 * 
	 * @param amount
	 */
	public void withdraw(BigDecimal amount) {
		if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Amount must be positive");
	}
	   if (amount.compareTo(balance) > 0) {
		 throw new IllegalArgumentException("Insufficient funds");
	   }
	   
	     balance = balance.subtract(amount);
	}

	/**
	 * 
	 * @param amount
	 * @param toAccount
	 */
	public void transfer(BigDecimal amount, Account toAccount) {
		// TODO - implement Account.transfer
		throw new UnsupportedOperationException();
	}

}