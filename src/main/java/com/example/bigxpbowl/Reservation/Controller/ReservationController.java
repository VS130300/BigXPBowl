package com.example.bigxpbowl.Reservation.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@CrossOrigin
@RequestMapping(value = "/")
public class ReservationController
{
    @PostMapping("/bowlingbooking")
    public ResponseEntity<String> getBowlingReservations(@RequestBody HashMap<String, String> values)
    {
        System.out.println("Bowling: " + values);
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }

    @PostMapping("/airhockeybooking")
    public ResponseEntity<String> getAirHockeyReservations(@RequestBody HashMap<String, String> values)
    {
        System.out.println("Air Hockey: " + values);
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }

    @PostMapping("/diningbooking")
    public ResponseEntity<String> getDiningReservations(@RequestBody HashMap<String, String> values)
    {
        System.out.println("Dining: " + values);
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }
}
