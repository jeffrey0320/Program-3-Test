import java.util.Calendar;

public class TransactionReceipt {
	private TransactionTicket Slip;
	private boolean successIndicatorFlag;
	private String reasonForFailureString;
	private double preTransactionBalance;
	private double postTransactionBalance;
	private Calendar postTransactionMaturityDate;
	
	public TransactionReceipt() {
		Slip = new TransactionTicket();
		successIndicatorFlag = false;
		reasonForFailureString = "";
		preTransactionBalance = 0;
		postTransactionBalance = 0;
	}
	
	public TransactionReceipt(double pre ) {
		preTransactionBalance = pre;
		postTransactionBalance = pre;
	}
	//Constructor for flag and reason for faliure
	public TransactionReceipt(boolean flag,String reason) {
			successIndicatorFlag = flag;
			reasonForFailureString = reason;
	}
	
	public TransactionReceipt(TransactionTicket info,boolean flag,double balance) {
		Slip = info;
		successIndicatorFlag = flag;
		preTransactionBalance = balance;
		postTransactionBalance = balance;
	}
	
	public TransactionReceipt(TransactionTicket info,boolean flag,String reason) {
		Slip = info;
		successIndicatorFlag = flag;
		reasonForFailureString = reason;
	}
	
	public TransactionReceipt(TransactionTicket info, boolean flag, int index, Bank myAcct) {
		Bank bank = new Bank();
		Account bal = new Account();
		
		Slip = info;
		successIndicatorFlag = flag;
		
		//returnReceipt(bal.getBalance(Slip,index,myAcct,bal,flag).postTransactionBalance);
	
	}
	
	public String toString() {
		Account myacct = new Account();
		TransactionReceipt Receipt = new TransactionReceipt();
		
		
		String Str = String.format("%-10s%-10s",
					 				"var" + Slip.getTransactionType(),
					 				Slip.getDateOfTransaction().getTime(),
					 				Receipt.getPostTransactionBalance()
					 				
				);
		return Str;
		
	}

	public TransactionReceipt(Calendar date) {
		postTransactionMaturityDate = date;
	}
	
	public TransactionTicket getTransactionTicket() {
		return Slip;
	}
	
	public boolean getTransactionSuccessIndicatorFlag() {
		return successIndicatorFlag;
	}
	
	public String getTransactionFailureReason() {
		return reasonForFailureString;
	}
	
	public double getPreTransactionBalance() {
		return preTransactionBalance;
	}
	
	public double getPostTransactionBalance() {
		return postTransactionBalance;
	}
	
	public Calendar getPostTransactionMaturityDate() {
		return postTransactionMaturityDate;
	}
}
