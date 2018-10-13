/* 
 * Gustavo Aguayo
 * Jason Chesemore
 * Jonathan Major
 */

import java.util.List;
import java.util.ArrayList;

public class trackDebt {

	/* instance variables */
  int quantity;														// Quantity 
  boolean owed;														// Checks if quantity is owned or owned
  boolean adding;													// Checks if user wants to add more people to the list

	/*
   * Method appends one more element to the list based on user input
	 *
	 * @param - name: the name of the person to add to the list
	 */
	public int addToList( String name, int money){

		List<listPair> data = new ArrayList<listPair>();				         

		/* loop always is running waiting for the user's action */
		adding = false;	
		while(true) {
			
			/* when the user wishes to add someone to the list this should be triggered */
			if(adding = true){
				data.add(new listPair(name, money));
				/* reset the if to be false */
				adding = false;										
				return 1;
			}
			else{
				return 0;
			}
		}
	}
}
