package com.poc.demo;

 
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

 
public class ItemVO  {

   
   
    private Long styleId;
    private String imageUrl;
    private Long itemId;
    private String itemDescription;
    private String color;
    private String department;
    private String subDepartment;
    private boolean repeat;
    private String mkz;
    private String qsGenre;

    // this data will come from d:returns webservice
    private Long stock;
    private Long sales;
    private Long salesPreviousYear;
    private Double returnRate;
    private Double returnRatePreviousYear;
    private Long forecast;

    private long measureQA;
    // private long measureBrand;
    protected Set<String> measureInspectionTypeNames = new HashSet<>();
    private Date reminderDate;
    private Date deliveryDate;
    private Long deliveryQuantity;

    private BigDecimal price;

    private boolean aboveReturnRateThreshold;
    private boolean abovePainThreshold;

    private boolean inReturnReport;
    private String styleNo;
    private String styleDescription;
    private String itemNo;
    private final Set<Long> setOfDisposalCodes = new HashSet<>();
    private Set<Long> collectionIds = new HashSet<>();

    protected Set<String> supplierNames = new HashSet<>();

    private String collectionNames;
    private String collectionTypeNames;
    private String riskTypeNames;
    private String office;
    private String composition;
    private String materialStandardTypeName;
    private BigDecimal averageRetailPrice;
    private String imageUrlDesc;
    private String ffpDecision;
    private BigDecimal rq;

    private Long countOfRepeat;
//    private Set<Long> lkz = new HashSet<>();
    private Long itemOptionId;
    private Long localeGroupId;

    
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

    public Double getReturnRatePreviousYear() {

        return this.returnRatePreviousYear;
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

    public Double getReturnRate() {
        return this.returnRate;
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
 

    public void setCriticalityIcon(final String criticalityIcon) {
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

    public void setAverageRetailPrice(final BigDecimal bigDecimal) {
        this.averageRetailPrice = bigDecimal;
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

    public BigDecimal getRq() {
        return this.rq;
    }

    public void setRq(final BigDecimal rq) {
        this.rq = rq;
    }

    public Long getCountOfRepeat() {
        return this.countOfRepeat;
    }

    public void setCountOfRepeat(final Long countOfRepeat) {
        this.countOfRepeat = countOfRepeat;
    }

//    public void addLkz(final Long supplierNo) {
//        this.lkz.add(supplierNo);
//    }
//
//    // public Set<Long> getLkz() {
//    // return this.lkz;
//    // }
//
//    public void setLkz(final Set<Long> lkz) {
//        this.lkz = lkz;
//    }
//
//    public String getLkz() {
//        return this.lkz.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining(", "));
//    }

  

    public Long getItemOptionId() {
        return this.itemOptionId;
    }

    public void setItemOptionId(final Long itemOptionId) {
        this.itemOptionId = itemOptionId;
    }

    public Long getLocaleGroupId() {
        return this.localeGroupId;
    }

    public void setLocaleGroupId(final Long localeGroupId) {
        this.localeGroupId = localeGroupId;
    }

    /**
     * Workaround since the grid these vos are displayed in uses only object address when comparing and replacing vos
     *
     * @param other
     */
    public void copyProperties(final ItemVO other) {
        this.itemId = other.getItemId();
        this.itemNo = other.getItemNo();
        this.styleId = other.getStyleId();
        this.styleNo = other.getStyleNo();
        this.supplierNames = other.getSupplierNames();
        this.inReturnReport = other.isInReturnReport();
        this.aboveReturnRateThreshold = other.isAboveReturnRateThreshold();
        this.abovePainThreshold = other.isAbovePainThreshold();
        this.price = other.getPrice();
        this.deliveryDate = other.getDeliveryDate();
        this.reminderDate = other.getReminderDate();
        this.measureInspectionTypeNames = other.getMeasureInspectionTypeNames();
        // this.measureBrand = other.getMeasureBrand();
        this.measureQA = other.getMeasureQA();
        this.forecast = other.getForecast();
        this.returnRatePreviousYear = other.getReturnRatePreviousYear();
        this.returnRate = other.getReturnRate();
        this.salesPreviousYear = other.getSalesPreviousYear();
        this.sales = other.getSales();
        this.stock = other.getStock();
        this.qsGenre = other.getQsGenre();
        this.mkz = other.getMkz();
        this.repeat = other.isRepeat();
        this.subDepartment = other.getSubDepartment();
        this.department = other.getDepartment();
        this.color = other.getColor();
        this.itemDescription = other.getItemDescription();
        this.styleDescription = other.getStyleDescription();
        this.imageUrl = other.getImageUrl();
        this.collectionNames = other.getCollectionNames();
        this.collectionTypeNames = other.getCollectionTypeNames();
        this.riskTypeNames = other.getRiskTypeNames();
        this.office = other.getOffice();
        this.rq = other.getRq();
        this.countOfRepeat = other.getCountOfRepeat();
        this.itemOptionId = other.getItemOptionId();
        this.localeGroupId=other.getLocaleGroupId();
    }

}
