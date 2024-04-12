package com.xworkz.flight.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Flightbooking {
    String flightName;
    String source;
    String destination;
    int price;
}
