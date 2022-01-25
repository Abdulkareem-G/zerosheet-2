package com.webproject.zerosheet;

import org.springframework.data.repository.CrudRepository;

//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

//@Repository

public interface TransactionRepository extends CrudRepository <Transaction, Long>  {
}
