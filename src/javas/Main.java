/**
 * 
 */
package javas;

/**
 * @author Aldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		Menu menu = new Menu();
		
		menu.printWelcome();
		menu.printMainMenu();
		menu.selectProgram(0);		
	}

}
