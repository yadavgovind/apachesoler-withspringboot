package com.poc.demo;

import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.data.solr.repository.SolrRepository;

public interface EmployeeRepository extends SolrCrudRepository<Employee, Integer>{

}
