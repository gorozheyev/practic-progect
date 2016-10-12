package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class BaseClass {
	
	protected ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();   
	  }

	@AfterTest
	public void tearDown() throws Exception {
		app.sotp();
	    
	  }
	
	@DataProvider
	public Iterator<Object[]> randomValidGroupsGenerator(){
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i=0; i<5; i++){
			DataForCreateGroup group = new DataForCreateGroup();
			group.name1 = generateRandomeString();			
			group.header = generateRandomeString();
			group.footer = generateRandomeString();
			list.add(new Object[]{group});
		}
		return list.iterator();
	}
	
	public String generateRandomeString(){
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0){
			return "";
		}
		else {
			return "test" + rnd.nextInt();
		}
	}
}
