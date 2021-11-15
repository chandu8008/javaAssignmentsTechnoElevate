package com.construct.techno;

import com.interface2.testyantra.FunInterface;

public class ConstrRef {
public ConstrRef(int i) {
	System.out.println("Constructor ref from normal class");
}
public static void main(String[] args) {
	FunInterface funInterface = ConstrRef::new;
	funInterface.display(10);
}
}
