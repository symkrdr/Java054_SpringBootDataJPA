package com.seyma.java054_springbootdatajpa.controller;

import com.seyma.java054_springbootdatajpa.entity.Customer;
import com.seyma.java054_springbootdatajpa.servise.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;



    @PostMapping("/add-customer")
    public ResponseEntity<Void>addCustomer(String name,String Surname,String phone) {
        Customer customer = Customer.builder().name(name).Surname(Surname).phone(phone).build();
        customerService.save(customer);

        return ResponseEntity.ok().build();

    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer>customerList = customerService.getAllCustomer();
        return ResponseEntity.ok(customerList);
    }


  //  @GetMapping("/get-name")
  //  public ResponseEntity<Customer>getCustomerByname(String name) {
    //return ResponseEntity.ok(customerService.getCustomerByName(name).get());
 //   }

    @GetMapping("/get-by-name")
     public ResponseEntity<List<Customer>>getCustomerByName(String name) {
    return ResponseEntity.ok(customerService.getCustomerByName(name));
      }

    
}
