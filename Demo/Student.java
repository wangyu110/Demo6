package com.OOP.Demo;

public class Student {
/**
 * 學生類
 * 1.屬性：name,age,gender
 * 2.行爲：learn,play,activity
 */
	//屬性
	String name;
	int age;
	String gender;
	//构造
	public Student(String name,String gender){
		this.name=name;
		this.gender=gender;
	}
//	public Student(){
//		
//	}
	//行爲
	public void learn(){
		
		System.out.println("名字:"+name+"，學英語！");
	}
 
	public void play(){
		System.out.println("名字:"+name+"，玩游戲！");
	}
	public void activity(){
		System.out.println("名字:"+name+"，打籃球賽！");
}
}
