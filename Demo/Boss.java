package com.OOP.Demo;
/**
 * 老板类
 *  属性：name,gender
 *  行为： work,sleep
 */
public class Boss {
   //属性
	private String name;
	private String gender;
	//构造
	public Boss(String name,String gender){
		this.name=name;
		this.gender=gender;
	}
	//方法
	public void work(){
		System.out.println("名字："+this.name+":"+this.gender+",工作10小时！");
	}
	public void sleep(){
		System.out.println("名字："+this.name+":"+this.gender+",睡8个小时！");
	}
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
