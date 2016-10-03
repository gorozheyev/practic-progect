package com.example.tests;

public class DataForContact {
	public String namecontact;
	public String familiya;
	public String town;
	public String phone1;
	public String phone2;
	public String phone3;
	public String mail1;
	public String mail2;
	public String dateBirth;
	public String monthBirth;
	public String yearBirth;
	public String address;
	public String house;

	public DataForContact(String namecontact, String familiya, String town,
			String phone1, String phone2, String phone3, String mail1,
			String mail2, String dateBirth, String monthBirth,
			String yearBirth, String address, String house) {
		this.namecontact = namecontact;
		this.familiya = familiya;
		this.town = town;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.mail1 = mail1;
		this.mail2 = mail2;
		this.dateBirth = dateBirth;
		this.monthBirth = monthBirth;
		this.yearBirth = yearBirth;
		this.address = address;
		this.house = house;
	}
	
	public DataForContact(){
	}
}