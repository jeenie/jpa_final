package net.skhu.model;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class ProductModel {
	@NotEmpty
	@Size(min=3, max=20)
	String productCode;
	
	@NotEmpty
	@Size(min=5, max=50)
	String productName;
	
	//@NotEmpty(message="표준가격은 필수 입력 항목입니다.")
	Double standardCost;
	
	//@NotEmpty(message="표시가격은 필수 입력 항목입니다.")
	Double listPrice;
	
	String quantity;
	
	String category;
}
