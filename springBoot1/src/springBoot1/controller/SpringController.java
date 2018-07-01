package springBoot1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBoot1.serviceApp.AppService;

@RestController
public class SpringController {
	@Autowired
	Employee employee;
	@Autowired
	org.springframework.context.ApplicationContext applicationContext;

	@Autowired
	@Qualifier("maruti")
	vehicle vehicle;

	@Autowired
	private AppService appService;

	@RequestMapping("/")
	String home() {

		return "start";
	}

	@GetMapping("/data")
	public Object details() {

		Employee employee = applicationContext.getBean(Employee.class);

		employee.setSalary(1000);
		employee.setId(1);
		employee.setName("Prashant");
		return employee;
	}

	@GetMapping("/vehicle")
	public String Vdetailehs() {
		return vehicle.start();

	}

	@GetMapping(path = "/vehicleDetails", params = { "id", "name" })
	public EmpName getVehicleDetails(int id, String name) {

		
		return appService.getVD1(id, name);
		
	}
}
