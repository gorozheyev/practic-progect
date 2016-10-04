package com.example.tests;


import org.testng.annotations.Test;

public class CreationGroup extends BaseClass {
  @Test
  public void testNonEmptyGroup() throws Exception {
	  openMainPage();
	  openGroups();
	  createNewGroup();
	  DataForCreateGroup group = new DataForCreateGroup();
	  group.name1 = "avtomation";
	  group.header = "header avomation";
	  group.footer = "footer avtomation";
	  fillGroupForms(group);
	  submitCreation();
	  goToGroupPage();
  }
  
  @Test
  public void testEmptyGroup() throws Exception {
	  openMainPage();
	  openGroups();
	  createNewGroup();
	  fillGroupForms(new DataForCreateGroup("", "", ""));
	  submitCreation();
	  goToGroupPage();
  }
}
