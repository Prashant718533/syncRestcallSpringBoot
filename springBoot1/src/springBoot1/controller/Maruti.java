package springBoot1.controller;

import org.springframework.stereotype.Component;

@Component
public class Maruti implements vehicle{

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Maruti Starts";
	}

}
