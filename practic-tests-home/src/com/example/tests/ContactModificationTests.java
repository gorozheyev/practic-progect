package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends BaseClass{
	
	@Test
	public void modificateSomeGroup(){
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().openFirstContact();
	DataForCreateContact data = new DataForCreateContact();
	data.namecontact = "����� ���";
	data.familiya = "����� �������";
	data.dateBirth = "-";
	data.monthBirth = "-";
	app.getContactHelper().fillContactForms(data);
	app.getContactHelper().submitContactForms();
	app.getContactHelper().returnToMainPage();
	}

}
