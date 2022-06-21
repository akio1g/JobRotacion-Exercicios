package application;


import controller.ControllerFaturamento;


public class ex3Faturamento {
	public static void main(String[] args) throws Exception {
		ControllerFaturamento cf = new ControllerFaturamento();
		
		
		System.out.println("Menor Faturamento do Mes: " + cf.menorFaturamento());
		System.out.println();
		System.out.println("Maior Faturamento do Mes: " + cf.maiorFaturamento());
		System.out.println();
		System.out.println("Valor médio de Faturamento do Mes: R$" + String.format("%.2f", cf.mediaMensal()));
		System.out.println();
		System.out.println("Número de dias no mês em que o valor de faturamento foi superior à média ("+String.format("%.2f", cf.mediaMensal()) + "): "+ cf.numeroDiasFaturamentoSuperior());
	}
}
