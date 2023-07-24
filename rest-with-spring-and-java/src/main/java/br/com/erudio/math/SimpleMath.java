package br.com.erudio.math;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}

	public Double sub(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}

	public Double times(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}

	public Double div(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}

	public Double avg(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}

	public Double squareRoot(Double number) {
		return Math.sqrt(number);
	}
}
