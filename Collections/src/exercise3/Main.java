package exercise3;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String word = "";
		TreeSet<String> list = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		while(!(word.equalsIgnoreCase("end"))) {
			System.out.print("\nIntroduce a word: ");
			word = sc.nextLine();
			if(!(word.equalsIgnoreCase("end"))) {
				list.add(word);
			}
		}
		System.out.print("List: ");
		for(String readWord: list) {
			System.out.print(" " + readWord);
		}
		sc.close();
	}
}

/*
Repite la actividad 2 de forma que se inserten los nombres manteniendo el orden alfabético.
*/