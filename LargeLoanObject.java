 
public class LargeLoanObject {
	private String name;
	private int amount;
	private int interest;
	private int paymentAmount;
	private int timeLeft;
	
	public LargeLoanObject() {
		name = "DEFAULT";
		amount = 0;
		interest = 0;
		paymentAmount = 0;
		timeLeft = 0;
	}
	
	public LargeLoanObject(String aName, int anAmount, int anInterest, int aPayment) {
		name = aName;
		amount = anAmount;
		interest = anInterest;
		paymentAmount = aPayment;
		timeLeft = amount/paymentAmount;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public int getInterest() {
		return this.interest;
	}
	
	public int getPaymentAmount() {
		return paymentAmount;
	}
	
	public int getTimeLeft() {
		return timeLeft;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAmount(int newAmount) {
		this.amount = newAmount;
	}
	
	public void setInterest(int newInterest) {
		this.interest = newInterest;
	}
	
	public void setPayment(int newPayment) {
		this.paymentAmount = newPayment;
	}
	
	public void paymentMade(int payment) {
		this.amount = this.amount - payment;
	}
	
	public void updateTimeLeft() {
		this.timeLeft = amount / paymentAmount;
	}
	
}