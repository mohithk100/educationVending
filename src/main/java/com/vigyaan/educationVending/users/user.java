package com.vigyaan.educationVending.users;

import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;


@Entity
@Table(name = "users")
public class user {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
  	@Email(message = "Please provide a valid e-mail")
  	@NotEmpty(message = "Please provide an e-mail")
  	private String email;

    @Column(name = "password")
  	@Transient
  	private String password;

    @Column(name = "first_name")
    @NotEmpty(message = "Please provide your first name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
	  @NotEmpty(message = "Please provide your last name")
    private String lastName;



  	/**
  	* Returns value of id
  	* @return
  	*/
  	public Long getId() {
  		return id;
  	}

  	/**
  	* Sets new value of id
  	* @param
  	*/
  	public void setId(Long id) {
  		this.id = id;
  	}

  	/**
  	* Returns value of email
  	* @return
  	*/
  	public String getEmail() {
  		return email;
  	}

  	/**
  	* Sets new value of email
  	* @param
  	*/
  	public void setEmail(String email) {
  		this.email = email;
  	}

  	/**
  	* Returns value of password
  	* @return
  	*/
  	public String getPassword() {
  		return password;
  	}

  	/**
  	* Sets new value of password
  	* @param
  	*/
  	public void setPassword(String password) {
  		this.password = password;
  	}

  	/**
  	* Returns value of firstName
  	* @return
  	*/
  	public String getFirstName() {
  		return firstName;
  	}

  	/**
  	* Sets new value of firstName
  	* @param
  	*/
  	public void setFirstName(String firstName) {
  		this.firstName = firstName;
  	}

  	/**
  	* Returns value of middleName
  	* @return
  	*/
  	public String getMiddleName() {
  		return middleName;
  	}

  	/**
  	* Sets new value of middleName
  	* @param
  	*/
  	public void setMiddleName(String middleName) {
  		this.middleName = middleName;
  	}

  	/**
  	* Returns value of lastName
  	* @return
  	*/
  	public String getLastName() {
  		return lastName;
  	}

  	/**
  	* Sets new value of lastName
  	* @param
  	*/
  	public void setLastName(String lastName) {
  		this.lastName = lastName;
  	}
}
