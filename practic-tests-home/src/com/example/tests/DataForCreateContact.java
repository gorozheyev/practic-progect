package com.example.tests;

public class DataForCreateContact implements Comparable<DataForCreateContact>{
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

	@Override
	public String toString() {
		return "DataForCreateContact [namecontact=" + namecontact + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((namecontact == null) ? 0 : namecontact.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataForCreateContact other = (DataForCreateContact) obj;
		if (namecontact == null) {
			if (other.namecontact != null)
				return false;
		} else if (!namecontact.equals(other.namecontact))
			return false;
		return true;
	}

	@Override
	public int compareTo(DataForCreateContact other) {
		return this.namecontact.toLowerCase().compareTo(other.namecontact.toLowerCase());
	}
	
	
}