package com.company;

public class Mar extends Fruct {
	private String culoare;
	
	public Mar(double vechime, String gust, String culoare) {
		super(vechime, gust);
		this.culoare = culoare;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

}
