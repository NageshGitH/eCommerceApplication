package com.ecommerce.restapi.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class SearchRequest  
{
	
 //  @NotEmpty(message="Provide product name")
	//@Size(max=10,min=5,message="criteria not met")
	//@Max,@Past,@Future(date)
   private String productName;
   //@NotEmpty(message="Provide category name")
   private String categoryName;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
   
   
   
}
