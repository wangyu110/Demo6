package com.OOP.Demo;

public class Cir {
	/**
	 * 定义一个圆的类
	 * 
	 */
	//属性
	private double r;
	private static double pi=3.14;
	//构造
    public Cir(){
    	
    }
    public Cir(double r){
    	this.r=r;
    }
    //方法
    public double per(){
    	double c=2*pi*r;
    	return c;
    }
    public double area(){
    	double s=pi*r*r;
    	return s;
    }
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public static double getPi() {
		return pi;
	}
	public static void setPi(double pi) {
		Cir.pi = pi;
	}
    	
    
    
    
    
    
    
}
