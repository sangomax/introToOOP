package miniProjects.miniProject2.controller;

import miniProjects.miniProject2.model.Contact;
import miniProjects.miniProject2.model.ContactList;
import miniProjects.miniProject2.model.Messages;
import miniProjects.miniProject2.view.Display;

public class Driver {

    public static ContactList setupContactList(ContactList contactList) {

        Contact c1 = new Contact("Mary S Kratochvil",5193863797L,2895542353L,null,"Markham");
        Contact c2 = new Contact("Frank C Grillo",2898339003L,6042473650L,6138388646L,"Richmond");
        Contact c3 = new Contact("Melba D Crowley",3066165502L,null,null,"Redvers");

        contactList.getContacts().add(c1);
        contactList.getContacts().add(c2);
        contactList.getContacts().add(c3);

        return contactList;
    }


    public static void main(String[] args) {

        ContactList contactList = new ContactList();
        contactList = setupContactList(contactList);

        boolean flagKeepRunning = true;
        boolean flagNoError = true;

        do {
            if(flagNoError) {
                Display.mainManuDisplay();
            }
            String optionInput = InputCollector.getUserInput(Messages.OPTION_MESSAGE);
            switch (optionInput) {
                case "1" : InputCollector.getAllContact(contactList);
                            flagNoError = true;
                            break;
                case "2" : contactList.addContact(InputCollector.getContactInformation());
                            flagNoError = true;
                            break;
                case "3" : InputCollector.getAllContact(contactList);
                            contactList.removeContact(InputCollector.getIndexContact(contactList,Messages.REMOVE_CONTACT_MESSAGE));
                            flagNoError = true;
                            break;
                case "4" : InputCollector.getAllContact(contactList);
                            contactList.updateContact(InputCollector.getIndexContact(contactList,Messages.UPDATE_CONTACT_MESSAGE));
                            flagNoError = true;
                            break;

                case "5" : flagKeepRunning = false;
                            System.out.println("Bye!");
                            break;
                default:
                    System.out.println(Messages.ERROR_INPUT_MESSAGE + Messages.RANGE_INPUT_MESSAGE);
                    flagNoError = false;
            }

        } while (flagKeepRunning);

    }

}
