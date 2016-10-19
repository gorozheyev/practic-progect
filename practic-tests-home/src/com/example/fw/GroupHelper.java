package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.DataForCreateGroup;

public class GroupHelper extends HelperBase{
	
	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void createNewGroup() {
		click(By.name("new"));
	}

	public void fillGroupForms(DataForCreateGroup group) {
	    type(By.name("group_name"), group.getName1());
	    type(By.name("group_header"), group.getHeader());
	    type(By.name("group_footer"), group.getFooter());
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
		click(By.xpath("//input[@name='selected[]'][" + (index+1) + "]"));
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}

	public void submitGroupModification() {
		click(By.name("update"));
		
	}

	public List<DataForCreateGroup> getGroups() {
		List<DataForCreateGroup> groups = new ArrayList<DataForCreateGroup>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			String title = checkbox.getAttribute("title");
			String name1 = title.substring("Select (".length(), title.length() - ")".length());
			groups.add(new DataForCreateGroup().withName(name1));
		}
		return groups;
	}

	
	
}
