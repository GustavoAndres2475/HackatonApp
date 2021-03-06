/*
 * Gustavo Aguayo
 * Jason Chesemore 
 */

/**
 * Class creates the object used to store people and the respective money owed/owe
 */

public class listPair{

	public String person;
	public int money;
	public int interest;
	public int payments;

	public listPair(String person, int money, int interest, int payments){

		this.person = person;
		this.money = money;
		this.interest = interest;
		this.payments = payments;
	}
	
	public String getName(){
		return this.person;
	}
	
	public int getMoney(){
		return this.money;
	}

	public int getInterest(){
		return this.interest;
	}

	public int getPayments(){
		return this.payments;
	}
	
	public void setName(String newName){
		this.person = newName;
	}
	
	public void setMoney(int newMoney){
		this.money = newMoney;
	}
	
	public void setInterest(int newInterest){
		this.interest = newInterest;
	}

	public void setPayments(int newPayments){
		this.payments = newPayments;
	}
}

