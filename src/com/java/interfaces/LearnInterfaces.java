package com.java.interfaces;

interface Vehicle {
	void getServiceCentres();
	
	default void getRefillingStations() {
		System.out.println("Default refuelling stations");
	}
	
	static void getFuelPrice() {
		System.out.println("INR 75 per litre.");
	}
}

public class LearnInterfaces implements Vehicle{

	@Override
	public void getServiceCentres() {
		System.out.println("Implemented service centre");
		
	}
	
	@Override
	public void getRefillingStations() {
		System.out.println("Implemented refuelling stations");
	}
	
	public static void main(String[] args) {
		LearnInterfaces car = new LearnInterfaces();
		
		car.getServiceCentres();
		
		car.getRefillingStations();
		
		Vehicle.getFuelPrice();
		
	}	

}
