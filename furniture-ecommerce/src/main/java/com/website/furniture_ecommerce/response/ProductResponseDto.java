package com.website.furniture_ecommerce.response;

public class ProductResponseDto {
	private Integer id;
	private String name;
	private Double price;
	private String image;
	
	public ProductResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductResponseDto(Integer id, String name, Double price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
	}

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
