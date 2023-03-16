package org.example.hmwk1.service;

import org.example.hmwk1.adapter.CheckService;
import org.example.hmwk1.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
    private final CheckService checkService;
    List<Customer> customers = new ArrayList<>();

    public UserManager(CheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void addUser(Customer customer) {

        if(!checkService.checkUser(customer)){
            System.err.println("Invalid Process by Mernis");
            System.exit(1);
        }



        if(customers.contains(customer)){
            System.err.println("User already exist");
        }else{
            customers.add(customer);
            System.out.println("User is added.");

        }

    }

    @Override
    public List<Customer> getUsers() {
        return customers;
    }

    @Override
    public void deleteUser(Customer user) {
        if (customers.contains(user)){
            customers.remove(user);
            System.out.println("User: "+user.getId()+" is deleted.");
        }
        System.out.println("User is not in database.");
    }

    @Override
    public Customer updateUser(int id, Customer customer) {
        Customer userToUpdate = null;
        for (Customer user2 : customers) {
            if(user2.getId() == id){
                userToUpdate = user2;
                userToUpdate.setPassword(customer.getPassword());
                userToUpdate.setEmail(customer.getEmail());
                userToUpdate.setName(customer.getName());
                userToUpdate.setSurName(customer.getSurName());
            }else{
                System.out.println("Customer can not found.");
                return customer;
            }
        }
        return null;
    }



}
