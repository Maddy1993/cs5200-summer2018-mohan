package edu.northeastern.cs5200.controllers.hello;

public class HelloObject {
	private String message;
	
	public HelloObject() {}
	public HelloObject(String msg) {
		this.message = msg;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
