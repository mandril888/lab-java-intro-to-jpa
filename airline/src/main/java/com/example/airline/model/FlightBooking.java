package com.example.airline.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "customers_flights")
public class FlightBooking {

    private int customerId;
    private int flightId;

}
