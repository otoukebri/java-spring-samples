package tn.zelda.projects.salesapp.model;

/**
 * Created by zelda on 27/01/17.
 */
public class Client {

    String name;
    String address;


    public Client(String firstName, String address) {
        this.name = firstName;
        this.address = address;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

}
