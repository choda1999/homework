package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var toatl_ticket = scanner.nextInt()
    print("How many round-trip tickets:")
    var roundTrip_ticket = scanner.nextInt()
    println("Total tickets:"+toatl_ticket)
    println("Round Trip:" + roundTrip_ticket)
    var ticket = TicketKt(toatl_ticket,roundTrip_ticket)
    println("Total:" + ticket.price())
}

class TicketKt(var total_ticket:Int,var roundTrip_ticket:Int){
    val oneWay_price = 1000
    val roundTrip_price = 2000
    val roundTrip_rate = 90
    var oneWay_ticket = total_ticket - roundTrip_ticket

    fun price():Int{
        var price = oneWay_ticket*oneWay_price + roundTrip_ticket*roundTrip_price*roundTrip_rate/100
        return price
    }
 }

