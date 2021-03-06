package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.DataForCreateContact;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void addNewContact() {
		click(By.linkText("�������� �����"));
	}

	public void fillContactForms(DataForCreateContact data) {
		type(By.name("firstname"), data.namecontact);
		type(By.name("lastname"), data.familiya);	   
		type(By.name("address"), data.town);	   
		type(By.name("home"), data.phone1);	   
		type(By.name("mobile"), data.phone2);	   
		type(By.name("work"), data.phone3);	   
		type(By.name("email"), data.mail1);	   
		type(By.name("email2"), data.mail2);	   		      
	    selectByText(By.name("bday"), data.dateBirth);
	    selectByText(By.name("bmonth"), data.monthBirth);	    
	    type(By.name("byear"), data.yearBitrh);	
		type(By.name("address2"), data.address);	
		type(By.name("phone2"), data.bilding);	
	}

	public void submitCreationContact() {
		click(By.name("submit"));
	}

	public void returnToMainPage() {
		click(By.linkText("home page"));
	}

	public void deleteContact(int index) {
		click(By.xpath("(//input[@name='update'])[2]"));
	}
	
	public void openFirstContact(int index){
		click(By.cssSelector("img[alt='��������']"));
	}

	public void submitContactForms() {
		click(By.xpath("(//input[@name='update'])[1]"));
		
	}

	public List<DataForCreateContact> getContacts() {
		List<DataForCreateContact> contacts = new ArrayList<DataForCreateContact>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			DataForCreateContact contact = new DataForCreateContact();
			String title = checkbox.getAttribute("title");
			contact.namecontact = title.substring("Select (".length(), title.length() - " ����)".length());
			contacts.add(contact);
		}
		return contacts;
	}

}
