package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<String> wishList = new ArrayList<>();
		int wishListLng = wishList.size();
		int userChoise = 0;
		
		do {
			System.out.println("La tua lista dei desideri contiene " + wishListLng + ((wishListLng == 1) ? " un elemento" : " elementi"));
			System.out.println("Cosa vuoi fare"
					+ "\n1)Aggiungere regalo nella lista dei desideri;"
					+ "\n2)Finisci di compilare la lista;");
			userChoise = in.nextInt();
			
			if(userChoise != 1) {
				System.out.println("Scelta non valida, riprova");
				continue;
			}
			
			System.out.print("Cosa vuoi inserire? ");
			in.nextLine();
			String gift = in.nextLine();
			
			if(gift.trim() != "") {
				wishList.add(gift);
				wishListLng++;
			}

		}while(userChoise!=2);
		
		System.out.println("Questa è la tua lista di desideri: " + wishList);
		
		in.close();
	}
}
