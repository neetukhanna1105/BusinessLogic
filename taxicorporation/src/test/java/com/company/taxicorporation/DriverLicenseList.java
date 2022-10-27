package com.company.taxicorporation;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.company.taxicorporation.services.UserService;
import com.company.taxicorporation.users.Driver;
import com.company.taxicorporation.users.Location;

public class DriverLicenseList extends BaseClass {
	private UserService userService = UserService.getInstance();
	public DriverLicenseList() {
		super();
	}
	@BeforeClass
	public void setUp() {
		dbConnect();
	}

	@Test
	public List<Driver> getAllAvailableDriversLicense(Location location) {
        List<Driver> driverList = new ArrayList<Driver>();
        for(Driver driver : userService.getDriverMap().values()){
            if(driver.isAvailable() && (driver.getLicense() != null)){
                driverList.add(driver);
            }
        }
        return driverList;
    }

}
