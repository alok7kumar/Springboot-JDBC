package com.springboot.jdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext con	=	SpringApplication.run(Application.class, args);
				Consumer_Repository c1		=	con.getBean(Consumer_Repository.class);
					Consumer consume			=	con.getBean(Consumer.class);
				
					 //Insert
//						consume.setConsumer_id(102);
//						consume.setConsumer_name("Vijay");
//						consume.setProduct_name("Samsung");
//					c1.insertData(consume);
						
					// Update
//						consume.setConsumer_id(102);
//						consume.setConsumer_name("Bobby");
//						consume.setProduct_name("Splendor");
//					c1.updateData(consume);
							
					// Delete
//						consume.setConsumer_id(101);
//					c1.deleteData(consume);
						
					// Fetch by id
						Consumer c2	=	c1.fetchById(102);
						System.out.println(c2);
						
					// Fetch all data
						List<Consumer> l1 = c1.fetch();
							System.out.println("Fetching started.................");
						for (Consumer consumer : l1) {
							System.out.println(consumer);
						}
								System.out.println("Fetched");
		
	}

}
