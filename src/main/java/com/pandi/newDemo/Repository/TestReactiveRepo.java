package com.pandi.newDemo.Repository;

import com.pandi.newDemo.Entity.Customer;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestReactiveRepo extends R2dbcRepository<Customer, Integer> {



}
