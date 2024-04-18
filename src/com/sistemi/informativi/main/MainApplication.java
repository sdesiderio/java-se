package com.sistemi.informativi.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApplication {

	public static void main(String[] args) {
		
		//Inizializzazione di uno Strem da scratch
		Stream<String> colors = Stream.of("blu","verde","rosso","green");
		colors.forEach(color->System.out.println("Contenuto Stream colors " + color));
		
		/*
		 * L'operatore funzionale filter ritorna uno Stream che
		 * rappresenta lo stesso insieme o un sottoinsieme dello
		 * Stream di partenza
		 */
		Stream<String> days = Stream.of("lunedi","martedi","mercoledi");
		Stream<String> daysFilter = days.filter(day->day.equals("martedi"));
		daysFilter.forEach(day->System.out.println("Contenuto Stream daysFilter " + day));
		
		/*
		 * L'operatore funzionale map ritorna uno Stream che
		 * rappresenta una transformazione delle informazioni
		 * contenute nello Stream di partenza e pertanto ritorna
		 * sempre lo stesso insieme dello Stream di partenza
		 */
		Stream<Integer> numbers = Stream.of(4,8,9);
		Stream<Integer> numbersDouble = numbers.map(number->number*2);
		numbersDouble.forEach(number->System.out.println("Contenuto Stream numbersDouble " +number));
		
		/*
		 * L'operatore funzionale distinct ritorna uno Stream con
		 * informazioni univoche e pertanto può ritornare un insieme
		 * o un sottoinsieme dello Strem di partenza
		 */
		Stream<String> courses  = Stream.of("Java","Angular","React","Java");
		courses.distinct().sorted().forEach(course->System.out.println("Contenuto Stream courses " + course));
		
		//Inizializzazione di un'ArrayList
		ArrayList<Integer> numbersList = new ArrayList<>();
		// Popolamento dell'ArrayList
		numbersList.add(7);
		numbersList.add(8);
        // Trasformazione dell'ArrayList in Stream
		Stream<Integer> numbersStream = numbersList.stream();
		numbersStream.forEach(number->System.out.println("Contenuto Stream numbersStream " + number));
		
		//Inizializzazione di un Array
		Integer arr[] = {4,5};
		//Inizializzazione di uno Stream ottenuto dall'Array
		Stream<Integer> arrStream = Stream.of(arr);
		arrStream.forEach(number->System.out.println("Contenuto Stream arrStream " + number));
		
		//Inizializzazione di uno Stream
		Stream<Integer> numbersStr = Stream.of(9,11,13);
		//Trasformazione dello Stream di partenza in List
		 List<Integer> numberList = numbersStr.collect(Collectors.toList());
		 numberList.forEach(number->System.out.println("Contenuto ArrayList numbersList " + number));
		 
		 
		//Inizializzazione di uno Stream
		 Stream<Integer> numbersStrm = Stream.of(23,87,99);
		//Conversione dello Stream di partenza in un Array
		 Object[] arrInt = numbersStrm.toArray();
		
		 for(int i=0; i< arrInt.length; i++) {
			 
			 System.out.println("Contenuto Array arrInt " + arrInt[i]);
		 }

	}

}
