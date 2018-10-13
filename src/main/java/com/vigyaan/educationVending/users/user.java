package com.vigyaan.educationVending.users;

import javax.validation.constraints.NotEmpty;

import org.mindrot.jbcrypt.BCrypt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

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
    @Id		//primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", updatable=false, nullable=false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
  	@Email(message = "Please provide a valid e-mail")
  	@NotEmpty(message = "Please provide an e-mail")
  	private String email;

    @Column(name = "password")
    @JsonProperty(access = Access.WRITE_ONLY)
  	private String password;

    @Column(name = "first_name")
    @NotEmpty(message = "Please provide your first name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
	  @NotEmpty(message = "Please provide your last name")
    private String lastName;


  	public Long getId() {
  		return id;
  	}

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
  	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  	
  	public void setPassword(String password) {
  		this.password = hashPassword(password);
  	}
  		
  	private String hashPassword(String plainTextPassword){
		return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
	}
  	
  	/*
  	private void checkPass(String plainPassword, String hashedPassword) {
		if (BCrypt.checkpw(plainPassword, hashedPassword))
			System.out.println("The password matches.");
		else
			System.out.println("The password does not match.");
	}*/
  	
  	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
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
