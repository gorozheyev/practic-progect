package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends BaseClass{
	
	@Test
	public void deleteSomeContact(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().openFirstContact();
		app.getContactHelper().deleteContact();
		app.getContactHelper().returnToMainPage();
	}

}
