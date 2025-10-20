package com.pluralsight;

public class Main {
    public static void main(String[] args) {
    // Testing the reservation total - not on the weekend
        Reservation reservation1 = new Reservation("King", 1,false);
        System.out.println(reservation1.getReservationTotal());
    // Testing the reservation total - on the weekend
        Reservation reservation2 = new Reservation("King", 1, true);
        System.out.println(reservation2.getReservationTotal());

    }

}
