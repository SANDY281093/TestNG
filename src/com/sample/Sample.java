package com.sample;

public class Sample {
	public void task1() {
		System.out.println("King");
	}	
	private void task2() {

		System.out.println("Queen");
	}
	public void task() {
		System.out.println("ok");
	}
	public void task4() {
		System.out.println("Minister");
	}
	
	
public static void main(String[] args) {
	Sample s = new Sample();
	s.task1();
	s.task2();
	s.task();
	s.task4();
	
}
}
