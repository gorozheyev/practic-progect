package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactModificationTests extends BaseClass{
	
	@Test
	public void modificateSomeGroup(){
	app.getNavigationHelper().openMainPage();
	
//	save old state
	List<DataForCreateContact> oldList = app.getContactHelper().getContacts();
	
//	actions
	app.getContactHelper().openFirstContact();
	DataForCreateContact data = new DataForCreateContact();
	data.namecontact = "Дима";
	data.familiya = "Горо";
	data.dateBirth = "-";
	data.monthBirth = "-";
	app.getContactHelper().fillContactForms(data);
	app.getContactHelper().submitContactForms();
	app.getContactHelper().returnToMainPage();
	
//	save new state
	List<DataForCreateContact> newList = app.getContactHelper().getContacts();
	
//	compare states
	oldList.remove(0);
	oldList.add(data);
	Collections.sort(oldList);
	assertEquals(newList, oldList);
	}

}
