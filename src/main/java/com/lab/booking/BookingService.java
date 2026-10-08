package com.lab.booking;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    public static final String DEFAULT_STATUS = "CONFIRMED";

    public List<Booking> getBookings() {
        return List.of(
                new Booking("B1001", "HLT001", "A. Sharma", DEFAULT_STATUS),
                new Booking("B1002", "HLT002", "J. Smith", DEFAULT_STATUS));
    }
}
