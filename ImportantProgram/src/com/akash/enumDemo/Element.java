package com.akash.enumDemo;

public enum Element {
	HELIUM("He", "Gas"),
	MAGNESIUM("Mg", "Solid");
	
	private String chemicalSymbol;
	private String nature;
	
	private Element(String newChemicalSymbol, String newNature) {
		chemicalSymbol = newChemicalSymbol;
		nature = newNature;
	}
	
	public String chemicalSymbol() {
		return chemicalSymbol;
	}
	
	public String nature() {
		return nature;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Element.HELIUM");
		System.out.printf("%s, %s, %s", Element.HELIUM, Element.MAGNESIUM, Element.HELIUM.chemicalSymbol(), Element.MAGNESIUM.nature());
		System.out.printf("%s, %s, %s", Element.HELIUM.toString(), Element.HELIUM.chemicalSymbol(), Element.MAGNESIUM.nature());
		
	}

}
