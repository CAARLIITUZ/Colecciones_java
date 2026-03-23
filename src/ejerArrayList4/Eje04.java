package ejerArrayList4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.TreeSet;

public class Eje04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		//rellenar con valores entre 0 y 100

		for (int i = 1; i <=20; i++) {
		      lista.add(rd.nextInt(50));
		    }
		Collections.sort(lista);
		
		
		
		System.out.println(lista);
		
		TreeSet <Integer> conjunto = new TreeSet();
		for(Integer valor: lista) {
			conjunto.add(valor);
		}
		
		System.out.println(lista);
	}

}
