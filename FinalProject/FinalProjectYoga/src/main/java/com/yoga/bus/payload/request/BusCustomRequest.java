package com.yoga.bus.payload.request;

import java.util.Objects;

import com.yoga.bus.models.User;

import io.swagger.annotations.ApiModelProperty;

public class BusCustomRequest {
	
	@Override
	public String toString() {
		return "BusCustomRequest [id=" + id + ", code=" + code + ", capacity=" + capacity + ", make=" + make
				+ ", agencyId=" + agencyId + ", getCode()=" + getCode() + ", getCapacity()=" + getCapacity()
				+ ", getMake()=" + getMake() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	@ApiModelProperty(hidden = true)
	private Long id;

	private String code;

	private int capacity;

	private String make;

	@ApiModelProperty(hidden = true)
	private User agencyId;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencyId, capacity, code, id, make);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusCustomRequest other = (BusCustomRequest) obj;
		return Objects.equals(agencyId, other.agencyId) && capacity == other.capacity
				&& Objects.equals(code, other.code) && Objects.equals(id, other.id) && Objects.equals(make, other.make);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(User agencyId) {
		this.agencyId = agencyId;
	}
}
