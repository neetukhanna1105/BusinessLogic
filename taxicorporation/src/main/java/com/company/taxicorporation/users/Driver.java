package com.company.taxicorporation.users;

import java.util.Date;

public class Driver {

	private String d_firstname;
	private String d_lastname;
	private int d_id;
	private String d_gender;
	private Vehicle vehicle;
    private boolean available;
    private String d_license;
    private Date d_expiry;

    public Driver(int d_id, String d_firstname, String d_lastname, String d_gender, Vehicle vehicle, String d_license, Date d_expiry, boolean available){
    	this.d_firstname = d_firstname;
    	this.d_lastname = d_lastname;
    	this.d_id = d_id;
    	this.d_gender = d_gender;
        this.vehicle = vehicle;
        this.d_license = d_license;
        this.d_expiry = d_expiry;
        this.available = available;
    }
    
    public String getFirstname() {
        return d_firstname;
    }

    public void setFirstname(String d_firstname) {
        this.d_firstname = d_firstname;
    }
    
    public String getLastname() {
        return d_lastname;
    }

    public void setLastname(String d_lastname) {
        this.d_lastname = d_lastname;
    }
    
    public int getId() {
        return d_id;
    }

    public void setId(int d_id) {
        this.d_id = d_id;
    }
    
    public String getGender() {
        return d_gender;
    }

    public void setGender(String d_gender) {
        this.d_gender = d_gender;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public String getLicense() {
        return d_license;
    }

    public void setLicense(String d_license) {
        this.d_license = d_license;
    }
    
    public Date getExpiry() {
        return d_expiry;
    }

    public void setExpiry(Date d_expiry) {
        this.d_expiry = d_expiry;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

