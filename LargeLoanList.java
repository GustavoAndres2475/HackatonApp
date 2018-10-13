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
	
	public void removeLargeLoan(LargeLoanObject toDel) {
		
		for(int counter = 0; counter < loanList.size(); counter++) {
			if(toDel.getName().equals(loanList.get(counter).getName())) {
				loanList.remove(counter);
				return;
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("HELLO FREAK BITCHES");
		LargeLoanObject test = new LargeLoanObject();
		loanList.add(test);
		System.out.println(loanList);
	}
	
	
}
