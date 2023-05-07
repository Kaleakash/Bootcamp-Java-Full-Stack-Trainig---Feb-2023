package com.eshopping.customer.bean;

public class Users {

    	private String username;
    	private String fullName;
    private Address address;
    private String emailid;
    	private String password;
    	private String img;
    	private long contact;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Users [username=" + username + ", fullName=" + fullName + ", address=" + address + ", emailid="
				+ emailid + ", password=" + password + ", img=" + img + ", contact=" + contact + "]";
	}
	public Users(String username, String fullName, Address address, String emailid, String password, String img,
			long contact) {
		super();
		this.username = username;
		this.fullName = fullName;
		this.address = address;
		this.emailid = emailid;
		this.password = password;
		this.img = img;
		this.contact = contact;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}
