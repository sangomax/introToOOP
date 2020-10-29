package miniProjects.miniProject2.controller;

import miniProjects.miniProject2.model.Contact;
import miniProjects.miniProject2.model.ContactList;
import miniProjects.miniProject2.model.Messages;

import java.util.Scanner;

public class InputCollector {

    public static String getUserInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextLine();
    }

    public static Contact getContactInformation() {
        Object nameInput = null, mobileInput = null, workInput = null, homeInpu = null, cityInput = null;
        boolean flagAgain = false, flagWorkNOk = true, flagHomeNOK = true, flagCityNOK = true;
        do {
            try {
                if (nameInput == null) {
                    String name = InputCollector.getUserInput(Messages.NAME_MESSAGE);
                    Validation.isValidName(name);
                    nameInput = name;
                }

                if (mobileInput == null) {
                    String mobile = InputCollector.getUserInput(Messages.MOBILE_PHONE_NUMBER_MESSAGE);
                    Validation.isValidPhone(mobile, true, "mobile phone number");
                    mobileInput = Long.valueOf(mobile.toString().replace("-", ""));
                }

                if (flagWorkNOk) {
                    String work = InputCollector.getUserInput(Messages.WORK_PHONE_NUMBER_MESSAGE);
                    Validation.isValidPhone(work , false, "work phone number");
                    if (!work.equals("")) {
                        workInput = Long.valueOf(work.toString().replace("-", ""));
                    }
                    flagWorkNOk = false;
                }

                if (flagHomeNOK) {
                    String home = InputCollector.getUserInput(Messages.HOME_PHONE_NUMBER_MESSAGE);
                    Validation.isValidPhone(home , false, "home phone number");
                    if (!home.equals("")) {
                        homeInpu = Long.valueOf(home.toString().replace("-", ""));
                    }
                    flagHomeNOK = false;
                }

                if (flagCityNOK) {
                    String city = InputCollector.getUserInput(Messages.CITY_MESSAGE);
                    if (!city.equals("")) {
                        Validation.isValidCity(city);
                        cityInput = city;
                    }
                    flagCityNOK = false;
                }

                flagAgain = false;
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                flagAgain = true;
            }
        } while (flagAgain);

        return new Contact((String) nameInput, (Long) mobileInput, (Long) workInput, (Long) homeInpu , (String) cityInput);
    }

    public static void getAllContact(ContactList contactList) {
        contactList.printContactList();
    }

    public static Integer getIndexContact(ContactList contactList, String message) {
        boolean flagNoErro = true;
        Integer newIndex = new Integer(0);

        try {
            if (contactList.getContacts().size() > 0) {
                String indexInput = InputCollector.getUserInput(message);//Messages.REMOVE_CONTACT_MESSAGE);
                Validation.isValidIndex(indexInput, contactList);
                return Integer.valueOf(indexInput);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            flagNoErro = false;
            newIndex = getIndexContact(contactList, message);
        }

        if (flagNoErro) {
            return null;
        } else {
            return newIndex;
        }
    }
}
