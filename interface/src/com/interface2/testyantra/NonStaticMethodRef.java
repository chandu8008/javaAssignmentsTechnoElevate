package com.interface2.testyantra;

public class NonStaticMethodRef {
	
	public static void main(String[] args) {
		FunInterface funinterface1 = StaticMainMethodRef::name;
		funinterface1.display();
		
		NonStaticMethodRef methodref = new NonStaticMethodRef();
		FunInterface funinterface = methodref::add;
		funinterface.display();
		
}
public void name() {
	System.out.println(" static method in normal class");
	return;
}
public void add() {
	System.out.println(" Non static method in normal class");
	return;
}}