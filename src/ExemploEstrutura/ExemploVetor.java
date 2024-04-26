package ExemploEstrutura;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class ExemploVetor {

	public static void main(String[] args) {
		int [] numeros = new int[5];
		
		numeros[0] = 2;
		numeros[1] = 4;
		numeros[2] = 6;
		numeros[3] = 8;
		
		for (int i = 0; numeros.length >i; i++) {
			System.out.println(numeros[i]);;
		}
		
		int [][] bidimensional = new int [3][3]; // colunha / linha
		
		int [][][]terceiradimensao = new int [3][3][3];	//coluna /linha / profundidade
		
		bidimensional[0][0] = 10;
		
		bidimensional[2][2] = 100;
		
		for (int i = 0; i < 3; i ++) {
			System.out.println(" ");
			for(int j = 0; j <3; j++	) {
				System.out.println(bidimensional[i][j]);
			}
			System.out.println(" ");
		}
		
		LinkedList<Integer> listaLinked = new LinkedList<Integer>();
	
		//Esse for para criar uma lista com 10 itens
		for(int i = 1; i <= 10; i ++) {
			listaLinked.add(i);
		}
		//Esse for para percorrer essa lista
		for(Integer lista : listaLinked) {
			System.out.println(lista);
		}
		System.out.println("===============================================================");
		
		
		//O hashmap funciona dessa maneira
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "São Paulo");
		map.put(2, "Palmeiras");
		map.put(3, "Santos");
		
		map.forEach((key, valor) -> {
			System.out.println("Posição no ranking: " + key);
			System.out.println("Time: " + valor);
		});
		System.out.println("===============================================================");
		
		//Ou
		
		Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer,String> entry = iterator.next();
			
			System.out.println("Key: " + entry.getKey() + "\nNome:" + entry.getValue());
		}
		System.out.println("===============================================================");
		
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
		
		System.out.println("===============================================================");
		
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " == " + entry.getValue());
		});
		System.out.println("=================================================");
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(1, "Corinthians");
		table.put(2, "São Paulo");
		table.put(3, "Santos");
		table.put(4, "Palmeiras");
		table.put(5, "Ceara");
		
		Enumeration<Integer> keys = table.keys();
		while(keys.hasMoreElements()) {
			int key = keys.nextElement();
			String value = table.get(key)	;
			System.out.println(key + " = " + value);
		}
		System.out.println("=================================================");
		for(Map.Entry<Integer, String> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("=================================================");
		
		LinkedHashMap<String, Integer> map1 = new LinkedHashMap<String, Integer>();
		
		map1.put("um", 1);
		map1.put("dois", 2);
		map1.put("três", 3);
		
		System.out.println("=================================================");
		
		TreeMap<String, Integer> map2 = new TreeMap<String,Integer>();
		
		map2.put("um", 1);
		
		System.out.println("=================================================");
		
		
		
		
		
		
		
	}

}
