import java.util.Random;
import java.util.Scanner;;

public class Kostka_do_gry {

	public static void main(String[] args) {

		int liczbaRzutów = 0;
		int modyfikator = 0;
		int result = 0;

		System.out.println("Wybierz typ kości spośród podanych: D3, D4, D6, D8, D10, D12, D20, D100");
		Scanner scan = new Scanner(System.in);
		String kosc = scan.nextLine();
		String part = kosc.substring(1);
		int numb = Integer.parseInt(part);

		Random r = new Random();
		int rand = r.nextInt(numb) + 1;

		System.out.println("Podaj modyfikator: ");
		Scanner scan2 = new Scanner(System.in);
		modyfikator = scan2.nextInt();

		System.out.println("ilość rzutów: ");
		Scanner scan1 = new Scanner(System.in);
		liczbaRzutów = scan1.nextInt();

		scan.close();
		scan1.close();
		scan2.close();

		for (int i = 0; i < liczbaRzutów; i++) {
			result = liczbaRzutów * rand + modyfikator;

		}
		System.out.println("Otrzymany wynik to: " + result);

	}
}
