package ch7;

import java.util.Scanner;

public class ClassExamp {

	private String name;
	private double balance;
	private String address;
	private double intrate;
	private String phone;
	private String pin= "123";
	private String bday;
	
	
	public ClassExamp(String name, double balance, String address, double intrate, String phone, String pin,
			String bday) {
		super();
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.intrate = intrate;
		this.phone = phone;
		this.pin = pin;
		this.bday = bday;
	}
	
public ClassExamp() {
	super();
	Scanner input = new Scanner(System.in);
	System.out.println("What is your name");
	this.name = input.nextLine();
}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance, String pin) {
		if (this.pin.equals(pin)) {
		this.balance = balance;
		}
		else {
			System.out.println("thats not the right pin");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getIntrate() {
		return intrate;
	}

	public void setIntrate(double intrate) {
		this.intrate = intrate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public void display() {
		System.out.println(name);
		System.out.println(balance);
		System.out.println(address);
	}
	
	
	
}
