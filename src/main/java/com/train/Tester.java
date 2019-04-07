package com.train;

import java.util.Scanner;

public class Tester {
//    private static int checked;
    private static String checked;
    private static int countNo;
    public static void main(String[] args) {
        countNo = 1;
//        while(checked != -1){
//        while(!("-1").equals(checked)){           //執行出現NullPointerException
        while(!checked.equals("-1")){
            sellTicket();
            countNo++;
            System.out.print("Please press 'Enter' to continue or '-1' to stop: ");
            Scanner scanner = new Scanner(System.in);
//            checked = Integer.parseInt(scanner.nextLine());           //執行至line16按Entertj出現NumberFormatException: For input string: ""
            checked = scanner.nextLine();
        }
        System.out.println("......End of The Ticket System......");
    }

    private static void sellTicket() {
        Ticket ticket = new Ticket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("#Buyer No: " + countNo);
        System.out.print("Buyer Name: ");
        ticket.name = scanner.next();
        System.out.print("Please enter number of tickets:");
        ticket.total_ticket = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        ticket.roundTrip_ticket = scanner.nextInt();
        while(ticket.roundTrip_ticket > ticket.total_ticket){
            System.out.println("@the round-trip ticket can't be larger than the total ticket@");
            System.out.print("How many round-trip tickets:");
            ticket.roundTrip_ticket = scanner.nextInt();
        }
        System.out.println("Total tickets:" + ticket.total_ticket);
        System.out.println("Round Trip:" + ticket.roundTrip_ticket);
        System.out.println("Total:" + ticket.price());
    }
}
