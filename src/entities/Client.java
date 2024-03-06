package entities;

import java.util.Date;

public class Client {
    private String codeClient;
    private String name;
    private String surname;
    private String email;

    private Date dateOfSUb;

    public Client(String codeClient, String name, String surname,
                  String email) {
        this.codeClient = codeClient;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfSUb = new Date();
    }

    public String getCodeClient() {
        return codeClient;
    }

    public String getFullName() {
        return name + " " + surname;
    }


    public String getEmail() {
        return email;
    }

    public Date getDateOfSUb() {
        return dateOfSUb;
    }

    @Override
    public String toString() {
        return "Client{" +
                "codeClient='" + codeClient + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfSUb=" + dateOfSUb +
                '}';
    }
}
