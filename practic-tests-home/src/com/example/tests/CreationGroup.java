package com.example.tests;


import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CreationGroup extends BaseClass {
  @Test
  public void testNonEmptyGroup() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().openGroups();
	  
//	  save old state
	  List<DataForCreateGroup> oldList = app.getGroupHelper().getGroups();
	  
//	  actions
	  app.getGroupHelper().createNewGroup();
	  DataForCreateGroup group = new DataForCreateGroup();
	  group.name1 = "avtotest";
	  group.header = "header avomation";
	  group.footer = "footer avtomation";
	  app.getGroupHelper().fillGroupForms(group);
	  app.getGroupHelper().submitCreation();
	  app.getGroupHelper().goToGroupPage();
	  
//	  save new state
	  List<DataForCreateGroup> newList = app.getGroupHelper().getGroups();
	  
//	  compare states
	  assertEquals(newList.size(), oldList.size()+1);
	  
	  oldList.add(group);
	  Collections.sort(oldList);
	  assertEquals(newList, oldList);
	  
  }
  
//  @Test
  public void testEmptyGroup() throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().openGroups();
	  app.getGroupHelper().createNewGroup();
	  app.getGroupHelper().fillGroupForms(new DataForCreateGroup("", "", ""));
	  app.getGroupHelper().submitCreation();
	  app.getGroupHelper().goToGroupPage();
  }
}
