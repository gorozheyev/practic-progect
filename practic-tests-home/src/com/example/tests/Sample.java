package com.example.tests;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		сравнение строк
		String a  = "test";
		String b = "test";
		System.out.println(b.equals(a));
		System.out.println("-----------------------------");
	
//		строка содержит подстроку
		String a1  = "test";
		String b1 = "testtest";
		System.out.println(b1.contains(a1));
		System.out.println("-----------------------------");
		
//		начинается с какого индекса
		String a2  = "test";
		String b2 = "testtest";
		System.out.println(b2.indexOf(a2));
		System.out.println("-----------------------------");
		
//		разбиение строки используя фиксированную строку " "
		String a3  = "test test test";
		String[] list = a3.split(" ");
//		можно с помощью регулярного выражения String[] list = a3.split(\\s+");
		System.out.println(list.length);
		System.out.println(list[0]);
		System.out.println(list[1]);
		System.out.println(list[2]);
		System.out.println("-----------------------------");
	
		String c = "+7 (912) 123-45-67";
//		заменяет пустотой символы в квадратных скобках
		c = c.replaceAll("[ ()\\-]", "");
		System.out.println(c);
		System.out.println(c.matches("\\+\\d+"));
		System.out.println("-----------------------------");
		
//		обрезание пробелов вначале и вконце строки
		String c1 = "    +7 (912) 123-45-67   ";
		c1 = c1.trim();
		System.out.println(c1);
		c1 = c1.replaceAll("[ ()\\-]", "");
		System.out.println(c1);
		System.out.println(c.matches("\\+\\d+"));
	}

}
