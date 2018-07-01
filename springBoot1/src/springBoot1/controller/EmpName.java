package springBoot1.controller;

import org.springframework.stereotype.Component;

@Component
public class EmpName {

	private String name;
	private VehicleDetails vehicleDetails2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehicleDetails getVehicleDetails2() {
		return vehicleDetails2;
	}

	public void setVehicleDetails2(VehicleDetails vehicleDetails2) {
		this.vehicleDetails2 = vehicleDetails2;
	}

}
