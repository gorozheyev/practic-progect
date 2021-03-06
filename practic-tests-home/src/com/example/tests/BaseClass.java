package com.example.tests;

import static com.example.tests.GroupDataGenerator.generateRandomeGroups;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class BaseClass {
	
	protected ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		String configFile = System.getProperty("configFile", "application.properties");
		Properties properties = new Properties();
		properties.load(new FileReader(new File(configFile)));
		app = new ApplicationManager(properties);   
	  }

	@AfterTest
	public void tearDown() throws Exception {
		app.sotp();
	    
	  }
	
	@DataProvider
	public Iterator<Object[]> randomValidGroupsGenerator(){
		return wrapGroupsForDataProvider(generateRandomeGroups(5)).iterator();
	}
	
	public static List<Object[]> wrapGroupsForDataProvider(List<DataForCreateGroup> groups) {
		List<Object[]> list = new ArrayList<Object[]>();
		for (DataForCreateGroup group : groups) {
			list.add(new Object[]{group});
		}
		return list;
	}	
	
//	@DataProvider
//	public Iterator<Object[]> randomValidContactGenerator(){
//		List<Object[]> list = new ArrayList<Object[]>();
//		for (int i = 0; i < 5; i++) {
//			DataForCreateContact data = new DataForCreateContact();
//			data.namecontact = generateRandomeString();
//			data.familiya = generateRandomeString();
//			data.town = generateRandomeString();   
//			data.phone1 = generateRandomeString();   
//			data.phone2 = generateRandomeString();  
//			data.phone3 = generateRandomeString();   
//			data.mail1 = generateRandomeString();   
//			data.mail2 = generateRandomeString();   
//			data.dateBirth = "";
//			data.monthBirth = "";
//			data.yearBitrh = generateRandomeString();
//			data.address = generateRandomeString(); 
//			data.bilding = generateRandomeString();
//			list.add(new Object[]{data});
//		}
//		return list.iterator();
//	}
}
