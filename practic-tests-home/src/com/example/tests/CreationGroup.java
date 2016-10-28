package com.example.tests;


import static com.example.tests.GroupDataGenerator.loadGroupsFromCsvFile;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreationGroup extends BaseClass {	
	
	@DataProvider
	public Iterator<Object[]> groupsFromFile() throws IOException {
		return wrapGroupsForDataProvider(loadGroupsFromCsvFile(new File("groups.txt"))).iterator();
	}
	
@Test(dataProvider = "groupsFromFile")
  public void testGroupCreationWithWalidData(DataForCreateGroup group) throws Exception {
	  
//	  save old state
	  List<DataForCreateGroup> oldList = app.getGroupHelper().getGroups();
	  
//	  actions
	  app.getGroupHelper().createGroup(group);
	  
//	  save new state
	  List<DataForCreateGroup> newList = app.getGroupHelper().getGroups();
	  
//	  compare states
	  oldList.add(group);
	  Collections.sort(oldList);
	  assertEquals(newList, oldList);
	  
  }
  
}
