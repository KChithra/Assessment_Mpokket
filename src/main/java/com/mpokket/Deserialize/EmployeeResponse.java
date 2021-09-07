package com.mpokket.Deserialize;

/*
 * {
    "status": "success",
    "data": {
        "id": 8878
    },
    "message": "Successfully!!! Record has been added."
}
 */
public class EmployeeResponse {

	String status;
	Data data;	
	String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	

}
