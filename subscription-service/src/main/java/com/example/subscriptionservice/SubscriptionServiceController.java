package com.example.subscriptionservice;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.subscriptionservice.SubscriptionService;
import com.example.subscriptionservice.SubscriptionServiceRepository;

@RestController
public class SubscriptionServiceController {
	
	@Autowired
	private SubscriptionServiceRepository repository;
	

	@GetMapping("/get/subscriptions")
	public List<SubscriptionService> getAllSubscriptions() {
        return repository.findAll();
    }
	
	@PostMapping("/post/subscription")
	SubscriptionService newSubscriptionService(@RequestBody SubscriptionService newSubscriptionService,UriComponentsBuilder builder) {
    return repository.save(newSubscriptionService);
				
		}

	
	/*public SubscriptionService postSubscriptionService(String name,String datesubscribed,String datereturned,String bookid){
	 SubscriptionService subscription = new SubscriptionService(name,datesubscribed,datereturned,bookid);
	 subscription = repository.save(subscription);
	 
	 return subscription;*/
	
	}	

/*	@PostMapping("/post/subscription/name/{name}/bookid/{bookid}/datesubscribed/{datesubscribed}/datereturned/{datereturned}")
	public SubscriptionService postSubscriptionService(
		@PathVariable String name,
		@PathVariable String bookid,
		@PathVariable String datesubscribed,
		@PathVariable String datereturned){
		
		HashMap<String, String> uriVariables = new HashMap<>();
		uriVariables.put("name", name);
		uriVariables.put("bookid", bookid);
		uriVariables.put("datesubscribed", datesubscribed);
		uriVariables.put("datereturned", datereturned);
		
		ResponseEntity<SubscriptionService> responseEntity = 		
		new RestTemplate().getForEntity("http://localhost:8050/get/bookidavailability/{bookid}",SubscriptionService.class,uriVariables);
		
		
		 HttpStatus statusCode = responseEntity.getStatusCode();	 
		 
		 
		 if (statusCode == HttpStatus.OK) {
			 
			 
			 SubscriptionService subscription = new SubscriptionService(name,datesubscribed,datereturned,bookid);
			 subscription = repository.save(subscription);
			 
			 return subscription;
			 

		 }
		 
		 if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR) {
			 
			 return null;
		 }	
		 
	 
	}*/
		
	