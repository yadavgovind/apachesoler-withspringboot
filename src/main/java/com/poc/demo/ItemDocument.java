package com.poc.demo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection="item_collection")
public class ItemDocument  {


	 
	    
	    @Field
	    private Long styleId;
	    @Field
	    private String imageUrl;
	    @Id
	    @Field
	    private Long itemId;
	    @Field
	    private String itemDescription;
	    @Field
	    private String color;
	    @Field
	    private String department;
	    @Field
	    private String subDepartment;
	    @Field
	    private boolean repeat;
	    @Field
	    private String mkz;
	    @Field
	    private String qsGenre;

	    // this data will come from d:returns webservice
	    @Field
	    private Long stock;
	
	    @Field
	    private Long sales;
	    @Field
	    private Long salesPreviousYear;
	    @Field
	    private Double returnRate;
	    @Field
	    private Double returnRatePreviousYear;
	    @Field
	    private Long forecast;
	    @Field
	    private long measureQA;
	    // private long measureBrand;
	    @Field
	    private Set<String> measureInspectionTypeNames = new HashSet<>();
	    @Field
	    private Date reminderDate;
	    @Field
	    private Date deliveryDate;
	    @Field
	    private Long deliveryQuantity;
	    @Field
	    private BigDecimal price;
	    @Field
	    private boolean aboveReturnRateThreshold;
	    @Field
	    private boolean abovePainThreshold;
	    @Field
	    private boolean inReturnReport;
	    @Field
	    private String styleNo;
	    @Field
	    private String styleDescription;
	    @Field
	    private String itemNo;
	    @Field
	    private final Set<Long> setOfDisposalCodes = new HashSet<>();
	    @Field
	    private Set<Long> collectionIds = new HashSet<>();
	    @Field
	    protected Set<String> supplierNames = new HashSet<>();
	    @Field
	    private String collectionNames;
	    @Field
	    private String collectionTypeNames;
	    @Field
	    private String riskTypeNames;
	    @Field
	    private String office;
	    @Field
	    private String composition;
	    @Field
	    private String materialStandardTypeName;
	    @Field
	    private BigDecimal averageRetailPrice;
	    @Field
	    private String imageUrlDesc;
	    @Field
	    private String ffpDecision;
	    @Field
	    private Long rq;
		 
	   
	    @Field
	    private Long countOfRepeat;
	    @Field
	    private Set<Long> lkz = new HashSet<>();
	    @Field
	    private Long itemOptionId;
	    @Field
	    private Long localeGroupId;
 

 

	   

	    public void addSupplierName(final String supplierName) {
	        this.supplierNames.add(supplierName);
	    }

	    

	    public Long getStyleId() {
	        return this.styleId;
	    }

	    public void setStyleId(final Long styleId) {
	        this.styleId = styleId;
	    }

	    public String getImageUrl() {
	        return this.imageUrl;
	    }

	    public void setImageUrl(final String imageUrl) {
	        this.imageUrl = imageUrl;
	    }

	    public Long getItemId() {
	        return this.itemId;
	    }

	    public void setItemId(final Long itemId) {
	        this.itemId = itemId;
	    }

	    public String getItemDescription() {
	        return this.itemDescription;
	    }

	    public void setItemDescription(final String itemDescription) {
	        this.itemDescription = itemDescription;
	    }

	    public String getColor() {
	        return this.color;
	    }

	    public void setColor(final String color) {
	        this.color = color;
	    }

	    public String getDepartment() {
	        return this.department;
	    }

	    public void setDepartment(final String department) {
	        this.department = department;
	    }

	    public String getSubDepartment() {
	        return this.subDepartment;
	    }

	    public void setSubDepartment(final String subDepartment) {
	        this.subDepartment = subDepartment;
	    }

	    public String getMkz() {
	        return this.mkz;
	    }

	    public void setMkz(final String mkz) {
	        this.mkz = mkz;
	    }

	    public String getQsGenre() {
	        return this.qsGenre;
	    }

	    public void setQsGenre(final String qsGenre) {
	        this.qsGenre = qsGenre;
	    }

	    public Date getReminderDate() {
	        return this.reminderDate;
	    }

	    public void setReminderDate(final Date reminderDate) {
	        this.reminderDate = reminderDate;
	    }

	    public Date getDeliveryDate() {
	        return this.deliveryDate;
	    }

	    public void setDeliveryDate(final Date deliveryDate) {
	        this.deliveryDate = deliveryDate;
	    }

	    public Long getStock() {
	        return this.stock;
	    }

	    public void setStock(final Long stock) {
	        this.stock = stock;
	    }

	    public Long getSales() {
	        return this.sales;
	    }

	    public void setSales(final Long sales) {
	        this.sales = sales;
	    }

	    public Long getSalesPreviousYear() {
	        return this.salesPreviousYear;
	    }

	    public void setSalesPreviousYear(final Long salesPreviousYear) {
	        this.salesPreviousYear = salesPreviousYear;
	    }

	    

	    public void setReturnRatePreviousYear(final Double returnRatePreviousYear) {
	        this.returnRatePreviousYear = returnRatePreviousYear;
	    }

	    public Long getForecast() {
	        return this.forecast;
	    }

	    public void setForecast(final Long forecast) {
	        this.forecast = forecast;
	    }

	    public long getMeasureQA() {
	        return this.measureQA;
	    }

