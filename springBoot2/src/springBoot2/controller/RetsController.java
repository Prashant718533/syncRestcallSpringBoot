package springBoot2.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springBoot2.services.Service1;
import springBoot2.utility.VehicleDetailsUtility;

@RestController
public class RetsController {
	@Autowired
	private Service1 service1;

	@GetMapping(path = "/vD", params = { "id" })
	public VehicleDetails services(int id) {
		return service1.getVd(id);

	}

}
