package in.abhayit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.abhayit.Entity.CustomerMongo;
import in.abhayit.Repository.CustRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@RestController
public class CustomerReactiveController {
	
	@Autowired CustRepo custrepo;
	
	@PostMapping("/saveAll")
	public Mono<CustomerMongo> postMethodName(@RequestBody CustomerMongo customerMongo	) {
		
		Mono<CustomerMongo> customer = custrepo.save(customerMongo);
		
		return customer;
	}
	
	@GetMapping("/getallCustomer")
	public Flux<CustomerMongo> getALlCustomer() {
		return  custrepo.findAll();
	}
	
	

}
