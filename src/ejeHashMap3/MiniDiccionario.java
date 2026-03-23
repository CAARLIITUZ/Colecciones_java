package ejeHashMap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MiniDiccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var diccionario = new HashMap <String,String>();
		Scanner sc = new Scanner(System.in);
		diccionario.put("hola", "hello");
		diccionario.put("adios", "bye");
		diccionario.put("herramienta", "tool");
		diccionario.put("raton", "mouse");
		diccionario.put("llave", "key");
		diccionario.put("mano", "hand");
		diccionario.put("sol", "sun");
		diccionario.put("tirar", "pull");
		
		ArrayList <String> seleccionados = obtenerPalabras(diccionario,8);
		
		int puntos=0;
		for(String palabra:seleccionados) {
			System.out.println("Palabra en español: " + palabra);
			System.out.println("Palabra en ingles: ");
			String palabraUsuario = sc.nextLine();
			if(diccionario.get(palabra).equalsIgnoreCase(palabraUsuario)) {
				System.out.println("Respuesta correcta");
				puntos++;
			}else {
				System.out.println("Respuesta Incorrecta");
			}
		}
		
		System.out.println("Total de puntos: "+ puntos);
	
		
		
	}

	private static ArrayList<String> obtenerPalabras(HashMap<String, String> diccionario, int numPalabras) {
		var listaEspañol = new ArrayList <String>(diccionario.keySet());
		var listaSeleccionada = new ArrayList <String>();

		
		var rd = new Random();
		for (int i =1; i <=numPalabras;i++) {
			boolean nueva=false;
			do {
			int posicion =rd.nextInt(listaEspañol.size());
			String palabra= listaEspañol.get(posicion);
			if(!listaSeleccionada.contains(palabra)) {
				listaSeleccionada.add(palabra);
				nueva = true;
			}
			
			}while(!nueva);
			
		}
		return listaSeleccionada;
	}
	
	private static ArrayList<String> obtenerPalabras2(HashMap<String, String> diccionario, int numPalabras) {
		
	
	 List <String> resu= new ArrayList<String>(diccionario.keySet());
	 Collections.shuffle(resu);
	 
	 resu=resu.subList(0, numPalabras);
	 return new ArrayList <String>(resu);
	}

}
