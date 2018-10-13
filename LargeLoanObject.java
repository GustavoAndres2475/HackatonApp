
public class LargeLoanObject {
	private String name;
	private double amount;
	private double interest;
	private int paymentAmount;
	private int timeLeft;
	
	public LargeLoanObject() {
		name = "DEFAULT";
		amount = 0.0;
		interest = 0.0;
		paymentAmount = 0;
		timeLeft = 0;
	}
	
	public LargeLoanObject(String aName, double anAmount, double anInterest, int aPayment) {
		name = aName;
		amount = anAmount;
		interest = anInterest;
		paymentAmount = aPayment;
		timeLeft = (int)amount/paymentAmount;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getInterest() {
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
	
	public void setAmount(double newAmount) {
		this.amount = newAmount;
	}
	
	public void setInterest(double newInterest) {
		this.interest = newInterest;
	}
	
	public void setPayment(int newPayment) {
		this.paymentAmount = newPayment;
	}
	
	public void updateTimeLeft() {
		this.timeLeft = (int)amount / paymentAmount;
	}
	
}