	    public void setMeasureQA(final long measureQA) {
	        this.measureQA = measureQA;
	    }

	    public Set<String> getMeasureInspectionTypeNames() {
	        return this.measureInspectionTypeNames;
	    }

	    public void setMeasureInspectionTypeNames(final Set<String> measureInspectionTypeNames) {
	        this.measureInspectionTypeNames = measureInspectionTypeNames;
	    }

	    public void addMeasureInspectionTypeNames(final String name) {
	        this.measureInspectionTypeNames.add(name);
	    }

	   
	    public void setReturnRate(final Double returnRate) {
	        this.returnRate = returnRate;
	    }

	    public BigDecimal getPrice() {
	        return this.price;
	    }

	    public void setPrice(final BigDecimal price) {
	        this.price = price;
	    }

	    public boolean isAboveReturnRateThreshold() {
	        return this.aboveReturnRateThreshold;
	    }

	    public void setAboveReturnRateThreshold(final boolean aboveReturnRateThreshold) {
	        this.aboveReturnRateThreshold = aboveReturnRateThreshold;
	    }

	    public boolean isAbovePainThreshold() {
	        return this.abovePainThreshold;
	    }

	    public void setAbovePainThreshold(final boolean abovePainThreshold) {
	        this.abovePainThreshold = abovePainThreshold;
	    }

	    public boolean isInReturnReport() {
	        return this.inReturnReport;
	    }

	    public void setInReturnReport(final boolean inReturnReport) {
	        this.inReturnReport = inReturnReport;
	    }

	    public boolean isRepeat() {
	        return this.repeat;
	    }

	    public void setRepeat(final boolean repeat) {
	        this.repeat = repeat;
	    }

	    public void setStyleNo(final String styleNo) {
	        this.styleNo = styleNo;
	    }

	    public String getStyleNo() {
	        return this.styleNo;
	    }

	    public String getStyleDescription() {
	        return this.styleDescription;
	    }

	    public void setStyleDescription(final String styleDescription) {
	        this.styleDescription = styleDescription;
	    }

	    public void setItemNo(final String itemNo) {
	        this.itemNo = itemNo;
	    }

	    public String getItemNo() {
	        return this.itemNo;
	    }

	    public Set<String> getSupplierNames() {
	        return this.supplierNames;
	    }

	    public String getSupplierNamesString() {
	        return this.supplierNames.stream()
	                .collect(Collectors.joining(","));
	    }

	    public String getDisposalCodes() {
	        return this.setOfDisposalCodes.stream()
	                .map(String::valueOf)
	                .collect(Collectors.joining(","));
	    }

	    public void addDisposalCodes(final Long disposalCodes) {
	        this.setOfDisposalCodes.add(disposalCodes);
	    }

	    public Set<Long> getCollectionIds() {
	        return this.collectionIds;
	    }

	    public void setCollectionIds(final Set<Long> collectionIds) {
	        this.collectionIds = collectionIds;
	    }

	    public Long getDeliveryQuantity() {
	        return this.deliveryQuantity;
	    }

	    public void setDeliveryQuantity(final Long deliveryQuantity) {
	        this.deliveryQuantity = deliveryQuantity;
	    }

	    public String getCollectionNames() {
	        return this.collectionNames;
	    }

	    public void setCollectionNames(final String collectionNames) {
	        this.collectionNames = collectionNames;
	    }

	  
	    @Override
	    public int hashCode() {
	        return Objects.hash(getItemId());
	    }

	    public boolean hasReminder() {
	        return this.reminderDate != null;
	    }

	    public String getCollectionTypeNames() {
	        return this.collectionTypeNames;
	    }

	    public void setCollectionTypeNames(final String collectionTypeNames) {
	        this.collectionTypeNames = collectionTypeNames;
	    }

	    public String getRiskTypeNames() {
	        return this.riskTypeNames;
	    }

	    public void setRiskTypeNames(final String riskTypeNames) {
	        this.riskTypeNames = riskTypeNames;
	    }

	    public String getOffice() {
	        return this.office;
	    }

	    public void setOffice(final String office) {
	        this.office = office;
	    }

	    public String getComposition() {
	        return this.composition;
	    }

	    public void setComposition(final String composition) {
	        this.composition = composition;
	    }


	    public String getMaterialStandardTypeName() {
	        return this.materialStandardTypeName;
	    }

	    public void setMaterialStandardTypeName(final String materialStandardTypeName) {
	        this.materialStandardTypeName = materialStandardTypeName;
	    }

	    public BigDecimal getAverageRetailPrice() {
	        return this.averageRetailPrice;
	    }

	    public void setAverageRetailPrice(final BigDecimal averageRetailPrice) {
	        this.averageRetailPrice = averageRetailPrice;
	    }

	    public String getImageUrlDesc() {
	        return this.imageUrlDesc;
	    }

	    public void setImageUrlDesc(final String imageUrlDesc) {
	        this.imageUrlDesc = imageUrlDesc;
	    }

	    public String getFfpDecision() {
	        return this.ffpDecision;
	    }

	    public void setFfpDecision(final String ffpDecision) {
	        this.ffpDecision = ffpDecision;
	    }


	    public Long getRq() {
	        return this.rq;
	    }

	    public void setRq(final Long rq) {
	        this.rq = rq;
	    }

	 
}
