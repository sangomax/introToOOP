package miniProjects.miniProject2.model;

import miniProjects.miniProject2.controller.InputCollector;
import miniProjects.miniProject2.controller.Validation;

import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact newContact) {
        try {
            Validation.isValidContact(newContact, contacts);
            contacts.add(newContact);
            System.out.println(Messages.ADD_CONTACT_SUCCESS_MESSAGE);
        }catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    public void removeContact(Integer index) {
        if(index != null) {
            System.out.println(this.contacts.get(index).toString());
            System.out.println(Messages.REMOVE_CONTACT_SUCCESS_MESSAGE);
            getContacts().remove(index.intValue());
        }
    }

    public void updateContact(Integer index) {
        if(index != null) {
            Contact updateContact = InputCollector.getContactInformation();
            getContacts().set(index.intValue(),updateContact);
            System.out.println(Messages.UPDATE_CONTACT_SUCCESS_MESSAGE);
        }
    }

    public void printContactList() {
        if(this.getContacts().size() == 0) {
            System.out.println(Messages.EMPTY_LIST_MESSAGE);
        } else {
            for (int i = 0; i < this.contacts.size(); i++) {
                System.out.println(i + " " + this.contacts.get(i).printDetailContact());
            }
        }
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }


}
