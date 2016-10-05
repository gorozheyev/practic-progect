package com.example.tests;

public class DataForCreateContact {
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
	public String yearBitrh;
	public String address;
	public String bilding;

	public DataForCreateContact(String namecontact, String familiya,
			String town, String phone1, String phone2, String phone3,
			String mail1, String mail2, String dateBirth, String monthBirth,
			String yearBitrh, String address, String bilding) {
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
		this.yearBitrh = yearBitrh;
		this.address = address;
		this.bilding = bilding;
	}
	
	public DataForCreateContact() {	
	}
}