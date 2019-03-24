package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    val toatl_ticket = scanner.nextInt()
    print("How many round-trip tickets:")
    val roundTrip_ticket = scanner.nextInt()
    println("Total tickets: $toatl_ticket")
    println("Round Trip: $roundTrip_ticket")
    val ticket = TicketKt(toatl_ticket,roundTrip_ticket)
    val totalPrice = ticket.price()
    println("Total: $totalPrice")
}

class TicketKt(var total_ticket:Int,var roundTrip_ticket:Int){
    val oneWay_price = 1000
    val roundTrip_price = 2000
    val roundTrip_rate = 90
    var oneWay_ticket = total_ticket - roundTrip_ticket

    fun price():Int{
        val price = oneWay_ticket*oneWay_price + roundTrip_ticket*roundTrip_price*roundTrip_rate/100
        return price
    }
 }

