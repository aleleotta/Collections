package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String word = "";
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(!(word.equalsIgnoreCase("end"))) {
			System.out.print("\nIntroduce a word: ");
			word = sc.nextLine();
			if(!(word.equalsIgnoreCase("end"))) {
				list.add(word);
			}
		}
		Collections.sort(list);
		System.out.print("List: ");
		for(String readWord: list) {
			System.out.print(" " + readWord);
		}
		sc.close();
	}
}

/*
Introduce por teclado, hasta que se introduzca “fin”, una serie de nombres, que se insertarán en una colección,
de forma que se conserve el orden de inserción y que no puedan repetirse. Al final, la colección se mostrará por pantalla.
*/