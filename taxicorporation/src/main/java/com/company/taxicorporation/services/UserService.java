package com.company.taxicorporation.services;

import java.util.*;

import com.company.taxicorporation.Exceptions.CreateException;
import com.company.taxicorporation.users.*;

public class UserService {
	private static UserService userService = null;
    private UserService(){
    }
    public Map<Integer, Rider> riderMap = new HashMap<Integer, Rider>();

    public Map<Integer, Driver> driverMap = new HashMap<Integer, Driver>();

    public Map<String, Vehicle> vehicleMap = new HashMap<String, Vehicle>();

    public static UserService getInstance(){
        if(userService == null){
            userService = new UserService();
        }
        return userService;
    }

    public Driver registerDriver(int d_id, String d_firstname, String d_lastname, String d_gender, Vehicle v1, String d_license, Date d_expiry, boolean available) throws CreateException {
        Driver driver = new Driver(d_id, d_firstname, d_lastname, d_gender, v1, d_license, d_expiry, available);
        if(driver == null || driverMap.containsKey(driver.getLicense())){
            throw new CreateException("Driver not created !");
        }
        driverMap.put(driver.getId(), driver);
        vehicleMap.put(driver.getVehicle().getModelname(), driver.getVehicle());
        return driver;
    }

    public Rider registerRider(int r_id, String r_firstname, String r_lastname, String r_gender, Location fromLocation, Location toLocation) throws CreateException{
        Rider rider = new Rider(r_id, r_firstname, r_lastname, r_gender, fromLocation, toLocation);
        if(rider == null || riderMap.containsKey(rider.getId())){
            throw new CreateException("Rider not created.");
        }
        riderMap.put(rider.getId(), rider);
        return rider;
    }

    public Map<Integer, Driver> getDriverMap(){
        return driverMap;
    }

    public Map<Integer, Rider> getRiderMap(){
        return riderMap;
    }

    public Map<String, Vehicle> getVehicleMap(){
        return vehicleMap;
   }

}