package com.yoga.bus.payload.request;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

public class UserPasswordRequest {
	  @ApiModelProperty(hidden = true)
		private Long id;

	  private String password;

	@Override
	public int hashCode() {
		return Objects.hash(id, password);
	}

	public UserPasswordRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPasswordRequest(Long id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserPasswordRequest [id=" + id + ", password=" + password + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPasswordRequest other = (UserPasswordRequest) obj;
		return Objects.equals(id, other.id) && Objects.equals(password, other.password);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	}
