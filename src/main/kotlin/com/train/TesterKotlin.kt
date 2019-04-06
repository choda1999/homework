package com.train

import java.util.*

fun main() {
    var countNo = 1
    var checked = 1
    val ticket = TicketKt(0,0,0)
    do{
        val scanner = Scanner(System.`in`)
        println("#Buyer No: $countNo")
        ticket.sell()

        print("Please enter any key to continue or '-1' to stop: ")
        if(scanner.hasNextInt()){
            checked = scanner.nextInt()
        }
        countNo++
    }while(checked != -1)
    println("End of The Ticket System!")
}


class TicketKt(var total_ticket:Int,var roundTrip_ticket:Int,var oneWay_ticket:Int){
    val oneWay_price = 1000
    val roundTrip_price = 2000
    val roundTrip_rate = 90

    fun price():Int{
       val price = oneWay_ticket*oneWay_price + roundTrip_ticket*roundTrip_price*roundTrip_rate/100
       return price
    }

    fun sell(){
        val scanner = Scanner(System.`in`)
        print("Buyer Name: ")
        var buyerName = scanner.next()
        print("Please enter number of tickets:")
        total_ticket = scanner.nextInt()
        print("How many round-trip tickets:")
        roundTrip_ticket = scanner.nextInt()
        oneWay_ticket = total_ticket - roundTrip_ticket
        checked()

        println("Total tickets: $total_ticket")
        println("Round Trip: $roundTrip_ticket")
        var ticket = TicketKt(total_ticket,roundTrip_ticket,oneWay_ticket)
        val totalPrice = ticket.price()
        println("Total: $totalPrice")
    }

    fun checked(){
        while (oneWay_ticket < 0)
        {
            println("@the round-trip ticket can't be larger than the total ticket@")
            print("How many round-trip tickets:")
            val scanner = Scanner(System.`in`)
            roundTrip_ticket = scanner.nextInt()
            oneWay_ticket = total_ticket - roundTrip_ticket
        }
    }
 }

