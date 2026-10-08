package com.lab.booking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * FAILURE DRILL TEST - intentionally brittle.
 *
 * It pins exact values, so a tiny change breaks the build. Use it to practise
 * pipeline failure handling (Jenkins test stage, SonarQube gate, rollback).
 *
 * Ways to break it:
 *   - change BookingService.DEFAULT_STATUS from "CONFIRMED" to anything else
 *   - add or remove a Booking in BookingService.getBookings()
 *   - rename the first booking id from B1001
 * To fix: revert the change (or update the expected values here).
 */
class BookingFailureDrillTest {

    private final BookingService service = new BookingService();

    @Test
    void drill_exactlyTwoConfirmedBookingsStartingAtB1001() {
        var bookings = service.getBookings();

        assertEquals(2, bookings.size());
        assertEquals("CONFIRMED", bookings.get(0).status());
        assertEquals("B1001", bookings.get(0).id());
    }
}
