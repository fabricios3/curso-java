package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Array
		System.out.println("Fixo");
		String[] vect1 = new String[] {"Maria", "Jose", "Joao"};
		for (String obj : vect1) {
			System.out.println(obj);
		}

		//Lista
		System.out.println("Dinamico");
		ArrayList<String> vect2 = new ArrayList<String>();
		vect2.add("Maria");
		vect2.add("Jose");
		vect2.add("Joao");
		vect2.add("Cara");
		vect2.remove(vect2.size()-1);		
		for (String obj : vect2) {
			System.out.println(obj);
		}
		
		//Forma certa
		System.out.println("Melhor forma e com lambda");
		List<String> vect3 = new ArrayList<>();
		vect3.add("Maria");
		vect3.add("Jose");
		vect3.add("Alex");
		vect3.add("Anna");
		List<String> result = vect3.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String obj : result) {
			System.out.println(obj);
		}
		
		sc.close();	
	}
}
