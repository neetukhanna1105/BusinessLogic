package com.company.taxicorporation.users;

import java.util.ArrayList;
import java.util.List;

public class Rider {
	private String r_firstname;
	private String r_lastname;
	private int r_id;
	private String r_gender;
    private Location fromLocation;
    private Location toLocation;
    private List<Ride> rideList = new ArrayList<Ride>();
    private List<String> bookingHistory;

    public Rider(int r_id, String r_firstname, String r_lastname, String r_gender, Location fromLocation, Location toLocation){
    	this.r_firstname = r_firstname;
    	this.r_lastname = r_lastname;
    	this.r_id = r_id;
    	this.r_gender = r_gender;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }
    
    public String getFirstname() {
        return r_firstname;
    }

    public void setFirstname(String r_firstname) {
        this.r_firstname = r_firstname;
    }
    
    public String getLastname() {
        return r_lastname;
    }

    public void setLastname(String r_lastname) {
        this.r_lastname = r_lastname;
    }
    
    public int getId() {
        return r_id;
    }

    public void setId(int r_id) {
        this.r_id = r_id;
    }
    
    public String getGender() {
        return r_gender;
    }

    public void setGender(String r_gender) {
        this.r_gender = r_gender;
    }

    public Location getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(Location fromLocation) {
        this.fromLocation = fromLocation;
    }

    public Location getToLocation() {
        return toLocation;
    }

    public void setToLocation(Location toLocation) {
        this.toLocation = toLocation;
    }

    public List<Ride> getRideList() {
        return rideList;
    }

    public void setRideList(List<Ride> rideList) {
        this.rideList = rideList;
    }
    
    public List<String> getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(List<String> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }

}
