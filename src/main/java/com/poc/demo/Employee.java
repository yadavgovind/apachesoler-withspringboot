package com.poc.demo;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection="employee")
public class Employee {


	 @Id
	 @Indexed(name = "id", type = "int")
	private Integer id;

	 @Indexed(name = "name", type = "string")
	private String name;

	 @Indexed(name = "address", type = "string")
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	
	
}
