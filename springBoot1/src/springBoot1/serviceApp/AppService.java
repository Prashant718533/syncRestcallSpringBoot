package springBoot1.serviceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import springBoot1.controller.EmpName;
import springBoot1.controller.VehicleDetails;

@Service
public class AppService {

	// @Autowired
	RestTemplate restTemplate;
	@Autowired
	private EmpName empName;

	public EmpName getVD1(int id, String name) {
		String url = "http://localhost:8181/vD?id=" + id;

		VehicleDetails vehicleDetails = restTemplate.getForObject(url, VehicleDetails.class);
		empName.setVehicleDetails2(vehicleDetails);
		empName.setName(name);
		return empName;
	}

	public AppService() {
		restTemplate = new RestTemplate();

		// TODO Auto-generated constructor stub
	}

}
