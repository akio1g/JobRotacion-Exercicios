package exJobRotacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ex4calculoPercentual {
	
	public static void main(String[] args) {
		Map<String, Double>  estados = new HashMap<>();
		estados.put("sp", 67836.43);
		estados.put("rj", 36678.66);
		estados.put("mg" , 29229.88);
		estados.put("es" , 27165.48);
		estados.put("outros", 19849.53);
		
		double totalPercentual = 0;
		
		for (Entry<String, Double> estado: estados.entrySet()) { // soma dos valores de faturamento
			totalPercentual = totalPercentual + estado.getValue();	
		}
		
		for (Entry<String, Double> estado: estados.entrySet()) { // calcula porcentagem
			System.out.println(estado.getKey() + ": " + String.format("%.2f", ((estado.getValue()/totalPercentual) * 100)) +"%");
		}
	}

}
