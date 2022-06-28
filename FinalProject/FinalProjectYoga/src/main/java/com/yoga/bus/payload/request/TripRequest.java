package com.yoga.bus.payload.request;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class TripRequest {
	@ApiModelProperty(hidden = true)
	private Long id;
	
	private int fare;
	
	private int journeyTime;
	
	private Long sourceStopId;
	
	private Long destStopId;
	
	public TripRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TripRequest(Long id, int fare, int journeyTime, Long sourceStopId, Long destStopId, Long busId,
			Long agencyId) {
		super();
		this.id = id;
		this.fare = fare;
		this.journeyTime = journeyTime;
		this.sourceStopId = sourceStopId;
		this.destStopId = destStopId;
		this.busId = busId;
		this.agencyId = agencyId;
	}

	@Override
	public String toString() {
		return "TripRequest [id=" + id + ", fare=" + fare + ", journeyTime=" + journeyTime + ", sourceStopId="
				+ sourceStopId + ", destStopId=" + destStopId + ", busId=" + busId + ", agencyId=" + agencyId
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}

	private Long busId;
	
	private Long agencyId;

	@Override
	public int hashCode() {
		return Objects.hash(agencyId, busId, destStopId, fare, id, journeyTime, sourceStopId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TripRequest other = (TripRequest) obj;
		return Objects.equals(agencyId, other.agencyId) && Objects.equals(busId, other.busId)
				&& Objects.equals(destStopId, other.destStopId) && fare == other.fare && Objects.equals(id, other.id)
				&& journeyTime == other.journeyTime && Objects.equals(sourceStopId, other.sourceStopId);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getJourneyTime() {
		return journeyTime;
	}

	public void setJourneyTime(int journeyTime) {
		this.journeyTime = journeyTime;
	}

	public Long getSourceStopId() {
		return sourceStopId;
	}

	public void setSourceStopId(Long sourceStopId) {
		this.sourceStopId = sourceStopId;
	}

	public Long getDestStopId() {
		return destStopId;
	}

	public void setDestStopId(Long destStopId) {
		this.destStopId = destStopId;
	}

	public Long getBusId() {
		return busId;
	}

	public void setBusId(Long busId) {
		this.busId = busId;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}
}
