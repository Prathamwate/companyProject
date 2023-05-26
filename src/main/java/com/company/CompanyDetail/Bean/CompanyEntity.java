package com.company.CompanyDetail.Bean;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="companydetails")
public class CompanyEntity {
	
	@Id
	@Column(name="companyid")
	private int companyid;
	
	@Column(name="companyname")
	private String companyname;
	
	@Column(name="email")
	private String email;
	
	@Column(name=" founded")
	private int  founded;
	
	@Column(name=" category")
	private String   category;
	
	@Column(name="country")
	private String country;
	
	@Column(name=" number_of_employees")
	private int  number_of_employees;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "companyid" )
	private List<Address> address;
	


	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getFounded() {
		return founded;
	}

	public void setFounded(int founded) {
		this.founded = founded;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumber_of_employees() {
		return number_of_employees;
	}

	public void setNumber_of_employees(int number_of_employees) {
		this.number_of_employees = number_of_employees;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
