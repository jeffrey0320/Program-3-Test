import java.util.Calendar;
import java.util.Date;

public class TransactionTicket {
	private Calendar dateOfTransaction;
	private String typeOfTransaction;
	private double amountOfTransaction;
	private int termOfCD;
	
	//Account transaction = new Account();
	//TransactionReceipt flag = new TransactionReceipt();
	//TransactionTicket info = new TransactionTicket();
	
	//no args-constructor
	public TransactionTicket() {
		typeOfTransaction = "";
		amountOfTransaction = 0;
		termOfCD = 0;
		dateOfTransaction = Calendar.getInstance();
		//dateOfTransaction.clear();
	}
	//Constructor for withdrawal or deposit transaction
	public TransactionTicket(Calendar date, String type, double amount) {
		dateOfTransaction = date;
		typeOfTransaction = type;
		amountOfTransaction = amount;
		dateOfTransaction = Calendar.getInstance();
		dateOfTransaction.clear();
	}
	//Constructor to get balance
	public TransactionTicket(Calendar date, String type) {
		dateOfTransaction = date;
		typeOfTransaction = type;
	}
	/*
	public TransactionTicket(String type) {
		typeOfTransaction = type;
		
		do {
			switch(type) {
			case "balance":
				transaction.getBalance(info);
			case "deposit":
				transaction.makeDeposit(info);
			}
			//should return to main
		}while(flag.getTransactionSuccessIndicatorFlag());
		System.out.println(typeOfTransaction);
	}
	
	public TransactionTicket(Calendar date) {
		dateOfTransaction = date;
	}
	public TransactionTicket(double amount) {
		amountOfTransaction = amount;
	}
	public TransactionTicket(int term) {
		termOfCD = term;
	}*/
	
	public Calendar getDateOfTransaction() {
		return dateOfTransaction;
	}
	
	public Date getDate(Calendar date) {
		return date.getTime();
	}
	
	public String getTransactionType() {
		return typeOfTransaction;
	}
	
	public double getTransactionAmount() {
		return amountOfTransaction;
	}
	
	public int getTermOfCD() {
		return termOfCD;
	}
}
