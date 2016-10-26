package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactModificationTests extends BaseClass{
	
	@Test(dataProvider = "randomValidContactGenerator")
	public void modificateSomeGroup(DataForCreateContact data){
	app.navigateTo().mainPage();
	
//	save old state
	List<DataForCreateContact> oldList = app.getContactHelper().getContacts();
	
	Random rnd = new Random();
	int index = rnd.nextInt(oldList.size() - 1);
	
//	actions
	app.getContactHelper().openFirstContact(index);
	app.getContactHelper().fillContactForms(data);
	app.getContactHelper().submitContactForms();
	app.getContactHelper().returnToMainPage();
	
//	save new state
	List<DataForCreateContact> newList = app.getContactHelper().getContacts();
	
//	compare states
	oldList.remove(index);
	oldList.add(data);
	Collections.sort(oldList);
	assertEquals(newList, oldList);
	}

}
