/*package com.SpringBoot.eCommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.assertj.core.util.Arrays;

public class OOPS {
	
	public static void main (String[] args)
	{
	 
		String str=new String("sachin");
		String str1=str+"Tendulkar";
		
			System.out.println(str1);
		
		List<Integer> genericList =new ArrayList<>();
		genericList.add(5);
		genericList.add(12);
		genericList.add(9);
		genericList.add(4);
		List<Integer> duplicateList =new ArrayList<>();
		duplicateList.add(5);
		duplicateList.add(7);
		duplicateList.add(3);
		duplicateList.add(4);
		Set<Integer> uniqueSet=new HashSet<>();
		uniqueSet.addAll(genericList);
		uniqueSet.addAll(duplicateList);
		System.out.println(uniqueSet);
		Set<String> StringSet=new HashSet<>();
		StringSet.add("Arun");
		StringSet.add("Balaji");
		StringSet.add("Ginger");
		StringSet.add("Chandru");
		StringSet.add("Arun");
		System.out.println(StringSet);
		duplicateList.stream().forEach(System.out::println);
		System.out.println("Break");
		Set<User> hashSet=new TreeSet<>();
		List<User> useList=new ArrayList<>();
		User user1=new User();
		user1.setId(4);
		user1.setUname("Ragul");
		user1.setPassword("Dhan2045#");
		user1.setSalary(70000);
		hashSet.add(user1);
		useList.add(user1);
		User user2=new User();
		user2.setId(5);
		user2.setUname("Hareesh");
		user2.setPassword("Dhan2045#");
		user2.setSalary(80000);
		hashSet.add(user2);
		useList.add(user2);
		User user3=new User();
		user3.setId(1);
		user3.setUname("Lal");
		user3.setPassword("Dhan2045#");
		user3.setSalary(40000);
		hashSet.add(user3);
		useList.add(user3);
		hashSet.forEach(i-> System.out.println(i.uname));
		List<User> iList=useList.stream().sorted().collect(Collectors.toList());
		User max=useList.stream().max(User::compareTo).get();
		User min=useList.stream().min(User::compareTo).get();
		System.out.println(max.getSalary());
		System.out.println(min.getSalary());
		Optional<User> maxString=useList.stream().reduce((user5,user4)-> user5.getUname().length()>user4.getUname().length() ? user5: user4);
		System.out.println("Break2");
		iList.forEach(i-> System.out.println(i.uname));
		Immutable IM=new Immutable(101,"Ragul");
		System.out.println(IM.getName());
		final User user4=new User();
		String name="Ragul";
		user4.setUname(name);
		System.out.println(user4.getUname());
		name="RagulR";
		user4.setUname(name);
		System.out.println(user4.getUname());
		Singleton s=Singleton.getInstance();
		s.setId(101);
		s.setName("Hareesh");
		Singleton s1=Singleton.getInstance();
		s1.setId(102);
		s1.setName("Ram");
		System.out.println(s1.getName());
		System.out.println(s.getName());
        OOPS.emp e=new OOPS.emp();
        e.setUname("Ram1");
        System.out.println(e.getUname());
        
	}
	int add(int a,int b)
	{
		return a+b;
	}
	Double add(int a,int b,int c)
	{
		return Double.parseDouble(String.valueOf(a+b)) ;
	}
	    static class emp
	    {
	    	int userid;
	    	String uname;
			public int getUserid() {
				return userid;
			}
			public void setUserid(int userid) {
				this.userid = userid;
			}
			public String getUname() {
				return uname;
			}
			public void setUname(String uname) {
				this.uname = uname;
			}
	    	
	    }
	
}
*/