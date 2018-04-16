import java.util.Scanner;

public class Gra_w_zgadywanie_liczb_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int guess = 0;
		System.out.println("Pomyśl liczbę (najlepiej gdzieś zapisz) od 0 do 1000, a ja ją zgadnę w max 10 próbach: ");
		System.out.println("wpisuj na konsoli odpowiedź: \"za dużo\", \"za mało\" lub \"zgadłeś\"");
		int min =0;
		int max =1000;
String odpowiedz = "";
int counter =0;

while (!odpowiedz.equals("zgadłeś")) {
	guess = (max-min)/2+min;
	System.out.println("jest to " + guess);
	odpowiedz = scan.nextLine();
	counter ++;
	if (odpowiedz.equals("za mało")) {
		min = guess;
	}
	else if (odpowiedz.equals("za dużo")) {
		max = guess;
	} else if (!odpowiedz.equals("za mało")&&!odpowiedz.equals("za dużo")&&!odpowiedz.equals("zgadłeś")){
		System.out.println("nie oszukuj!");
	}
}
	scan.close();
	System.out.println("Wygrałem!");
	System.out.println("Widzisz, mówiłem Ci, potrzebowałem " + counter + " prób");
	}
}

