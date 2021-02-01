package com.cop.united.airlines.api.entites;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "airlinesinformation")
public class AirlinesInfoEntity implements Serializable {

	private static final long serialVersionUID = 4261164618459337732L;

	@Id
	@GeneratedValue
	private String flightId;

	@Column(name = "aircraftName")
	private String aircraftName;

	@Column(name = "from")
	private String departure_city;

	@Column(name = "to")
	private String arrival_city;

	@Column(name = "departure_time")
	private Time Departs_time;

	@Column(name = "arrival_time")
	private Time arrival_time;

	@Column(name = "date")
	private Date date;

	@Column(name = "mins")
	private int duration_in_mins;

	@Column(name = "price")
	private double price;

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAircraftName() {
		return aircraftName;
	}

	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}

	public String getDeparture_city() {
		return departure_city;
	}

	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}

	public String getArrival_city() {
		return arrival_city;
	}

	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDuration_in_mins() {
		return duration_in_mins;
	}

	public void setDuration_in_mins(int duration_in_mins) {
		this.duration_in_mins = duration_in_mins;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Time getDeparts_time() {
		return Departs_time;
	}

	public Time getArrival_time() {
		return arrival_time;
	}

	public void setDeparts_time(Time departs_time) {
		Departs_time = departs_time;
	}

	public void setArrival_time(Time arrival_time) {
		this.arrival_time = arrival_time;
	}

}
