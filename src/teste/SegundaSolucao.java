package teste;

import java.util.ArrayList;
import java.util.List;

public class SegundaSolucao {
	
	public static boolean numerosOpostosIguais(List<Integer> numbers){ 	

		List<Integer> negativeNumbers = new ArrayList<>(); //array para os numeros negativos
		List<Integer> positiveNumbers = new ArrayList<>(); //array para os numeros positivos				
		
		for (int n : numbers) { //percorrendo o array dos valores
			if (n < 0) { //se o numero for negativo ( < 0)
				negativeNumbers.add(Math.abs(n)); //converte os valores para numero positivo e atribui o valor para o array negativeNumbers
			}else {
				positiveNumbers.add(n); //caso contrario atribui o valor para o array positiveNumbers
			}						
		}
		
		positiveNumbers.retainAll(negativeNumbers);	//funcao retem na lista
		
		if (positiveNumbers.isEmpty()) { //se o array está vazio, logo os dados não são os mesmos
			return false;
		}else {
			return true; //se o array tem algum valor, significa que numeros positivos e negativos possuem pares.
		}
	}
	
}
