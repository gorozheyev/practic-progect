package com.example.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroupDataGenerator {


	public static void main(String[] args) {
		if(args.length < 3){
			System.out.println("Please specify parameters: <amount of test data> <file> <format>");
			return;
		}
		int amount = Integer.parseInt(args[0]);
		File file = new File(args[1]);
		String format = args[2];
		
		List<DataForCreateGroup> groups = generateRandomeGroups(amount);
		if("csv.".equals(format)){
			saveGroupsToCsvFile(groups, file);
		} else if ("xml.".equals(format)){
			saveGroupsToXmlFile(groups, file);
		} else {
			System.out.println("Unknown format " + format);
			return;
		}
	}

	private static void saveGroupsToXmlFile(List<DataForCreateGroup> groups,
			File file) {
		// TODO Auto-generated method stub
		
	}

	private static void saveGroupsToCsvFile(List<DataForCreateGroup> groups,
			File file) {
		// TODO Auto-generated method stub
		
	}

	public static List<DataForCreateGroup> generateRandomeGroups(int amount) {
		List<DataForCreateGroup> list = new ArrayList<DataForCreateGroup>();
		for (int i=0; i<amount; i++){
			DataForCreateGroup group = new DataForCreateGroup()
				.withName(generateRandomeString())
				.withHeader(generateRandomeString())
				.withFooter(generateRandomeString());
			list.add(group);
		}
		return list;
	}

	public static String generateRandomeString(){
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0){
			return "";
		}
		else {
			return "test" + rnd.nextInt();
		}
	}
}
