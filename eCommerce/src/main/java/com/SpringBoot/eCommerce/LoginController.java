package com.SpringBoot.eCommerce;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class LoginController {
	@Autowired
	LoginDao LDao;
	
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public List<User> getallusers() throws SQLException
	{
		List<User> userList = LDao.findAll();
       return userList;
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Optional<User> logindata(@RequestBody User user) throws SQLException
	{
		String isValid="";
		Optional<User> user1= LDao.findByuname(user.getUname());
       return user1;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUser(@RequestBody User user) throws SQLException
	{
		
		String isSaved="";
		if(LDao.save(user) != null)
			{
			isSaved="Yes";
			 return isSaved;
			}else
			{
				isSaved="No";
				return isSaved;
			}
		
		
		
	}
    
	}
