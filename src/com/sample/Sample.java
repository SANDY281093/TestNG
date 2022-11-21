package com.sample;

public class Sample {
	public void task1() {
		System.out.println("King");
	}
	private void task2() {

		System.out.println("Queen");
	}
	private void task3() {

		System.out.println("Prince");
	}
public static void main(String[] args) {
	Sample s = new Sample();
	s.task1();
	s.task2();
	s.task3();
}
}
