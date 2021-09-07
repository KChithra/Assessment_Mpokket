package com.mpokket.Deserialize;

/*
 * {
    "status": "success",
    "data": null,
    "message": "Successfully! Record has been fetched."
}
 */
public class GetEmployeeResponse {

	String status;
	String data;
	String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		
		this.message = message;
	}	
	
}
