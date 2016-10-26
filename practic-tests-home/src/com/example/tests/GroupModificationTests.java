package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupModificationTests extends BaseClass{
	
	@Test(dataProvider = "randomValidGroupsGenerator")
	public void modifySomeGroup(DataForCreateGroup group){
//		  save old state
		  List<DataForCreateGroup> oldList = app.getGroupHelper().getGroups();
		  
		  Random rnd = new Random();
		  int index = rnd.nextInt(oldList.size()-1);
		  
//		  actions
		app.getGroupHelper().modifyGroup(index, group);

//		  save new state
		  List<DataForCreateGroup> newList = app.getGroupHelper().getGroups();
		  
//		  compare states
		  oldList.remove(index);
		  oldList.add(group);
		  Collections.sort(oldList);
		  assertEquals(newList, oldList);
	}
}
