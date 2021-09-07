package com.mpokket.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mpokket.GenericUtils.BaseAPIClass;
import com.mpokket.GenericUtils.Endpoints;
import com.mpokket.Deserialize.EmployeeResponse;
import com.mpokket.Deserialize.GetEmployeeResponse;
import com.mpokket.pojoClass.Data;
import com.mpokket.pojoClass.Employee;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
/*
 * @author Chithra K
 *
 */


public class CreateDeleteEmployeeTest  extends BaseAPIClass{
	@Test 
	public void createEmplyoeeTest() {
		Data data=new Data("test", "123", "23", 25);

		Employee employee = new Employee("success", data);

		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(employee)
				.when()
				.post(Endpoints.addEmployee);
		response.then()
		.log().all();

		int empId=response.jsonPath().get("data.id");
		EmployeeResponse employeeRes = response.getBody().as(EmployeeResponse.class);
		Assert.assertEquals(employeeRes.getMessage(),"Successfully! Record has been added.");
		Assert.assertEquals(employeeRes.getStatus(),employee.getStatus());


		Response getResponse = RestAssured.given()
				.pathParam("id", empId)
				.get(Endpoints.getEmployee);
		getResponse.then().log().all();

		GetEmployeeResponse getEmployeeData = getResponse.getBody().as(GetEmployeeResponse.class);
		Assert.assertEquals(getEmployeeData.getStatus(),employee.getStatus());
		Assert.assertEquals(getEmployeeData.getMessage(),"Successfully! Record has been fetched.");


		RestAssured.given()
		.pathParam("id", empId)
		.delete(Endpoints.deleteEmployee)
		.then()
		.log().all();

	}
}
