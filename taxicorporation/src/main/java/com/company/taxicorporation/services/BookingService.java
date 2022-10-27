package com.company.taxicorporation.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.company.taxicorporation.Exceptions.CreateException;
import com.company.taxicorporation.Exceptions.DriverNotAvailableException;
import com.company.taxicorporation.users.*;

public class BookingService {
	private static BookingService rideBookingService = null;

    public BookingService(){

    }

    public static BookingService getInstance(){
        if(rideBookingService == null){
        	rideBookingService = new BookingService();
        }
        return rideBookingService;
    }

    private UserService userService = UserService.getInstance();

    private RideService rideService = RideService.getInstance();

    public Driver registerDriver(int d_id, String d_firstname, String d_lastname, String d_gender, Vehicle vehicle, String d_license, Date d_expiry, boolean available) throws CreateException{
        return userService.registerDriver(d_id, d_firstname, d_lastname, d_gender, vehicle, d_license, d_expiry, available);
    }
    public Rider registerRider(int r_id, String r_firstname, String r_lastname, String r_gender, Location fromLocation, Location toLocation) throws CreateException {
        return userService.registerRider(r_id, r_firstname, r_lastname, r_gender, fromLocation, toLocation);
    }

    public Driver bookRide(int riderId, Location fromLocation, Location toLocation) throws DriverNotAvailableException {
        return rideService.bookRide(riderId, fromLocation, toLocation);
    }
    
    public BookingService bookings(int riderId, Location fromLocation, Location toLocation) {
    	Vehicle vehicle;
    	BookingService booking = new BookingService();
    	booking.bookings(riderId, fromLocation, toLocation);
    	return booking;
    }
    
    public List<BookingService> rideHistory(int d_Id) {
    	List<BookingService> driver = this.rideHistory(d_Id);
        List<BookingService> bookingHistory = new ArrayList<>();
        for(BookingService bookingId : driver){
        	bookingHistory.add(bookingId);
        }
        return bookingHistory;
    }
    
    public List<BookingService> riderHistory(int r_Id) {
    	List<BookingService> rider = this.rideHistory(r_Id);
        List<BookingService> bookingHistory = new ArrayList<>();
        for(BookingService bookingId : rider){
        	bookingHistory.add(bookingId);
        }
        return bookingHistory;
    }
    
}