package com.OOP.Demo;
/**
 * �ϰ���
 *  ���ԣ�name,gender
 *  ��Ϊ�� work,sleep
 */
public class Boss {
   //����
	private String name;
	private String gender;
	//����
	public Boss(String name,String gender){
		this.name=name;
		this.gender=gender;
	}
	//����
	public void work(){
		System.out.println("���֣�"+this.name+":"+this.gender+",����10Сʱ��");
	}
	public void sleep(){
		System.out.println("���֣�"+this.name+":"+this.gender+",˯8��Сʱ��");
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
