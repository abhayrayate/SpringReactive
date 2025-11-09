package in.abhayit.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import in.abhayit.Entity.CustomerMongo;

public interface CustRepo extends ReactiveMongoRepository<CustomerMongo, String>{

}
