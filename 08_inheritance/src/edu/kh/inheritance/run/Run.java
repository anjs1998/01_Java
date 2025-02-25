package edu.kh.inheritance.run;

import edu.kh.inheritance.model.dto.BasicPhone;
import edu.kh.inheritance.model.dto.SmartPhone;

public class Run {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("Samsung","Galaxy S20", 2020,1200000, "Android", 128);
		sp.printInfo();
		System.out.println("===============================");
		BasicPhone bp = new BasicPhone("Nokia", "3310", 2000, 100000, true);
		bp.printInfo();
	}
}
