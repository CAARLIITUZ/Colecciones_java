package ejeHashMap2;

import java.util.HashMap;
import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var datuser = new HashMap <String,String>();
		//clave login, valor password
		datuser.put("root", "root");
		datuser.put("alumno", "alumno1");
		datuser.put("admin", "12345");
		datuser.put("master", "12345");
		
		String login;
		
		String passwd;
		
		String passwd_store;
		
		Scanner sc = new Scanner(System.in);
		
		int contador=0;
		while (contador<3) {
			System.out.println("Login: "); 
			login=sc.nextLine();
			
			System.out.println("Password");
			passwd=sc.nextLine();
			
			passwd_store = datuser.get(login);
			
			if(passwd_store != null && passwd_store.equalsIgnoreCase(passwd)) {
				break;
			}else {
				System.out.println("usuario y claves incorrectas");
			}
			
			contador++;
		}
		
		if(contador <3) {
			System.out.println("Bienvenido");
		}else if (contador>=3) {
			System.out.println("Cuenta bloqueada");
		}
		
		
			
		
		
	}

}
