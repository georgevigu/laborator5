package com.company;

public class Rosie extends Fruct {
	private boolean cherry;
	
	public Rosie(double vechime, String gust, boolean cherry) {
		super(vechime, gust);
		this.cherry=cherry;
	}
	
	public boolean getCherry() {
		return this.cherry;
	}
	
	public void setCherry(boolean cherry) {
		this.cherry=cherry;
	}
}
