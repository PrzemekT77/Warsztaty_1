import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Gra_w_zgadywanie_liczb {

	public static void main(String[] args) {

		Random r = new Random();
		int a = r.nextInt(100) + 1;
int counter =0;
		
		Scanner scan = new Scanner(System.in);
int traf =0;
		while (a!=traf) {
			System.out.println("Zgadnij liczbę: ");
			try {
					traf = scan.nextInt();	
					counter++;
			} catch (InputMismatchException e) {
				System.out.println("To nie jest liczba");
				scan.next();
				continue;
			}		
		if (traf < a) {
			System.out.println("Za mało");

		} else if (traf > a) {
			System.out.println("Za dużo");

		} else {
			System.out.println("Zgadłeś!");
			System.out.println("Zgadłeś za " + counter+" razem");
		}
	}
		scan.close();
	}
}
