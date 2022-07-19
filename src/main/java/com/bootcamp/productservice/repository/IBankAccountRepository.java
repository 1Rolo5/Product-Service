package com.bootcamp.productservice.repository;

import com.bootcamp.productservice.model.Bank_Account;
import com.bootcamp.productservice.model.Business_Account;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface IBankAccountRepository  extends ReactiveCrudRepository<Bank_Account,String> {



}
