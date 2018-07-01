package springBoot2.services;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import springBoot2.controller.VehicleDetails;
import springBoot2.utility.VehicleDetailsUtility;

@Service
public class Service1 {

	public VehicleDetails getVd(int id) {

		return VehicleDetailsUtility.map.get(id);
	}

	@PostConstruct
	public void populateVehicledetails() {

		VehicleDetailsUtility.map.put(1, new VehicleDetails(1, "Audi", "white", 500));
		VehicleDetailsUtility.map.put(2, new VehicleDetails(2, "bmw", "red", 400));
		VehicleDetailsUtility.map.put(3, new VehicleDetails(3, "mrec", "black", 300));
		VehicleDetailsUtility.map.put(4, new VehicleDetails(4, "posch", "greev", 200));

	}
}
