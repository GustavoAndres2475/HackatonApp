import java.util.List;
import java.util.ArrayList;

public class LargeLoanList {
	
	public void addLargeLoan(LargeLoanObject toAdd) {
		this.add(toAdd);
	}
	
	public void addPersonalLoan(listPair toAdd) {
		this.add(toAdd);
	}
	
	public int findName(String name) {
		for(int counter = 0; counter < this.size(); counter++) {
			if(name.equals(this.get(counter).getName())) {
				return counter;
			}
		}
		return -1;
	}
	
	public void removeLargeLoan(LargeLoanObject toDel) {
		
		int result = this.findName(toDel.getName());
		if(result < 0) {
			return;
		}
		
		else {
			this.remove(this.get(result).getName());
			return;
		}
	}
	
	public void removeListPair(listPair toDel) {
		int result = this.findName(toDel.getName());
		if(result < 0) {
			return;
		}
		
		else {
			this.remove(result);
			return;
		}
	}
	
	public void paymentMade(String name, int payment) {
		int result = this.findName(name);
		if(result < 0) {
			return;
		}
		
		else {
			this.get(result).paymentMade(payment);
		}
	}
}
