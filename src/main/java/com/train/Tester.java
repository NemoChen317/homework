package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        int tickets = 0;
        do {
            System.out.print("Please enter number of tickets: ");
            Scanner scanner = new Scanner(System.in);
            tickets = scanner.nextInt();

            if(tickets != -1) {
                System.out.print("How many round-trip tickets: ");
                int round_trip_tickets = scanner.nextInt();

                while (tickets <= round_trip_tickets) {
                    System.out.print("How many round-trip tickets: ");
                    round_trip_tickets = scanner.nextInt();
                }

                Ticket ticket = new Ticket(tickets, round_trip_tickets);
                ticket.print();
            }
        }while (tickets != -1);
    }
}
