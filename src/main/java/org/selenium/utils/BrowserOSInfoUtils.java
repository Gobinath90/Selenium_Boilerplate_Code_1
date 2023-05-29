/** @author Gobinath Ravichandran*/

package org.selenium.utils;

public class BrowserOSInfoUtils {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private BrowserOSInfoUtils() {
	}

	public static String getOS_Browser_BrowserVersionInfo() {
		return OSInfoUtils.getOSInfo() + " & " + BrowserInfoUtils.getBrowserInfo() + " - "
				+ BrowserInfoUtils.getBrowserVersionInfo();

	}
}
