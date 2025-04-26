package com.springboot.jdbc;

import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	private int consumer_id;
	private String consumer_name;
	private String product_name;
	
	public int getConsumer_id() {
		return consumer_id;
	}
	public void setConsumer_id(int consumer_id) {
		this.consumer_id = consumer_id;
	}
	public String getConsumer_name() {
		return consumer_name;
	}
	public void setConsumer_name(String consumer_name) {
		this.consumer_name = consumer_name;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	@Override
	public String toString() {
		return "Consumer [consumer_id=" + consumer_id + ", consumer_name=" + consumer_name + ", product_name="
				+ product_name + "]";
	}

}
