package com.yoga.bus.models;

import java.util.Objects;

import javax.persistence.*;


@Entity
@Table(name = "ticket")
public class Ticket {
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", seatNumber=" + seatNumber + ", cancellable=" + cancellable + ", journeyDate="
				+ journeyDate + ", tripSchedule=" + tripSchedule + ", passenger=" + passenger + ", hashCode()="
				+ hashCode() + ", getSeatNumber()=" + getSeatNumber() + ", getCancellable()=" + getCancellable()
				+ ", getJourneyDate()=" + getJourneyDate() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cancellable, id, journeyDate, passenger, seatNumber, tripSchedule);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(cancellable, other.cancellable) && Objects.equals(id, other.id)
				&& Objects.equals(journeyDate, other.journeyDate) && Objects.equals(passenger, other.passenger)
				&& seatNumber == other.seatNumber && Objects.equals(tripSchedule, other.tripSchedule);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int seatNumber;
	
	private Boolean cancellable;
	
	private String journeyDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trip_schedule_id")
	private TripSchedule tripSchedule;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User passenger;

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Boolean getCancellable() {
		return cancellable;
	}

	public void setCancellable(Boolean cancellable) {
		this.cancellable = cancellable;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TripSchedule getTripSchedule() {
		return tripSchedule;
	}

	public void setTripSchedule(TripSchedule tripSchedule) {
		this.tripSchedule = tripSchedule;
	}

	public User getPassenger() {
		return passenger;
	}

	public void setPassenger(User passenger) {
		this.passenger = passenger;
	}
}
