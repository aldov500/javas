package MobilePhone;

import java.util.ArrayList;
import java.util.List;

import javas.Graphics;

public class MobilePhone extends Graphics {
	
	private List<Contact> contacts;
	
	public MobilePhone() {
		contacts = new ArrayList<Contact>();
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
	
	// Query contact
	
	public void printContacts() {
		for(Contact contactItem:contacts) {
			System.out.println(contactItem.getName());
		}
	}
	
	
}
