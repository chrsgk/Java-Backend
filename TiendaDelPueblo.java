package ShopGrace;

import java.util.ArrayList;

public class TiendaDelPueblo {
	
	private String[] productList;
	private double[] itemPrice;
	
	public void itemCounter() {
		
	ArrayList<String> productList = new  ArrayList<String>();
		productList.add("leche");
		productList.add("queso");
		productList.add("cafe");
		productList.add("galletas");
		productList.add("pan");
		productList.add("carne");
		productList.add("pollo");
		productList.add("pavo");
		productList.add("cordero");
		productList.add("vaca");
		productList.add("pernil");
		
		double[] itemPrice = new double[10];
		itemPrice[0] = 1.22;
		itemPrice[1] = 3.45;
		itemPrice[2] = 5.22;
		itemPrice[3] = 1.30;
		itemPrice[4] = 2.30;
		itemPrice[5] = 8.20;
		itemPrice[6] = 7.50;
		itemPrice[7] = 6.30;
		itemPrice[8] = 23.2;
		itemPrice[9] = 30.0;
		
	}
	
	public void comprar(String itemName, int quantity) {
		// Boolean variable which will determine if the product name is in our array (productList ).
		boolean hacerCompra = false;
		
		// Loop through the names of the productList.
		
		for (int i = 0; i < productList.length; i++) {
			
			//If the name is in the array then
			
			if(productList[i].equals(itemName)) {
				
				//Here we compute the cost of the item selected from productList
				
				double cost = itemPrice[i] * quantity;
				
				// Print the cost of the item(s) ordered.
				
				System.out.println("The cost of " + quantity + "" + itemName + "Item(s) is: €" + cost + ".");
				
				hacerCompra = true;
				break;
			}	
		}
		// The name of the item is not in the array.
		if(hacerCompra == false) {
			System.out.println("We have no item by the name" + itemName + ".");
		}
		
	}

}
