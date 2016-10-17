package com.example.tests;

import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CreationContact extends BaseClass{
 
  @Test
  public void testCreateContact() throws Exception {
	app.getNavigationHelper().openMainPage();
	
//	save old state
	List<DataForCreateContact> oldList = app.getContactHelper().getContacts();
	
//	actions
	app.getContactHelper().addNewContact();
	DataForCreateContact data =new DataForCreateContact();
	data.namecontact = "aaa";
	data.familiya = "Горо";
	data.town = "Днепр";
	data.phone1 = "050 123";
	data.phone2 = "050 456";
	data.phone3 = "050 789";
	data.mail1 = "почта1";
	data.mail2 = "почта2";
	data.dateBirth = "28";
	data.monthBirth = "Август";
	data.yearBitrh = "1980";
	data.address = "Победа";
	data.bilding = "130";
	app.getContactHelper().fillContactForms(data);
	app.getContactHelper().submitCreationContact();
	app.getContactHelper().returnToMainPage();
	
//	save new state
	List<DataForCreateContact> newList = app.getContactHelper().getContacts();
	
//	compare states	
	oldList.add(data);
	Collections.sort(oldList);
	assertEquals(newList, oldList);
	
  }
  
  @Test
  public void testCteateEmptyContact() throws Exception {
	app.getNavigationHelper().openMainPage();
	
//	save old state
	List<DataForCreateContact> oldList = app.getContactHelper().getContacts();
	
//	actions
	app.getContactHelper().addNewContact();
	DataForCreateContact data = new DataForCreateContact();
	data.namecontact = "";
	data.familiya = "Горо";
	data.town = "";
	data.phone1 = "";
	data.phone2 = "";
	data.phone3 = "";
	data.mail1 = "";
	data.mail2 = "";
	data.dateBirth = "-";
	data.monthBirth = "-";
	data.yearBitrh = "";
	data.address = "";
	data.bilding = "";
	app.getContactHelper().fillContactForms(data);
	app.getContactHelper().submitCreationContact();
	app.getContactHelper().returnToMainPage();
	
//	save new state
	List<DataForCreateContact> newList = app.getContactHelper().getContacts();
	
//	compare states
	oldList.add(data);
	Collections.sort(oldList);
	assertEquals(newList, oldList);
  }
}
