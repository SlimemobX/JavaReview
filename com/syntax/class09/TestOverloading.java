package com.syntax.class09;

public class TestOverloading {
	public static void main(String[] args) {
		
		MethodsOverloading obj = new MethodsOverloading();
		
		obj.method();
		obj.method(15);
		obj.method("word");
		obj.method("Word",15);
		obj.method(5,"tree");
		
	}

}
