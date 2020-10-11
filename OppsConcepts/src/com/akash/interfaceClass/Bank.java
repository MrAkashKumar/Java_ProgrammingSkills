package com.akash.interfaceClass;

public class Bank {
	public static void main(String[] args) {
		
		RBI sbiuser = new SBI();
		sbiuser.deposits(); // SBI
		sbiuser.withdraw(); // SBI
		
		RBI hdfc = new HDCF();
		hdfc.deposits(); //HDFC
		hdfc.withdraw(); // HDFC
		
		RBI icici = new ICICI();
		icici.deposits(); // ICICI
		icici.withdraw(); // ICICI
	}

}
