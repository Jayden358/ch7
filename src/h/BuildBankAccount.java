package h;

import ch7.ClassExamp.*;

public class BuildBankAccount {

	public static void main(String[] args) {
		ClassExamp myacc = new ClassExamp("Jayden Williams",999999999,"584 Dank Chickie nuggies",0.5,"5736346",123);
		ClassExamp youracc = new ClassExamp();
		
		myacc.setName =("Jayden Williams");
		youracc.setName =("Eric Broadbent");
		myacc.setAddress =("584 Dank Chickie nuggies");
		youracc.setAddress =("4975 long road");
		myacc.setBalance = (999999999);
		youracc.setBalance = (.25);
		myacc.setPhone = ("5736346");
		youracc.setPhone = ("6876432");
		
		System.out.println(myacc.name);
		System.out.println(myacc.balance);
		System.out.println(myacc.address);
		
		System.out.println(youracc.name);
		System.out.println(youracc.balance);
		System.out.println(youracc.address);
		

	}

}
