package com.pks;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanResource 
{
	@RequestMapping("/names")
	public List<Person> getAliens(){
		
		List<Person> al=new ArrayList<Person>();
		
		Person al1=new Person();
		al1.setId(10);
		al1.setName("Prasanta");
		al1.setPoints(1000);
		
		Person al2=new Person();
		al2.setId(12);
		al2.setName("Sukanta");
		al2.setPoints(2000);

		al.add(al1);
		al.add(al2);
		
		return al;
	}

}
