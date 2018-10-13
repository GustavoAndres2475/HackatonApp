import java.util.List;
import java.util.ArrayList;

public class LargeLoanList {

	static List<LargeLoanObject> loanList = new ArrayList<LargeLoanObject>();
	
	public void addLargeLoan(LargeLoanObject toAdd) {
		this.add(toAdd);
	}
	
	public void addPersonalLoan(listPair toAdd) {
		this.add(toAdd);
	}
	
	public int findName(String name) {
		for(int counter = 0; counter < loanList.size(); counter++) {
			if(name.equals(loanList.get(counter).getName())) {
				return counter;
			}
		}
		else {
			return -1;
		}
	}
	
	public void removeLargeLoan(LargeLoanObject toDel) {
		
		int result = findName(toDel.getName());
		if(result < 0) {
			return;
		}
		
		else {
			loanList.remove(result);
			return;
		}
	}
	
	public void removeListPair(listPair toDel) {
		
		int result = findName(toDel.getName());
		if(result < 0) {
			return;
		}
		
		else {
			loanList.remove(result);
			return;
		}
	}
	
	public void paymentMade(String name, int payment) {
		int result = findName(name);
		if(result < 0) {
			return;
		}
		
		else {
			loanList.get(result).paymentMade(payment);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("HELLO FREAK BITCHES");
		LargeLoanObject test = new LargeLoanObject();
		loanList.add(test);
		System.out.println(loanList);
	}
	
	
}
