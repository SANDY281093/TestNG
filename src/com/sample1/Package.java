package com.sample1;
import com.sample.Sample;
public class Package {
	public void xyz() {
		System.out.println("456");
	}
	public static void main(String[] args) {
		Package p=new Package();
		p.xyz();
		Sample s = new Sample();
		s.task1();
		
	}

}
