package com.company.taxicorporation;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.company.taxicorporation.services.BookingService;

public class RiderHistory extends BaseClass {
	public RiderHistory() {
		super();
	}
	@BeforeClass
	public void setUp() {
		dbConnect();
	}

	@Test
	public List<BookingService> history(int r_id) {
		BookingService bookingHistory = new BookingService();
		bookingHistory.riderHistory(r_id);
        return (List<BookingService>) bookingHistory;		
	}
}
