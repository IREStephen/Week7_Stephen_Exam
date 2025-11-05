package org.example;

public class Customer {
    private String customerID, name, email, phoneNumber;

    public Customer () {
        this.customerID = "";
        this.name = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "customerID: " + customerID + "name: " + name + "Email: " + email + "PhoneNumber: " + phoneNumber;
    }
}

