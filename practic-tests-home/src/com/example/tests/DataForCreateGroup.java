package com.example.tests;

public class DataForCreateGroup implements Comparable<DataForCreateGroup>{
	
	public String name1;
	public String header;
	public String footer;

	public DataForCreateGroup(String name1, String header, String footer) {
		this.name1 = name1;
		this.header = header;
		this.footer = footer;
	}
	
	public DataForCreateGroup() {
	}

	@Override
	public String toString() {
		return "DataForCreateGroup [name1=" + name1 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + ((name1 == null) ? 0 : name1.hashCode());
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
		DataForCreateGroup other = (DataForCreateGroup) obj;
		if (name1 == null) {
			if (other.name1 != null)
				return false;
		} else if (!name1.equals(other.name1))
			return false;
		return true;
	}

	@Override
	public int compareTo(DataForCreateGroup other) {
		return this.name1.toLowerCase().compareTo(other.name1.toLowerCase());
	}
	
	
}