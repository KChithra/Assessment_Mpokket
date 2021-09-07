package com.mpokket.GenericUtils;

import java.util.Random;
/**
 * This method will generate a random number
 *
 * @author Chithra K
 * @return
 */
public class JavaUtility {
	
	public int randomNumber() {
		
		Random random = new Random();
		int randomData=random.nextInt(5000);
		return randomData;
	}

}
