/**
 * 
 */
package com.binarysprite.evemat.object;

import java.io.Serializable;

/**
 * @author Tabunoki
 *
 */
public class User implements Serializable {
	
	public static final String LABEL_USER_ID = "userID";
	
	public static final String LABEL_VARIFICATION_CODE = "varificationCode";

	private Integer userID;
	
	private String varificationCode;

	/**
	 * @return userID
	 */
	public Integer getUserID() {
		return userID;
	}

	/**
	 * @param userID セットする userID
	 */
	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	/**
	 * @return varificationCode
	 */
	public String getVarificationCode() {
		return varificationCode;
	}

	/**
	 * @param varificationCode セットする varificationCode
	 */
	public void setVarificationCode(String varificationCode) {
		this.varificationCode = varificationCode;
	}
}
