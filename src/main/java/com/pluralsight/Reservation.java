package com.pluralsight;

public class Reservation {
    // field members (backing variables) or attributes
    private String roomType;
    private int numberOfNights;
    private boolean IsWeekend;

    // constructor


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

    //derived getter
    private double getPrice() {
//        if (this.roomType.equalsIgnoreCase("King")) {
//            return 139.00;
//        } else if (this.roomType.equalsIgnoreCase("Queen")) {
//            return 124.00;
//        } else {
//            throw new IllegalArgumentException("Invalid room type" + this.roomType);
//        }
        return switch (roomType.toLowerCase()) {
            case "king" -> 139;
            case "double" -> 124;
            default -> throw new IllegalArgumentException("Invalid room type: " + roomType);
        };
    }

    public double getReservationTotal() {
       double total = getPrice() * numberOfNights;
        if (isWeekend()) {
        total = total * 1.10;
        }
        return total;
    }

}

