package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CreationContact extends BaseClass{
	
	
	
	public String generateRandomeString(){
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0) {
			return "";
			}else{
				return "test" + rnd.nextInt();
			}
	}
 
//  @Test(dataProvider = "randomValidContactGenerator")
  public void testCreateContactWithValidData(DataForCreateContact data) throws Exception {
	app.getNavigationHelper().openMainPage();
	
//	save old state
	List<DataForCreateContact> oldList = app.getContactHelper().getContacts();
	
//	actions
	app.getContactHelper().addNewContact();
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
