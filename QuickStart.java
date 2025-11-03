//import java.util.stream.Collectors; 
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
import java.util.*;


class QuickStart {
	
	public static void addToInt(int x, int amountToAdd){
		
		x = x + amountToAdd % -5;
		
		
		}
    public static void main(String[] args) {
		
		/***
		
		int moon = 9, star = 2 + 2 * 3;
		float sun = star > 10 ? 1 : 3;
		double jupiter = (sun + moon) - 1.0f;
		int mars = --moon <= 8 ? 2 : 3;
		
		System.out.println(sun + ", " + jupiter + ", " + mars);
		***/
		
		/**
		 * Predicate<String> empty = String::isEmpty;
		Predicate<String> notEmpty = empty.negate();
		
		var result = Stream.generate(() -> "")
		.filter(notEmpty)
		.collect(Collectors.groupingBy(k -> k))
		.entrySet()
		.stream()
		.map(Entry::getValue)
		.flatMap(Collection::stream)
		.collect(Collectors.partitioningBy(notEmpty));
		System.out.println(result);
		**/
		
		var a = 15;
		var b = 10;
		
		QuickStart.addToInt(a, b);
		System.out.println(a);
				
    }
}
