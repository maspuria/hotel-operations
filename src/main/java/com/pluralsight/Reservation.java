package com.pluralsight;

public class Reservation {
    // field members or attributes
    private String roomType;
    private int numberOfNights;
    private boolean IsWeekend;
    private int price;

    // constructor


    public Reservation(String roomType, int numberOfNights, boolean isWeekend, int price) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        IsWeekend = isWeekend;
        this.price = price;
    }

    //getters and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return IsWeekend;
    }

    public void setWeekend(boolean weekend) {
        IsWeekend = weekend;
    }

    public int getPrice() {
        return price;
    }

    // derived getter
    public double getReservationTotal(){
      return
    }

}
