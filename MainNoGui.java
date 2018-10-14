import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainNoGui { /*
	List<LargeLoanObject> loanList = new ArrayList<LargeLoanObject>();
	
	public void addLargeLoan(LargeLoanObject toAdd) {
		loanList.add(toAdd);
	}
	
	public int findName(String name) {
		for(int counter = 0; counter < l.size(); counter++) {
			if(name.equals(loanList.get(counter).getName())) {
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
} */

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a command: ");
			System.out.println("(O)we Friend,    (F)riend Owes,    p(A)y Friend");
			System.out.println("(P)rint list     (R)emove,         (Q)uit ");
			char command = temp.next().charAt(0);
			
			if(command == 'O') {
				
			}
			
			else if(command == 'F') {
				
			}
			
			else if(command == 'A') {
				
			}
			
			else if(command == 'P') {
				
			}
			
			else if(command == 'R') {
				
			}
			
			else if(command == 'Q') {
				
			}
			
			else {
				System.err.println("Invalid Input!");
			}
		}
	}
	
	
}
