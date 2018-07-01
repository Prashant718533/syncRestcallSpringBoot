package springBoot1.controller;

import org.springframework.stereotype.Component;

@Component
public class Audi implements vehicle{

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Audi starts";
	}
	

}
