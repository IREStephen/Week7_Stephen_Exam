package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        List <Customer> CustomerList = new ArrayList<>();

        System.out.println("How many names do you want to add: ");
        int totalCustomers = sc.nextInt();
        sc.nextLine();

        int count = 0;
        while (count < totalCustomers) {
            System.out.println("Enter a name: ");
            String name = sc.nextLine();
        }

        System.out.println("Enter a Phone Number: ");
        String phoneNumber = sc.nextLine();

        String customerID;
        while (true) {
            System.out.println("Enter CustomerID: ");
            customerID = sc.nextLine().trim().toLowerCase();
            boolean exists = false;
            for (Customer s : CustomerList) {
            if (exists) {
                System.out.println("CustomerID Exists.\n\n");
            }
            else  {
                break;
            }
        }
        System.out.println("Enter email: ");
        String email = sc.nextLine();

        Customer1.setName(totalCustomers);
        Customer1.setEmail(email);
        Customer1.setCustomerID(customerID);
        Customer1.setPhoneNumber(phoneNumber);

        CustomerList.add.(Customer1);
        count++;
        }
        System.out.println("Customer List: ");
        for(Customer s : CustomerList) {
            System.out.println(s.toString());
        }
        sc.close();
    }
}
