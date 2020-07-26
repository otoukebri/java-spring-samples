package tn.zelda.projects.salesapp;

/**
 * Created by zelda on 27/01/17.
 */
public class Customer {

    String name;
    String address;


    public Customer(String firstName, String address) {
        this.name = firstName;
        this.address = address;
    }

    public Customer() {
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
