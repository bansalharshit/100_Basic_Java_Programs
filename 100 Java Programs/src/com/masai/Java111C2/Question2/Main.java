package com.masai.Java111C2.Question2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter no of bookings: ");
	int booking=Integer.parseInt(sc.nextLine());
	
	System.out.println("enter the available tickets");
	int availableTickets=Integer.parseInt(sc.nextLine());
	
	Ticket.setAvailableTickets(availableTickets);
	if(booking<=availableTickets) {
		
	
	while(booking>0) {
		System.out.println("Enter the ticketsId: ");
		int ticketId=sc.nextInt();
		System.out.println("Enter the Price of ticket");
		int price=sc.nextInt();
		System.out.println("Enter the number of tickets you want to book");
		int noOfTickets=sc.nextInt();
		
		Ticket t1=new Ticket(ticketId,price);
		System.out.println("Available Tickets before Booking: "+t1.getAvailableTickets());
		
		int totalCost=t1.calculateTicketCost(noOfTickets);
		
		if(totalCost!=-1) {
			System.out.println("Total Amounts: "+totalCost);
			System.out.println("Available Tickets after booking: "+t1.getAvailableTickets());
			System.out.println("======================================");
		}else {
			System.out.println("Plese book either less or equal number of available tickets");
		}
		booking--;
		return;
	}
	
	
	}else {
		System.out.println("Tickets Not available");
	}
	
	System.out.println("Thanks for Booking !");
}
}
