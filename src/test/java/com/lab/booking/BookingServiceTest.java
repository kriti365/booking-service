package com.lab.booking;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Real unit test: checks behaviour that should always hold. */
class BookingServiceTest {

    private final BookingService service = new BookingService();

    @Test
    void bookingsHaveIdsAndHotelsAndAreNotEmpty() {
        var bookings = service.getBookings();

        assertFalse(bookings.isEmpty());
        assertTrue(bookings.stream()
                .allMatch(b -> !b.id().isBlank() && !b.hotelId().isBlank()));
    }
}
