package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.DataForCreateGroup;

public class GroupHelper extends HelperBase{
	
	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void createNewGroup() {
		click(By.name("new"));
	}

	public void fillGroupForms(DataForCreateGroup group) {
	    type(By.name("group_name"), group.name1);
	    type(By.name("group_header"), group.header);
	    type(By.name("group_footer"), group.footer);
	}

	public void submitCreation() {
		click(By.name("submit"));
	}

	
	public void goToGroupPage() {
		click(By.linkText("group page"));
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + index + "]"));
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}

	public void submitGroupModification() {
		click(By.name("update"));
		
	}

	
	
}
