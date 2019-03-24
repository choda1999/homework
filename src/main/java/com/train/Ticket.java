package com.train;


public class Ticket {
    int total_ticket;
    int roundTrip_ticket;

    public Ticket(){
        this.total_ticket = total_ticket;
        this.roundTrip_ticket = roundTrip_ticket;
    }

    public int price(){
        int oneWay_price = 1000;
        int roundTrip_price = 2000;
        int rountTrip_rate = 10;
        int oneWay_ticket = total_ticket - roundTrip_ticket;
        int price = oneWay_ticket*oneWay_price + roundTrip_ticket*roundTrip_price*(100-rountTrip_rate)/100;
        return price;
    }
}
