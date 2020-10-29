package miniProjects.miniProject2.controller;

public class Formatter {

    public String phoneNumberCanada(Object phone) {
        String phoneFormated = phone.toString().substring(0,3) +
                                "-" +
                                phone.toString().substring(3,6) +
                                "-" +
                                phone.toString().substring(6,10);
        return phoneFormated;
    }
}
