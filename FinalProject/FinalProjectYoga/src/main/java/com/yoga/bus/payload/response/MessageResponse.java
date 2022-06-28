package com.yoga.bus.payload.response;

import java.util.List;
import java.util.Objects;

public class MessageResponse<T> {
	private String message;
	private Boolean success;
	private List<T> data;
	private T object;

	public MessageResponse(String message) {
		this.message = message;
	}

	public MessageResponse(Boolean success, String message, List<T> data) {
		this.success = success;
		this.message = message;
		this.data = data;
	}

	public MessageResponse(Boolean success, String message, T object) {
		this.success = success;
		this.message = message;
		this.object = object;
	}

	public MessageResponse(Boolean success, String message) {
		this.success = success;
		this.message = message;
		this.data = null;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, message, object, success);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageResponse other = (MessageResponse) obj;
		return Objects.equals(data, other.data) && Objects.equals(message, other.message)
				&& Objects.equals(object, other.object) && Objects.equals(success, other.success);
	}

	@Override
	public String toString() {
		return "MessageResponse [message=" + message + ", success=" + success + ", data=" + data + ", object=" + object
				+ ", getMessage()=" + getMessage() + ", getSuccess()=" + getSuccess() + ", getData()=" + getData()
				+ ", getObject()=" + getObject() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	public MessageResponse(String message, Boolean success, List<T> data, T object) {
		super();
		this.message = message;
		this.success = success;
		this.data = data;
		this.object = object;
	}

	public MessageResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
}