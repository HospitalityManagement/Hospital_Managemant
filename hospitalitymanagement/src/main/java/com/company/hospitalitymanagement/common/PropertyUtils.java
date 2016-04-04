package com.company.hospitalitymanagement.common;


import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import com.company.hospitalitymanagement.constants.HMConstants;




public class PropertyUtils implements Serializable {
	private static final long serialVersionUID = -3973320404839428754L;
	private static ResourceBundle bundle = null;
	static {
		try {
			 bundle= ResourceBundle.getBundle(HMConstants.PROPERTY_FILE_NAME, Locale.getDefault());
		} catch (Exception exception) {
		} 
	}

	/**
	 * Used to get property value
	 * 
	 * @param key
	 * @return
	 */
	public static String getProperty(String key) {
		return bundle.getString(key);
	}

}
