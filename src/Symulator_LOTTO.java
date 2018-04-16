import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Symulator_LOTTO {

	public static void main(String[] args) {

		int wybór = 0;
		int[] myLotto = new int[6];
		int[] lottoNumbers = new int[6];

		Scanner typ = new Scanner(System.in);
		System.out.println("Podaj numery LOTTO: ");
		for (int i = 0; i < 6; i++) {

			try {
				wybór = typ.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("To nie jest liczba");
				typ.next();
				i--;
				continue;
			}
			if (wybór > 49 || wybór < 1) {
				System.out.println("Podana liczba nie należy do zakresu 1-49");
				i--;
				continue;
			} else {
				boolean repeat = false;
				for (int j = 0; j < i; j++) {
					if (wybór == myLotto[j]) {
						i--;
						repeat = true;
						break;
					}
				}
				if (!repeat) {
					myLotto[i] = wybór;
				}
			}
		}
		Arrays.sort(myLotto);
		System.out.println("Twoje numery lotto to: " + Arrays.toString(myLotto));

		for (int i = 0; i < 6; i++) {
			Random los = new Random();
			int lotto = los.nextInt(49) + 1;

			boolean repeat = false;
			for (int j = 0; j < i; j++) {
				if (lotto == lottoNumbers[j]) {
					i--;
					repeat = true;
					break;
				}
			}
			if (!repeat) {
				lottoNumbers[i] = lotto;
			}
		}
		Arrays.sort(lottoNumbers);
		System.out.println("W tym losowaniu padły następujące numery lotto: " + Arrays.toString(lottoNumbers));

		int[] wynik = new int[6];

		for (int i = 0; i < myLotto.length; i++) {
			for (int j = 0; j < lottoNumbers.length; j++) {
				if (myLotto[i] == lottoNumbers[j]) {
					myLotto[i] = wynik[i];
				}
			}
		}
	//	System.out.println(Arrays.toString(wynik));
		int counter = 0;
		for (int i = 0; i < wynik.length; i++) {
			if (wynik[i] != 0) {
				counter++;
			}
		}
		typ.close();
		if (counter == 3) {
			System.out.println("Trafiłeś trójkę");
		} else if (counter == 4) {
			System.out.println("Trafiłeś czwórkę");
		} else if (counter == 5) {
			System.out.println("Trafiłeś piątkę");
		} else if (counter == 6) {
			System.out.println("BRAWO! Trafiłeś szóstkę");
		} else {
			System.out.println("Przykro nam, spróbuj jeszcze raz");
		}
	}
}
