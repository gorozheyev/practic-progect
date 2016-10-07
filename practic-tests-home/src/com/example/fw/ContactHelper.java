package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.DataForCreateContact;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void addNewContact() {
		click(By.linkText("Добавить новый"));
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

	public void deleteContact() {
		click(By.xpath("(//input[@name='update'])[2]"));
	}
	
	public void openFirstContact(){
		click(By.cssSelector("img[alt='Изменить']"));
	}

}
