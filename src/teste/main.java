package teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {
	
	public static void main(String[] args) { 
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(-5);
		numbers.add(2);
		numbers.add(-6);
		numbers.add(2);
		numbers.add(1);
		numbers.add(-7);
		numbers.add(7);
		
		System.out.println(SegundaSolucao.numerosOpostosIguais(numbers));		
		
	}
}