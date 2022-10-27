package com.company.taxicorporation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.annotations.BeforeClass;

import com.company.taxicorporation.services.UserService;
import com.company.taxicorporation.users.Driver;
import com.company.taxicorporation.users.Location;
import com.company.taxicorporation.users.Vehicle;

public class RideDetail extends BaseClass {
	private UserService userService = UserService.getInstance();
	public RideDetail() {
		super();
	}
	@BeforeClass
	public void setUp() {
		dbConnect();
	}

	@Test
	public List<Vehicle> getAllBookedVehicle(Location location) {
		List<Driver> driverList = new ArrayList<Driver>();
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        for(Vehicle vehicle : userService.getVehicleMap().values()){
            if(vehicle.isAvailable(true) && driverList.contains(vehicle)){
            	vehicle.getModelname();
            }
        }
        return vehicleList;
    }
}
