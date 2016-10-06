package com.example.tests;


import org.testng.annotations.Test;

public class CreationGroup extends BaseClass {
  @Test
  public void testNonEmptyGroup() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().openGroups();
	  app.getGroupHelper().createNewGroup();
	  DataForCreateGroup group = new DataForCreateGroup();
	  group.name1 = "avtomation";
	  group.header = "header avomation";
	  group.footer = "footer avtomation";
	  app.getGroupHelper().fillGroupForms(group);
	  app.getGroupHelper().submitCreation();
	  app.getGroupHelper().goToGroupPage();
  }
  
  @Test
  public void testEmptyGroup() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().openGroups();
	  app.getGroupHelper().createNewGroup();
	  app.getGroupHelper().fillGroupForms(new DataForCreateGroup("", "", ""));
	  app.getGroupHelper().submitCreation();
	  app.getGroupHelper().goToGroupPage();
  }
}
