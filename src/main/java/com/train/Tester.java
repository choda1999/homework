package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        System.out.print("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        ticket.total_ticket = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        ticket.roundTrip_ticket = scanner.nextInt();
        System.out.println("Total tickets:" + ticket.total_ticket);
        System.out.println("Round Trip:" + ticket.roundTrip_ticket);
        System.out.println("Total:" + ticket.price());
    }
}
