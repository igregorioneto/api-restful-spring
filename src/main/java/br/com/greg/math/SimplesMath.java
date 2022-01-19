package br.com.greg.math;

public class SimplesMath {
	
	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double subtraction(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double multiplication(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public Double division(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public Double average(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}
	
	public Double squareRoot(Double firstNumber) {
		return (Double) Math.sqrt(firstNumber);
	}

}
