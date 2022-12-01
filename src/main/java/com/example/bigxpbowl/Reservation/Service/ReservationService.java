package com.example.bigxpbowl.Reservation.Service;

import com.example.bigxpbowl.Reservation.Model.ReservationModel;
import org.springframework.data.repository.CrudRepository;

public class ReservationService
{
    private final CrudRepository<ReservationModel, Long> repository;

    public ReservationService(CrudRepository<ReservationModel, Long> repository)
    {
        this.repository = repository;
    }

    public Iterable<ReservationModel> showAllReservations()
    {
        return repository.findAll();
    }

    public ReservationModel create(ReservationModel reservation)
    {
        return repository.save(reservation);
    }
}
