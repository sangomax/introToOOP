package miniProjects.miniProject2.controller;

import miniProjects.miniProject2.model.Contact;
import miniProjects.miniProject2.model.ContactList;
import miniProjects.miniProject2.model.Messages;

import java.util.ArrayList;

public class Validation {

    public static void isValidName(String name) throws Exception {
        if (name.equals("")) {
            throw new Exception(Messages.ERROR_INPUT_MESSAGE + " You must enter this field.");
        } else if (!name.matches("[a-zA-Z0-9 ]*")) {
            throw new Exception(Messages.ERROR_INPUT_MESSAGE + " Enter name valid.");
        }
    }

    public static void isValidPhone(String phone, boolean mandatory, String fieldName) throws Exception {
        try {
            if (!mandatory && phone.equals("")) {
                return;
            }
            if (mandatory && phone.equals("")) {
                throw new Exception(Messages.ERROR_INPUT_MESSAGE + " You must enter this field.");
            }

            if (phone.length() == 10) {
                Long.valueOf(phone);
            } else if (phone.length() == 12) {
                Long.valueOf(phone.substring(0, 3) + phone.substring(4, 7) + phone.substring(8, 12));
            } else {
                throw new Exception(Messages.ERROR_INPUT_MESSAGE + " Enter " + fieldName + " valid. " + Messages.PHONE_PATTERN_MESSAGE);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(Messages.ERROR_INPUT_MESSAGE + " Enter " + fieldName + " valid. " + Messages.PHONE_PATTERN_MESSAGE);
        }
    }

    public static void isValidCity(String city) throws Exception {
        if (!city.matches("[a-zA-Z -]*")) {
            throw new Exception(Messages.ERROR_INPUT_MESSAGE + " Enter city valid.");
        }
    }

    public static void isValidContact(Contact newContact, ArrayList<Contact> contactList) throws Exception {
        for (Contact contact : contactList) {
            if (contact.getFullName().equalsIgnoreCase(newContact.getFullName())) {
                if (contact.getMobilePhoneNumber().equals(newContact.getMobilePhoneNumber())) {
                    throw new Exception(Messages.ADD_CONTACT_DUPLICATE_MESSAGE);
                }
            }
        }
    }

    public static void isValidIndex(String index, ContactList contactList) throws Exception {
        try {
            int ind = Integer.valueOf(index);
            if (ind < 0 || ind >= contactList.getContacts().size()) {
                throw new Exception(Messages.SEARCH_NOT_FOUND_MESSAGE + " Enter number between 0 and " + (contactList.getContacts().size() - 1) + ".");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(Messages.SEARCH_NOT_FOUND_MESSAGE + " Enter number between 0 and " + (contactList.getContacts().size() - 1) + ".");
        }

    }
}


