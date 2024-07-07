//package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;


class A{
	public void m1() {
		System.out.println("Inside m1 of A");
	}
	public void m2() {
		System.out.println("Inside m2 of A");
	}
	public void m3() throws IOException{
		System.out.println("Inside m3 of A");
	}
}
class B extends A{
	public void m1() throws ArithmeticException{
		System.out.println("Inside m1 of B");
	}
	/*public void m2() throws NoSuchFileException{
		System.out.println("Inside m2 of B");
	}*/
	/* cannot throw parent exception/super class exception
	 public void m3() throws Exception {
		System.out.println("Inside m3 of A");
	}*/
	public void m3() throws IOException {
		System.out.println("Inside m3 of A");
	}
}
public class ExceptionOverrideExample {

	public static void main(String[] args) {
		

	}

}
