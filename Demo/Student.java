package com.OOP.Demo;

public class Student {
/**
 * �W���
 * 1.���ԣ�name,age,gender
 * 2.�Р���learn,play,activity
 */
	//����
	String name;
	int age;
	String gender;
	//����
	public Student(String name,String gender){
		this.name=name;
		this.gender=gender;
	}
//	public Student(){
//		
//	}
	//�Р�
	public void learn(){
		
		System.out.println("����:"+name+"���WӢ�Z��");
	}
 
	public void play(){
		System.out.println("����:"+name+"�����Α�");
	}
	public void activity(){
		System.out.println("����:"+name+"����@��ِ��");
}
}
