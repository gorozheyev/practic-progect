package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends BaseClass{
	@Test
	public void modifySomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().openGroups();
		app.getGroupHelper().initGroupModification(1);
		DataForCreateGroup group = new DataForCreateGroup();
		group.name1 = "new name";
		app.getGroupHelper().fillGroupForms(group);
		app.getGroupHelper().submitGroupModification();
		app.getGroupHelper().goToGroupPage();
	}
}
