package com.company.taxicorporation;
import java.util.List;

import org.testng.annotations.*;

import com.company.taxicorporation.services.BookingService;

public class DriverBookings extends BaseClass {
	public DriverBookings() {
		super();
	}
	@BeforeClass
	public void setUp() {
		dbConnect();
	}
	
	@Test
	public List<BookingService> history(int d_id) {
		BookingService bookingHistory = new BookingService();
		bookingHistory.rideHistory(d_id);
        return (List<BookingService>) bookingHistory;		
	}
	
}
