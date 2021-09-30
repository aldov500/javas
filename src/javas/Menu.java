/**
 * 
 */
package javas;

import java.util.Arrays;
import java.util.List;
import MobilePhone.MobilePhone;

/**
 * @author Aldo
 *
 */
public class Menu {
	List<String> programs;
	
	Menu(){
		programs = Arrays.asList("MobilePhone");		
	}
	
	public void printWelcome() {
		log("Welcome to javas");
	}
	
	public void printMainMenu() {
		log("Select the program to run.");
		printListPrograms();
	}
	
	public void selectProgram(int programIndex) {
		log("Running " + programs.get(programIndex));
		runProgram(programIndex);
	}
	
	private void runProgram(int programIndex) {
		switch(programIndex) {
		case 0:
			MobilePhone phone = new MobilePhone();
			phone.createContact("Aldo Vargas","331102","aldo@hmal.com");
			phone.printContacts();
			
			phone.createContact("Aldo Vargas","331102","aldo@hmal.com");
			phone.printContacts();
			
			phone.createContact("Aldo Vargas","331102","aldo@hmal.com");
			phone.printContacts();
			
			phone.createContact("Aldo Vargas","331102","aldo@hmal.com");
			phone.printContacts();
			
			phone.editContact(1,"one","331102","aldo@hmal.com");
			phone.printContacts();
			
		}
	}
	
	private void printListPrograms() {
		for (String programItem:programs) {
			log(programs.indexOf(programItem) + " - " + programItem);
			
		}
	}
	private void log(String message) {
		System.out.println(message);
	}
	private void log(int message) {
		System.out.println(message);
	}
}
