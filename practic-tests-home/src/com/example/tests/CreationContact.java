package com.example.tests;


import org.testng.annotations.Test;

public class CreationContact extends BaseClassForContact{
	
  @Test
  public void testCreatContact() throws Exception {
openMainPage();
createNewContact();
DataForContact data = new DataForContact();
data.namecontact = "����";
data.familiya = "����";
data.town = "��������������";
data.phone1 = "050 123";
data.phone2 = "050 456";
data.phone3 = "050 789";
data.mail1 = "�����1";
data.mail2 = "�����2";
data.dateBirth = "28";
data.monthBirth = "������";
data.yearBirth = "1980";
data.address = "������";
data.house = "130";
fillContactForms(data);
submitCreation();
returnToMainPage();
  }
  
  @Test
  public void testCreateEmptyContact() throws Exception {
openMainPage();
createNewContact();
fillContactForms(new DataForContact("", "", "", "", "", "", "", "", "-", "-", "", "", ""));
submitCreation();
returnToMainPage();
  }
}
