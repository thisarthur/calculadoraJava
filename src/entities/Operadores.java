package entities;

public class Operadores {

	private Double num1;
	private Double num2;
	
	public Operadores(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Operadores() {
		
	}

	public Double getNum1() {
		return num1;
	}

	public void setNum1(Double num1) {
		this.num1 = num1;
	}

	public Double getNum2() {
		return num2;
	}

	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	
	
	public double soma() {
		return num1 + num2;
	}
	
	public double subtracao() {
		return num1 - num2;
	}
	
	public double multiplicacao() {
		return num1 * num2;
	}
	
	public double divisao() {
		return num1 / num2;
	}

	@Override
	public String toString() {
		return "Operadores [num1=" + num1 + ", num2=" + num2 + ", getNum1()=" + getNum1() + ", getNum2()=" + getNum2()
				+ ", soma()=" + soma() + ", subtracao()=" + subtracao() + ", multiplicacao()=" + multiplicacao()
				+ ", divisao()=" + divisao() + "]";
	}
	
	
	
	
}
