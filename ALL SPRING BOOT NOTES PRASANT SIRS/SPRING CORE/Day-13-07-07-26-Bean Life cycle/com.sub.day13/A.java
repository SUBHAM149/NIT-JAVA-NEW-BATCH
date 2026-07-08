package com.sub.day13;

public class A {
	int a1;

	public A() {
		System.out.println("Constructor executed");
	}

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		System.out.println("Setter method executes");
		this.a1 = a1;
	}

	public void init() {
		System.out.println("One time configuration done");
	}

	public void destroy() {
		System.out.println("All resources closed");
	}

	public void display() {
		System.out.println("Custom method executes");
	}

	@Override
	public String toString() {
		return "A [a1=" + a1 + "]";
	}
}
