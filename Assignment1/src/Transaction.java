import java.util.Objects;

public class Transaction {
	private String accountNumber; //account number
	private String operationType; //deposit, withdrawal, query
	private double transactionAmount; //transaction amount
	private double transactionBalance; //updated account balance
	private String transactionError; //NSF, invalid amount or account, none
	private String transactionStatus; //pending,sent,received,done

	
	public Transaction(Transaction obj) {
		accountNumber = obj.getAccountNumber();
		operationType = obj.getOperationType();
		transactionAmount = obj.getTransactionAmount();
		transactionBalance = obj.getTransactionBalance();
		transactionError = obj.getTransactionError();
		transactionStatus = obj.getTransactionStatus();
	};
	
	public Transaction(String number,  String type, Double amount, Double balance, String error, String status) {
		accountNumber = number;
		operationType = type;
		transactionAmount = amount;
		transactionBalance = balance;
		transactionError = error;
		transactionStatus = status;
	};
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public double getTransactionBalance() {
		return transactionBalance;
	}
	public void setTransactionBalance(double transactionBalance) {
		this.transactionBalance = transactionBalance;
	}
	public String getTransactionError() {
		return transactionError;
	}
	public void setTransactionError(String transactionError) {
		this.transactionError = transactionError;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String toString() {
		return String.format("account number: %s, \n operation type: %s, \n transaction amount: $%.2f \n"
				+ "updated account balance: $%.2f + \n + transaction error: %s + \n transaction status: %s",
				accountNumber, operationType, transactionAmount, transactionBalance, transactionError, transactionStatus);
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, operationType, transactionAmount, transactionBalance, transactionError,
				transactionStatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(operationType, other.operationType)
				&& Double.doubleToLongBits(transactionAmount) == Double.doubleToLongBits(other.transactionAmount)
				&& Double.doubleToLongBits(transactionBalance) == Double.doubleToLongBits(other.transactionBalance)
				&& Objects.equals(transactionError, other.transactionError)
				&& Objects.equals(transactionStatus, other.transactionStatus);
	}
}

