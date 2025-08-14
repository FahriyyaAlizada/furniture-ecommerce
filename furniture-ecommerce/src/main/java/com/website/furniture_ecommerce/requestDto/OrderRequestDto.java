package com.website.furniture_ecommerce.requestDto;

public class OrderRequestDto {
	private Integer cartId;
	private String firstName;
	private String lastName;
	private String country;
	private String address; 
	private String city;
	private String phone;
	private String email;
	private String cartNumber;
	private String zipCode;
	private String expiryMonth;
	private Integer expiryYear;
	
	public OrderRequestDto() {
		// TODO Auto-generated constructor stub
	}

	public OrderRequestDto(Integer cartId, String firstName, String lastName, String country, String address,
			String city, String phone, String email, String cartNumber, String zipCode, String expiryMonth,
			Integer expiryYear) {
		super();
		this.cartId = cartId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
		this.cartNumber = cartNumber;
		this.zipCode = zipCode;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCartNumber() {
		return cartNumber;
	}

	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public Integer getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(Integer expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	
}
