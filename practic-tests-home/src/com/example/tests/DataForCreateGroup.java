package com.example.tests;

public class DataForCreateGroup implements Comparable<DataForCreateGroup>{
	
	private String name1;
	private String header;
	private String footer;

	public DataForCreateGroup(String name1, String header, String footer) {
		this.name1 = name1;
		this.header = header;
		this.footer = footer;
	}
	
	public DataForCreateGroup() {
	}

	

	@Override
	public String toString() {
		return "DataForCreateGroup [name1=" + name1 + ", header=" + header
				+ ", footer=" + footer + "]";
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

	public DataForCreateGroup withName(String name1) {
		this.name1 = name1;
		return this;
	}

	public String getName1() {
		return name1;
	}

	public String getHeader() {
		return header;
	}

	public String getFooter() {
		return footer;
	}

	public DataForCreateGroup withHeader(String header) {
		this.header = header;
		return this;
	}

	public DataForCreateGroup withFooter(String footer) {
		this.footer = footer;
		return this;
	}
	
	
}