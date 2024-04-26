package ExemploEstrutura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCollections {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Atletico Mineiro");
		arrayList.add("São Paulo");
		
		//Ordenar
		
		Collections.sort(arrayList);
		
		System.out.println(arrayList);

	}

}
