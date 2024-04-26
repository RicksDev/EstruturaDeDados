package ExemploEstrutura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemplo {

	public static void main(String[] args) {
		System.out.println(new String("Pedro") == new String("Pedro")); // Retorna false
		System.out.println(new String("Pedro").equals(new String("Pedro")));// Retorna true
		
		HashSet<String> set = new HashSet<String>(); //o hashset é todo desordenado.
		
	
		set.add("Moto");
		
		System.out.println("Elementos no HashSet");
		for(String veiculo : set) { // o "veiculo" vai percorrer o set e listar os itens.
			System.out.println(veiculo);
		}
		Iterator<String> iterator = set.iterator();
		
		System.out.println("Listando elementos com Iterator: ");
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}                 
		
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("Broszao");
		
		for(String bicycle : set2) {
			System.out.println(bicycle);
		}
		
		System.out.println("====================================");
		
		HashSet <Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		set1.add(10);
		set1.add(11);
		set1.add(12);
		set1.add(13);
		set1.add(14);
		set1.add(15);
		set1.add(16);
		set1.add(17);
		set1.add(18);
		set1.add(19);
		set1.add(20);
		
		for(Integer lista : set1) {
			System.out.println(lista);
		}
		
		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(13);
		numeros.add(14);
		
		/* Iterator<Integer> iterator1 = set1.iterator();
		System.out.println("Listando número com iterator: ");
		while(iterator1.hasNext())	{
			String item1 = iterator.next();
			System.out.println(item1);
		} */
		
		for(Integer lista : numeros)	 {
			System.out.println(lista);
		}
		
		Set treeSet = new TreeSet<Integer>(hashSet);
		
		
		
		
		
	}

}
