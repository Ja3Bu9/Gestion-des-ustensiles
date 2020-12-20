package com.ustensiles.models;

public class Ustensile {

	private int anneeFabrication;

	public Ustensile() {
		
	}
	
	public Ustensile(int anneeFabrication) {
		super();
		this.anneeFabrication = anneeFabrication;
	}

	public int getAnneeFabrication() {
		return anneeFabrication;
	}

	public void setAnneeFabrication(int anneeFabrication) {
		this.anneeFabrication = anneeFabrication;
	}
	
	
	public int afficherValeurTotale(int a,int b, int c) {

        return  a + b + c;

    }

	@Override
	public String toString() {
		return "Ustensile [anneeFabrication=" + anneeFabrication + "]";
	}
	
	
	
}
