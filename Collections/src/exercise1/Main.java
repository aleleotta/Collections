package exercise1;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		int num = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 20; i++) {
			num = (int) (Math.random() * 100);
			list.add(num);
		}
		Collections.sort(list);
		System.out.print("List: ");
		for(int numRead: list) {
			System.out.print(" " + numRead);
		}
		sc.close();
	}
}

/*
Implementa una aplicación donde se insertan 20 números enteros aleatorios distintos, menores que 100, en una colección.
Hay que asegurarse de que se guardan 20.
Deben guardarse ordenados a medida que se vayan generando, y se mostrará la colección resultante por pantalla.
*/