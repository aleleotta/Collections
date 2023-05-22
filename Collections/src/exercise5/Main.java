package exercise5;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String productName = "";
		double price = 0;
		int option = 10;
		HashMap<String, Double> map = new HashMap<String, Double>();
		Scanner sc = new Scanner(System.in);
		while(option != 0) {
			Functions.menu();
			option = sc.nextInt();
			sc.nextLine();
			switch(option) {
			case 1: //CREATE
				System.out.print("Introduce the name of the product: ");
				productName = sc.nextLine();
				System.out.print("Introduce the price: ");
				price = sc.nextDouble();
				sc.nextLine();
				if(!(map.containsKey(productName))) {
					map.put(productName, price);
					for(HashMap.Entry<String, Double> productRead: map.entrySet()) {
						System.out.println("\nProduct: " + productRead.getKey());
						System.out.println("Price: " + productRead.getValue() + "\n");
					}
				} else {
					System.out.println("\nThe following product is already available within the list.\n");
				}
				break;
			case 2: //DELETE
				System.out.print("Introduce the name of the product that you would like to delete: ");
				productName = sc.nextLine();
				if(map.containsKey(productName)) {
					map.remove(productName);
					for(HashMap.Entry<String, Double> productRead: map.entrySet()) {
						System.out.println("\nProduct: " + productRead.getKey());
						System.out.println("Price: " + productRead.getValue() + "\n");
					}
				} else {
					System.out.println("\nThe following product doesn't exist within the list.\n");
				}
				break;
			case 3: //READ
				for(HashMap.Entry<String, Double> productRead: map.entrySet()) {
					System.out.println("\nProduct: " + productRead.getKey());
					System.out.println("Price: " + productRead.getValue() + "\n");
				}
				break;
			case 0: //EXIT
				break;
			default: //ERROR
				System.out.println("The following option is invalid!");
				break;
			}
		}
		sc.close();
	}
}

/*
Realiza una aplicación donde se registren nombres de productos y su precio. Lleva a cabo el siguiente menú:
PRODUCTOS
1. Alta de producto
2. Baja de producto
4. Listar existencias
0. Salir
El orden en el que se almacenan los productos no importa.
*/