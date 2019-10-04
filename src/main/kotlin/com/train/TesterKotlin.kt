package com.train

fun main(args: Array<String>) {

    var tickets = 0
    do {
        print("Please enter number of tickets: ")
        tickets = readLine()!!.toInt()

        if(tickets != -1) {
            print("How many round-trip tickets: ")
            var roundTripTickets = readLine()!!.toInt()

            while (tickets <= roundTripTickets) {
                print("How many round-trip tickets: ")
                roundTripTickets = readLine()!!.toInt()
            }

            val ticket = Ticket(tickets, roundTripTickets)
            ticket.print()
        }
    }while (tickets != -1)
}

class Ticket (var totalTickets: Int , var roundTripTickets: Int){
    fun total(): Double{
        val roundTicketsPrice = roundTripTickets * 2000 * 0.9
        return roundTicketsPrice + ((totalTickets - roundTicketsPrice) * 1000)
    }

    fun print(){
        println("Total tickets: $totalTickets")
        println("Round-trip: $roundTripTickets")
        println("Total: ${total()}")
    }
}