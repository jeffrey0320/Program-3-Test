
public class Account {
	private int accNum;
	private String accType;
	private double balance;
	private Depositor myDep;
	
	public Account() {
		accNum = 0;
		accType = "";
		balance = 0;
		myDep = new Depositor();
	}
	
	public Account(int parseInt, String string, double parseDouble, Depositor myInfo) {
		accNum = parseInt;
		accType = string;
		balance = parseDouble;
		myDep = myInfo;
	}
	
	public double amount(Bank acc,Account bal, int index) {
		bal = acc.getAccts(index);
		balance =  bal.getBalance();
		return balance;
	}
	
	public TransactionReceipt getBalance(TransactionTicket info,Bank acc,Account bal,int index,boolean flag) {
		
		if(flag) {
			bal = acc.getAccts(index);
			balance =  bal.getBalance();
			TransactionReceipt receipt = new TransactionReceipt(info,true,balance);
			return receipt;
		}else {
			String reason = "Account number not found.";
			TransactionReceipt receipt = new TransactionReceipt(info,false,reason);
			return receipt;
		}
	}
	
	public TransactionReceipt makeDeposit(TransactionTicket info) {
		TransactionReceipt withDeposit = new TransactionReceipt();
		
		return withDeposit;
	}
	
	public Depositor getMyDep() {
		return myDep;
	}

	public void setMyDep(Depositor myDep) {
		this.myDep = myDep;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
