package entity;

public class Faturamento {
	private int dia;
	private double valor;
	
	public Faturamento() {}

	public Faturamento(int dia, double valor) {
		super();
		this.dia = dia;
		this.valor = valor;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Faturamento [dia: " + dia + "------ valor= R$" + String.format("%.2f", valor) + "]";
	}
	
	
}
