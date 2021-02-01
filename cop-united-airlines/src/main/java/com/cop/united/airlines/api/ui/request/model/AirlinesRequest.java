package com.cop.united.airlines.api.ui.request.model;

import java.sql.Date;
import java.sql.Time;

public class AirlinesRequest {
	private String flightId;
	private String aircraftName;
	private String departure_city;
	private String arrival_city;
	private Time Departs_time;
	private Time arrival_time;
	private Date date;
	private int duration_in_mins;
	private double price;

	public String getFlightId() {
		return flightId;
	}

	public String getAircraftName() {
		return aircraftName;
	}

	public String getDeparture_city() {
		return departure_city;
	}

	public String getArrival_city() {
		return arrival_city;
	}

	public Time getDeparts_time() {
		return Departs_time;
	}

	public Time getArrival_time() {
		return arrival_time;
	}

	public Date getDate() {
		return date;
	}

	public int getDuration_in_mins() {
		return duration_in_mins;
	}

	public double getPrice() {
		return price;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}

	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}

	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
	}

	public void setDeparts_time(Time departs_time) {
		Departs_time = departs_time;
	}

	public void setArrival_time(Time arrival_time) {
		this.arrival_time = arrival_time;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDuration_in_mins(int duration_in_mins) {
		this.duration_in_mins = duration_in_mins;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
