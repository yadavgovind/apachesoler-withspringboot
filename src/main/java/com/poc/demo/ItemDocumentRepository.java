package com.poc.demo;

import org.springframework.data.solr.repository.SolrCrudRepository;

public interface ItemDocumentRepository extends SolrCrudRepository<ItemDocument, Long>{

}
