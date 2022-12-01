package com.example.bigxpbowl.Reservation.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationModel
{
    private int startTime;
    private int endTime;
    private int amountOfPeople;
    private int reservationPrice;
    private int reservationID;

    public ReservationModel(int startTime, int endTime, int amountOfPeople, int reservationPrice, int reservationID)
    {
        this.startTime = startTime;
        this.endTime = endTime;
        this.amountOfPeople = amountOfPeople;
        this.reservationPrice = reservationPrice;
        this.reservationID = reservationID;
    }

    @Override
    public String toString()
    {
        return "Model{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", amountOfPeople=" + amountOfPeople +
                ", reservationPrice=" + reservationPrice +
                ", reservationID=" + reservationID +
                '}';
    }
}
