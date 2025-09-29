package original;

import java.util.Random;
import java.util.Scanner;

public class nja {
	

	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		
		for(int i = 1; i <= reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);
		}
	}
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Esiet sveicināti manā programmā");
		System.out.println("Ievadiet cik reizes mest kauliņu");
		reizes = scan.nextInt();
		System.out.println("Test");
		System.out.println("eeffoc");
		System.out.println("Instant replay");
		mestKaulinu(reizes);
		scan.close();
	}
	

}