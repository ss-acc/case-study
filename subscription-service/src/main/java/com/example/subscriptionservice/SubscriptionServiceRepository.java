package com.example.subscriptionservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.subscriptionservice.SubscriptionService;

public interface SubscriptionServiceRepository extends JpaRepository<SubscriptionService, Long> {

//	SubscriptionService findByName(String name);
	
	  @Override
	  java.util.List<SubscriptionService> findAll();
	  
	  
	 
//		SubscriptionService save(SubscriptionService persisted);	
//		SubscriptionService save(SubscriptionService subscriptionService);	  
//	  SubscriptionService save(Long id,String name,String datesubscribed,String datereturned,String bookid);
	  
//	  SubscriptionService save(SubscriptionService subscriptionService);
}