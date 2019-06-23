package com.SpringBoot.eCommerce;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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
	
	@Autowired
	EmployeeRepository emp;
	
	@Autowired
    MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public List<User> getallusers() throws SQLException
	{
		List<User> userList = LDao.findAll();
       return userList;
	}
	public List<User> testList()
	{
		List<User> useList=new ArrayList();
    	User u1=new User();
    	u1.setId(101);
    	u1.setUname("RR");
    	useList.add(u1);
    	User u2=new User();
    	u2.setId(102);
    	u2.setUname("RRs");
    	useList.add(u2);
    	
    	
    	return useList;
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
	@RequestMapping(value="/saveEmp",method=RequestMethod.POST)
	public String saveEmployee(@RequestBody Employee employee) throws SQLException
	{
		String isSaved="";
		if(emp.insert(employee) != null)
			{
			isSaved="Yes";
			 return isSaved;
			}else
			{
				isSaved="No";
				return isSaved;
			}
		
		
		
	}
	@RequestMapping(value="/getEmp",method=RequestMethod.POST)
	public List<Employee> getEmployee() throws SQLException
	{
			Query query = new Query(Criteria.where("name").is("Ragul Ramanathan"));
			query.with(new Sort(Sort.Direction.ASC,"name"));
			List<Employee> eList=(List) mongoTemplate.find(query, Employee.class);
			return eList;
		
	}

	@RequestMapping(value="/updateEmp",method=RequestMethod.POST)
	public String updateEmployee(@RequestBody Employee employee) throws SQLException
	{
		String isSaved="";
		employee.setDesignation("Lead Developer");
		if(emp.save(employee) != null)
		{
		isSaved="Yes";
		 return isSaved;
		}else
		{
			isSaved="No";
			return isSaved;
		}
	

		
	}
	@RequestMapping(value="/deleteEmp",method=RequestMethod.POST)
	public void deleteEmployee(@RequestBody Employee employee) throws SQLException
	{
			emp.delete(employee);

		
	}

	}
