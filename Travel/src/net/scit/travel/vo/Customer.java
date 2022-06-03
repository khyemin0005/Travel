package net.scit.travel.vo;

public class Customer {
	private String customer_id;
	private String customer_pw;
	private String customer_name;
	private String email;
	
	public Customer() {
		super();
	}

	public Customer(String customer_id, String customer_pw, String customer_name, String email) {
		super();
		this.customer_id = customer_id;
		this.customer_pw = customer_pw;
		this.customer_name = customer_name;
		this.email = email;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_pw() {
		return customer_pw;
	}

	public void setCustomer_pw(String customer_pw) {
		this.customer_pw = customer_pw;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_pw=" + customer_pw + ", customer_name="
				+ customer_name + ", email=" + email + "]";
	}
	

	
}
