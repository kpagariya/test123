package com.hibernate.learning.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "person") 
public class Person {
	private int seq;
	private String userName;
	private String password;
	private Date createDate;
	
	public Person(){
		 
	}
 
	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public int getSeq() {
		return seq;
	}
 
	public void setSeq(int seq) {
		this.seq = seq;
	}
 
	@Column(name = "USER_NAME")
	public String getUserName() {
		return userName;
	}
 
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
 
	@Column(name = "CREATE_DATE")
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
