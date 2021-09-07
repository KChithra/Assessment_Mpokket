package com.mpokket.GenericUtils;

import io.restassured.response.Response;

/**
 * 
 * method will give the data according to the json path passed
 * @param jsonPath
 * @param response
 * 
 * @author Chithra K
 *
 * @return
 */
public class JsonUtility {
	
	public String getJsonPathData(String jsonPath,Response response) {
		String result=response.jsonPath().get(jsonPath);
		return result;


	}
}
