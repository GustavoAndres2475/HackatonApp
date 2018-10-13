/*
 * Gustavo Aguayo
 * Jason Chesemore 
 * Jonathan Major
 */

/**
 * Class creates the object used to store people and the respective money owed/owe
 */

public class listPair{

	public String person;
	public int money;

	public listPair(String person, int money){

		this.person = person;
		this.money = money;

	}
	
	public String getName() {
		return this.person;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setName(String newName) {
		this.person = newName;
	}
	
	public void setMoney(int newMoney) {
		this.money = newMoney;
	}
}

