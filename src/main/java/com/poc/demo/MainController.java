package com.poc.demo;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Resource
	EmployeeRepository employeeRepository;
	
	@Resource
	ItemDocumentRepository documentRepository;
	
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");  
    @PostMapping(value="/updateRepository")	
	public void getEmployee1(@RequestBody List<ItemVO> itemDocuments){
	   LocalDateTime now = LocalDateTime.now();  
	   List<ItemDocument> items= new ArrayList<>();
	   System.out.println("Repository saving start :"+dtf.format(now)); 
	   itemDocuments.stream().forEach(item->
		   items.add(convertToDocument(item))
	   );
	   documentRepository.saveAll(items);
		  LocalDateTime now1 = LocalDateTime.now();  
		  System.out.println("Repository saving end :"+dtf.format(now1)); 
	}
	private ItemDocument convertToDocument(ItemVO itemVO){
		   ItemDocument document= new ItemDocument();
		   document.setItemId(itemVO.getItemId());
		   document.setStyleId(itemVO.getStyleId());
		   document.setStyleNo(itemVO.getStyleNo());
		   document.setAbovePainThreshold(itemVO.isAbovePainThreshold());
		   document.setAboveReturnRateThreshold(itemVO.isAboveReturnRateThreshold());
		   document.setAverageRetailPrice(itemVO.getAverageRetailPrice());
		   
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
//		   
//		   document.setStyleId(itemVO.getStyleId());
//		   document.setStyleId(itemVO.getStyleId());
		   return document;
	}
	@GetMapping(value="/getdoc")
	public Iterable<ItemDocument> getDocument(){
		  LocalDateTime now1 = LocalDateTime.now();  
		  System.out.println("Repository fetching end :"+dtf.format(now1)); 
		Iterable<ItemDocument> findAll = documentRepository.findAll() ;
		  LocalDateTime now2 = LocalDateTime.now();  
		  System.out.println("Repository fetching end :"+dtf.format(now2)); 
		return findAll;
		
	}
	
	
	@GetMapping(value="/getemp")
	public Iterable<Employee> getEmployee(){
		  LocalDateTime now1 = LocalDateTime.now();  
		  System.out.println("Repository fetching end :"+dtf.format(now1)); 
		Iterable<Employee> findAll = employeeRepository.findAll() ;
		  LocalDateTime now2 = LocalDateTime.now();  
		  System.out.println("Repository fetching end :"+dtf.format(now2)); 
		return findAll;
		
	}
}
