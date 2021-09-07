package com.mpokket.pojoClass;

import com.mpokket.pojoClass.Data;

/*
 * {
    "status": "success",
    "data": {
        "name": "test",
        "salary": "123",
        "age": "23",
        "id": 25
    }
}
 */
public class Employee {

	String status;	
	Data data;

	public Employee(String status, Data data) {
		super();
		this.status = status;
		this.data = data;
	}

	public Employee() {
		super();
	}

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
	
	
}
