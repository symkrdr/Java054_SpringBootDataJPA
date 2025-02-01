package com.seyma.java054_springbootdatajpa.servise;

import com.seyma.java054_springbootdatajpa.entity.Customer;
import com.seyma.java054_springbootdatajpa.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public void save(Customer customer) {
        repository.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return repository.findAll();
    }

  //  public Optional<Customer> getCustomerByName(String name) {
  //      return repository.findOptionalByName(name);


 //   }

    public List<Customer> getCustomerByName(String Name) {
        return repository.findAllByName(Name);

    }

}
