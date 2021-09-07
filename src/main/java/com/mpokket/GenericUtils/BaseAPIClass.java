package com.mpokket.GenericUtils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.*;

/**
 * 
 * @author Chithra K
 *
 */
public class BaseAPIClass {

	@BeforeSuite
	public void setUp() {

		baseURI="http://dummy.restapiexample.com/api/v1";

	}

	@AfterSuite
	public void tearDown() {
		//close DB connection
	}

}
