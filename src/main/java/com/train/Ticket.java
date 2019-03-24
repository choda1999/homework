package com.train;


public class Ticket {
    int total_ticket;
    int roundTrip_ticket;
    private int oneWay_price = 1000;
    private int roundTrip_price = 2000;
    private int rountTrip_freerate = 10;

    public Ticket(){
        this.total_ticket = total_ticket;
        this.roundTrip_ticket = roundTrip_ticket;
    }

    public int price(){
        int oneWay_ticket = total_ticket - roundTrip_ticket;
        int price = oneWay_ticket*oneWay_price + roundTrip_ticket*roundTrip_price*(100-rountTrip_freerate)/100;
        return price;
    }
}
