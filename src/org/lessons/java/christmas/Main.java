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
			System.out.println(wishListLng);
			System.out.println("Cosa vuoi fare"
					+ "\n1)Aggiungere regalo nella lista dei desideri;"
					+ "\n2)Finisci di compilare la lista;");
			userChoise = in.nextInt();
			
			if(userChoise == 1) {
				System.out.print("Cosa vuoi inserire? ");
				String gift = in.next();
				wishList.add(gift);
				wishListLng++;
			}
		}while(userChoise!=2);
		
		System.out.println(wishList);
		
		in.close();
	}
}
