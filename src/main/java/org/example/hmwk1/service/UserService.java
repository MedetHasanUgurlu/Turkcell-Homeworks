package org.example.hmwk1.service;

import org.example.hmwk1.entity.Customer;

import java.util.List;

public interface UserService {
    void addUser(Customer user);
    List<Customer> getUsers();
    void deleteUser(Customer user);

    Customer updateUser(int id,Customer user);

}
