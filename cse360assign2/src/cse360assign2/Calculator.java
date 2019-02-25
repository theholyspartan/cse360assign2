
package cse360assign2;

public class Calculator {

	private int total;  //The total of all arithmetic functions
	private String hist; //The written history of the arithmetic
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		hist = "0 ";
	}
	/** Returns the total of all current arithmetic functions
	 * @param total The total value 
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/** Adds the value to the current total
	 * 
	 * @param value The user input value
	 * @param hist The string holding the history
	 */
	public void add (int value) {
		total += value;
		
		hist += " + " + value;
	}
	
	/** Subtracts the value from the current total
	 * 
	 * @param value The user input value
	 * @param hist The string holding the history
	 */
	public void subtract (int value) {
		total -= value;
		
		hist += " - " + value;
	}
	
	
	/** Multiplies the total by the value
	 * 
	 * @param value The user input value
	 * @param hist The string holding the history
	 */
	public void multiply (int value) {
		total *= value;
		
		hist += " * " + value;
	}
	
	
	/** Divides the total by the value, but if the value is 0 it sets total to 0
	 * 
	 * @param value The user input value
	 * @param hist The string holding the history
	 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
		{
		total = total/value;
		}
		hist += " / " + value;
	}
	
	/**Returns the history of all the arithmetic functions
	 * 
	 * @param hist The string holding the history
	 */
	public String getHistory () {
		return hist;
	}
}
