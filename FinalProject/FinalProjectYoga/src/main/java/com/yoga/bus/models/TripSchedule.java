package com.yoga.bus.models;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "trip_schedule")
public class TripSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trip_id")
	private Trip tripDetail;
	
	@OneToMany(mappedBy = "tripSchedule", cascade = CascadeType.ALL)
	private Set<Ticket> ticketsSold;
	
	private String tripDate;
	
	private int availableSeats;

	public String getTripDate() {
		return tripDate;
	}

	public void setTripDate(String tripDate) {
		this.tripDate = tripDate;
	}

	public TripSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TripSchedule(Long id, Trip tripDetail, Set<Ticket> ticketsSold, String tripDate, int availableSeats) {
		super();
		this.id = id;
		this.tripDetail = tripDetail;
		this.ticketsSold = ticketsSold;
		this.tripDate = tripDate;
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "TripSchedule [id=" + id + ", tripDetail=" + tripDetail + ", ticketsSold=" + ticketsSold + ", tripDate="
				+ tripDate + ", availableSeats=" + availableSeats + ", getTripDate()=" + getTripDate() + ", hashCode()="
				+ hashCode() + ", getAvailableSeats()=" + getAvailableSeats() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(availableSeats, id, ticketsSold, tripDate, tripDetail);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TripSchedule other = (TripSchedule) obj;
		return availableSeats == other.availableSeats && Objects.equals(id, other.id)
				&& Objects.equals(ticketsSold, other.ticketsSold) && Objects.equals(tripDate, other.tripDate)
				&& Objects.equals(tripDetail, other.tripDetail);
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Trip getTripDetail() {
		return tripDetail;
	}

	public void setTripDetail(Trip tripDetail) {
		this.tripDetail = tripDetail;
	}

	public Set<Ticket> getTicketsSold() {
		return ticketsSold;
	}

	public void setTicketsSold(Set<Ticket> ticketsSold) {
		this.ticketsSold = ticketsSold;
	}
}
