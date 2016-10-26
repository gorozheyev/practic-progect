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
	
	private List<DataForCreateGroup> cachedGroups;
	
	public List<DataForCreateGroup> getGroups() {
		if (cachedGroups == null){
			rebuildCache();
		}
		return cachedGroups;
	}
		
	private void rebuildCache() {
		List<DataForCreateGroup> cachedGroups = new ArrayList<DataForCreateGroup>();
		manager.navigateTo().groupsPage();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			String title = checkbox.getAttribute("title");
			String name1 = title.substring("Select (".length(), title.length() - ")".length());
			cachedGroups.add(new DataForCreateGroup().withName(name1));
		}
	}

	public GroupHelper createGroup(DataForCreateGroup group) {
		 manager.navigateTo().groupsPage();
		 createNewGroup();
		 fillGroupForms(group);
		 submitCreation();
		 goToGroupPage();
		 rebuildCache();
		 return this;
	}
	
	public GroupHelper deleteGroup(int index) {
		selectGroupByIndex(index);
		submitGroupDeletion();
		goToGroupPage();
		rebuildCache();
		return this;
	}

	public GroupHelper modifyGroup(int index, DataForCreateGroup group) {	
		initGroupModification(index);
		fillGroupForms(group);
		submitGroupModification();
		goToGroupPage();
		rebuildCache();
		return this;
	}

//	----------------------------------------------------------------------------------


	public GroupHelper createNewGroup() {
		click(By.name("new"));
		return this;
	}

	public GroupHelper fillGroupForms(DataForCreateGroup group) {
	    type(By.name("group_name"), group.getName1());
	    type(By.name("group_header"), group.getHeader());
	    type(By.name("group_footer"), group.getFooter());
	    return this;
	}

	public GroupHelper submitCreation() {
		click(By.name("submit"));
		cachedGroups = null;
		return this;
	}

	
	public GroupHelper goToGroupPage() {
		click(By.linkText("group page"));
		return this;
	}

	private GroupHelper selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index+1) + "]"));
		return this;
	}

	public GroupHelper initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
		return this;
	}

	public GroupHelper submitGroupModification() {
		click(By.name("update"));
		cachedGroups = null;
		return this;
		
	}

	public void submitGroupDeletion() {
		click(By.name("delete"));
		cachedGroups = null;
	}

}
