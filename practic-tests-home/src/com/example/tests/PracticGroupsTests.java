package com.example.tests;


import org.testng.annotations.Test;

public class PracticGroupsTests extends BaseTestClass {
  @Test
  public void testNonEmptyGroup() throws Exception {
	  openMainPage();
	  openGroups();
	  createNewGroup();
	  TestData group = new TestData();
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
	  fillGroupForms(new TestData("", "", ""));
	  submitCreation();
	  goToGroupPage();
  }
}
