package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class ContactRemovalTests extends BaseClass{
	
	@Test
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		
		
//		save old state
		List<DataForCreateContact> oldList = app.getContactHelper().getContacts();
		
		Random rnd = new Random();
		int index = rnd.nextInt(oldList.size() - 1);
		
//		actions
		app.getContactHelper().openFirstContact(index);
		app.getContactHelper().deleteContact(index);
		app.getContactHelper().returnToMainPage();
		
//		save new state
		List<DataForCreateContact> newList = app.getContactHelper().getContacts();
		
//		compare states
		oldList.remove(index);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}

}
