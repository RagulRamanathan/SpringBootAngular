package com.SpringBoot.eCommerce;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String uname;
	String password;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", password=" + password + "]";
	}
    
    public String privateFunction()
    {
    	return "Calling private function";
    	
    }
}
