package com.example.tests;


import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class CreationGroup extends BaseClass {	
	
  @Test(dataProvider = "randomValidGroupsGenerator")
  public void testGroupCreationWithWalidData(DataForCreateGroup group) throws Exception {
	  app.getNavigationHelper().openMainPage();
	  app.getNavigationHelper().openGroups();
	  
//	  save old state
	  List<DataForCreateGroup> oldList = app.getGroupHelper().getGroups();
	  
//	  actions
	  app.getGroupHelper().createNewGroup();
	  app.getGroupHelper().fillGroupForms(group);
	  app.getGroupHelper().submitCreation();
	  app.getGroupHelper().goToGroupPage();
	  
//	  save new state
	  List<DataForCreateGroup> newList = app.getGroupHelper().getGroups();
	  
//	  compare states
	  oldList.add(group);
	  Collections.sort(oldList);
	  assertEquals(newList, oldList);
	  
  }
  
}
