package net.scit.travel.ui;

import java.util.Scanner;

public class TravelUI {
	Scanner sc = new Scanner(System.in);
//	CustomerDAO customerDAO = new CustomerDAO();
//	Goods_ListDAO goods_listDAO = new Goods_ListDAO();
//	BookingDAO bookingDAO = new BookingDAO();
//	ReviewDAO reviewDAO = new ReviewDAO();
	
	public TravelUI() {
		String choice;
		while(true) {
			mainMenu();
			choice = sc.nextLine();
		}
	}

	private void mainMenu() {
		// TODO Auto-generated method stub
		
	}
}
