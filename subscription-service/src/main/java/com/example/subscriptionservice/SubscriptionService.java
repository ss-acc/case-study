package com.example.subscriptionservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "subscriptions")
public class SubscriptionService {
	
	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private Long id;
		
		private String name;
		
		private String datesubscribed;
		
		private String datereturned;
		
		private String bookid;
		
			
		public SubscriptionService(){
			
		}


		public SubscriptionService(String name, String datesubscriped, String datereturned, String bookid) {
			this.name = name;
			this.datesubscribed = datesubscriped;
			this.datereturned = datereturned;
			this.bookid = bookid;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDatesubscribed() {
			return datesubscribed;
		}


		public void setDatesubscribed(String datesubscribed) {
			this.datesubscribed = datesubscribed;
		}


		public String getDatereturned() {
			return datereturned;
		}


		public void setDatereturned(String datereturned) {
			this.datereturned = datereturned;
		}


		public String getBookid() {
			return bookid;
		}


		public void setBookid(String bookid) {
			this.bookid = bookid;
		}
		

		
		
		
}
