package com.javan.util;

import javax.servlet.http.HttpServletRequest;

import com.javan.security.CSRFTokenManager;

public class CSRFTool {

	public static String getToken(HttpServletRequest request) {
		return CSRFTokenManager.getTokenForSession(request.getSession());
	}

}
