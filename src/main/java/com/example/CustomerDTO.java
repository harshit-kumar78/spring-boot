package com.example;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;

//@Validated
public class CustomerDTO {
	
	
	private Integer customerId;

//	@Email(message = "{error}")
//	@NotNull(message = "{error}")
//	@NotBlank(message="please provide some values")
	private String emailId;

	@NotNull(message = "Please provide customer name")
    @Pattern(regexp="[A-Za-z]+( [A-Za-z]+)*", message="{customer.name.error}")
	private String name;
	
	public CustomerDTO(Integer customerId, String emailId, String name) {
		super();
		this.customerId = customerId;
		this.emailId = emailId;
		this.name = name;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", emailId=" + emailId + ", name=" + name + "]";
	}
	
}