package com.SpringBoot.eCommerce;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;


@RunWith(MockitoJUnitRunner.class)

public class ECommerceApplicationTests {

	
	LoginController	loginController=new LoginController();
	
    @SuppressWarnings("deprecation")
	@Test
    public void testClass() throws SQLException
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
    	
    	assertEquals(loginController.testList().size(),useList.size());
    }
}
