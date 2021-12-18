package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Integer> List1 = new ArrayList<Integer>();
		List1.add(12);
		List1.add(23);
		List1.add(23);
		List1.add(12);
		
		// affichage avec la boucle for classique
		for (int i = 0;i<List1.size();i++) {
			Integer e = List1.get(i);
			System.out.println("depuis la booucle classique // element " + i + ": " + e );
		}
		
		// Affichage avec la boucle for avancée
		for(Integer e :List1){
			System.out.println("depuis la boucle for avancée element "+e); 
		}

		// Affichage avec un iterateur
		Iterator<Integer> iter = List1.iterator(); while(iter.hasNext()){
			Integer e = iter.next();
			System.out.println("depuis un iterateur element : "+e); 
		}
	
		//Affichage la méthode forEach de la List
		List1.forEach(i-> System.out.println("depuis la méthode forEach de la List element "+i));
	
		List<Integer> list2= Arrays.asList(1,5,6,9,16); 
		list2.stream().map(i->i*i).filter(i->i>37).forEach(i-> System.out.println(i));
		
		List<Integer> list3= new ArrayList<>(); 
		list3.add(5);
		list3.add(10);
		list3.add(15);
		list3.add(20);
		list3.add(2,10);
		list3.forEach(i-> System.out.println(i));
		
	}	
}
