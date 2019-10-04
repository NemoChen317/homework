package com.train;

public class Ticket {
    int totalTicket;
    int roundTripTicket;

    public Ticket(int totalTicket, int roundTripTicket) {
        this.totalTicket = totalTicket;
        this.roundTripTicket = roundTripTicket;
    }

    public double totalPrice(){
        double roundPrice = roundTripTicket * 2000 * 0.9;

        return roundPrice + ((totalTicket - roundTripTicket) * 1000);
    }

    public void print(){
        System.out.println("Total tickets: " + totalTicket);
        System.out.println("Round-trip: " + roundTripTicket);
        System.out.println("Total: " + totalPrice());
    }
}
