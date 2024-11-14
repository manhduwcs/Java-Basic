package myPackage1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstClass {
    public static void main(String[] args) {
	String[] arr = { "Alice", "Bob", "Adruin", "Bitchy", "Charlie", "Cig" };
	List<String> arrstream = Arrays.stream(arr).filter(name -> name.startsWith("A")).map(name -> name.toUpperCase())
		.collect(Collectors.toList());

	System.out.println("Start with A : " + arrstream);
    }

}
