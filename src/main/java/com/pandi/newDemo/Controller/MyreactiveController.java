package com.pandi.newDemo.Controller;


import com.pandi.newDemo.Entity.Customer;
import com.pandi.newDemo.Repository.TestReactiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class MyreactiveController {

    @Autowired
    TestReactiveRepo testReactiveRepo;

//    @PostMapping("/customer/save")
//    public Mono<Customer> getCall(){
//
//        Customer customer = new Customer();
//        customer.setAddress("address");
//        customer.setMarried(true);
//        customer.setName("pandi");
//
//       Mono<Customer> customer1 = testReactiveRepo.save(customer);
//
//        return customer1;
//    }

    @GetMapping("/fetch/all")
    public String fetchCustomerList(){

        return "welcome";
    }

    @GetMapping("/fetch/reactive/all")
    public String fetchCustomerReactiveList(){

        return "welcome";
    }


}
