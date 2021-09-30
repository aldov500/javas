package MobilePhone;

import java.util.ArrayList;
import java.util.List;

import javas.Graphics;

public class MobilePhone extends Graphics {
	
	private List<Contact> contacts;
	
	public MobilePhone() {
		contacts = new ArrayList<Contact>();
	}
	
	public void start() {
		int exit = 0;
		while(exit == 0) {
			
			
		}
	}
	
	// New contact
	public void createContact(String name, String phone, String email) {
		Contact newContact = new Contact(name, phone, email);
		contacts.add(newContact);
	}
	// Edit contact
	public void editContact(int contactIndex, String name, String phone, String email) {
		if(contactIndex != 0 ) {
			Contact editedContact = contacts.get(contactIndex);
			if(name != "") {
				editedContact.setName(name);
			}	
			if(phone != "") {
				editedContact.setPhone(phone);
			}
			if(email != "") {
				editedContact.setEmail(email);
			}
			contacts.set(contactIndex, editedContact);
			succ("Contact edited");
		}else {
			error("No index contact");
		}
		
	}
	// Delete contact
	public void deleteContact(int contactIndex) {
		contacts.remove(contactIndex);
		log("Removed contact");
	}
	// Query contact
	public String getContact(int contactIndex) {
		return contacts.get(contactIndex).toString();
	}
	
	public void printContacts() {
		for(Contact contactItem:contacts) {
			log(contactItem.getName());
		}
	}
	
	
}
