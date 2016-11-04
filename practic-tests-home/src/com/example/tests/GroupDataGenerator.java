package com.example.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.thoughtworks.xstream.XStream;

public class GroupDataGenerator {


	public static void main(String[] args) throws IOException {
		if(args.length < 3){
			System.out.println("Please specify parameters: <amount of test data> <file> <format>");
			return;
		}
		int amount = Integer.parseInt(args[0]);
		File file = new File(args[1]);
		String format = args[2];
		
		if (file.exists()){
			System.out.println("File exist please remote it manualy: " + file);
			return;
		}
		
		List<DataForCreateGroup> groups = generateRandomeGroups(amount);
		if("csv".equals(format)){
			saveGroupsToCsvFile(groups, file);
		} else if ("xml".equals(format)){
			saveGroupsToXmlFile(groups, file);
		} else {
			System.out.println("Unknown format " + format);
			return;
		}
	}

	private static void saveGroupsToXmlFile(List<DataForCreateGroup> groups, File file) throws IOException {
		XStream xstream = new XStream();
		xstream.alias("group", DataForCreateGroup.class);
		String xml = xstream.toXML(groups);
		FileWriter writer = new FileWriter(file);
		writer.write(xml);
		writer.close();
	}
	

	public static List<DataForCreateGroup> loadGroupsFromXmlFile(File file) {
		XStream xstream = new XStream();
		xstream.alias("group", DataForCreateGroup.class);
		return (List<DataForCreateGroup>) xstream.fromXML(file);
	}

	private static void saveGroupsToCsvFile(List<DataForCreateGroup> groups, File file) throws IOException {
		FileWriter writer = new FileWriter(file);
		for (DataForCreateGroup group : groups) {
			writer.write(group.getName1() + "," + group.getHeader() + "," + group.getFooter() + ",!"  + "\n");
		}
		writer.close();
	}
	
	 public static List<DataForCreateGroup> loadGroupsFromCsvFile(File file) throws IOException {
			List<DataForCreateGroup> list = new ArrayList<DataForCreateGroup>();
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while (line != null) {
				String[] part = line.split(",");
				DataForCreateGroup group = new DataForCreateGroup()
				.withName(part[0])
				.withHeader(part[1])
				.withFooter(part[2]);
				list.add(group);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
			return list;
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
