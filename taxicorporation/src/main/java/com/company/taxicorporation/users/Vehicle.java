package com.company.taxicorporation.users;

public class Vehicle {
	private String model;
    private int license_no;
    private int manufacture_year;
    private int owner_id;
    private Location location;
    private boolean available;

    public Vehicle(String model, int license_no, int manufacture_year, int owner_id, Location location, boolean available)
    {
        this.model = model;
        this.license_no = license_no;
        this.manufacture_year = manufacture_year;
        this.owner_id = owner_id;
        this.location = location;
        this.available = available;
    }

    public String getModelname() {
        return model;
    }

    public void setModelname(String model) {
        this.model = model;
    }

    public int getLicense() {
        return license_no;
    }

    public void setLicense(int license_no) {
        this.license_no = license_no;
    }
    
    public int getManufactureyear() {
        return manufacture_year;
    }

    public void setManufactureyear(int manufacture_year) {
        this.manufacture_year = manufacture_year;
    }
    
    public int getOwnerid() {
        return owner_id;
    }

    public void setOwnerid(int owner_id) {
        this.owner_id = owner_id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

	public boolean isAvailable(boolean available) {
		return true;
	}

}
