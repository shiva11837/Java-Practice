package com.codegnan.java;
import java.util.LinkedList;
import java.util.Scanner;
public class ShoppingCart {
	public static void main(String[] args) {
		LinkedList<String>cart = new LinkedList<>();
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.println("Shopping cart menu");
		System.out.println("1.add item");
		System.out.println("2.remove item");
		System.out.println("3.view first added item");
		System.out.println("4.view last added item");
		System.out.println("5.view all items");
		System.out.println("6.exit");
		System.out.println("enter your choice");
		int choice = s.nextInt();
		s.nextLine();
		switch(choice) {
		case 1:
			System.out.println("enter item to add");
			String addedItem = s.nextLine();
			cart.add(addedItem);
			System.out.println(addedItem + " item added sucessfully");
			break;
		case 2:
			System.out.println("enter item you need to remove");
			String removeItem = s.nextLine();
			if(cart.remove(removeItem)) {
			System.out.println(removeItem+ " item removed sucessfully");
			}else {
				System.out.println("item not found");
			}
			break;
		case 3:
			System.out.println(" view first added item");
			//String firstItem = s.nextLine();
			if(!cart.isEmpty()) {
			System.out.println(" added first" + cart.getFirst());
			}else {
				System.out.println("cart is empty");
			}
			break;
		case 4:
			System.out.println("view last item added");
			//String lastItem = s.nextLine();
			if(!cart.isEmpty()) {
			System.out.println(" item added last" + cart.getLast());
			}else {
				System.out.println("cart is empty");
			}
			break;
		case 5:
			System.out.println("view all items in a cart");
			System.out.println(cart);
			break;
		case 6:
			System.out.println("exit");
			s.close();
			return;
		default:
		{
			System.out.println("invalid choice");
		}
		}
		}
	}
}
