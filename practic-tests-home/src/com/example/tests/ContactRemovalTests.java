package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactRemovalTests extends BaseClass{
	
	@Test
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		
		
//		save old state
		List<DataForCreateContact> oldList = app.getContactHelper().getContacts();
		
//		actions
		app.getContactHelper().openFirstContact();
		app.getContactHelper().deleteContact();
		app.getContactHelper().returnToMainPage();
		
//		save new state
		List<DataForCreateContact> newList = app.getContactHelper().getContacts();
		
//		compare states
		oldList.remove(0);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}

}
