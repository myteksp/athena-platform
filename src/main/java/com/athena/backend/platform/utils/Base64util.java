package com.athena.backend.platform.utils;

import java.util.Base64;

public final class Base64util {
	public static final byte[] decode(final String data) {
		final String b64;
		if (data.startsWith("\"")) 
			b64 = data.replaceAll("\"", "");
		else 
			b64 = data;

		if (b64.length() == 0)
			return new byte[] {};
		
		byte[] res = decodeURL(b64);
		
		if (res == null)
			res = decodeMIME(b64);
		else
			return res;
		
		if (res == null)
			res = decodeREG(b64);
		else
			return res;
		
		return res;
	}

	private static final byte[] decodeURL(final String data) {
		try {
			return Base64.getUrlDecoder().decode(data);
		}catch(final Throwable t) {
			return null;
		}
	}
	
	private static final byte[] decodeMIME(final String data) {
		try {
			return Base64.getMimeDecoder().decode(data);
		}catch(final Throwable t) {
			return null;
		}
	}
	
	private static final byte[] decodeREG(final String data) {
		try {
			return Base64.getDecoder().decode(data);
		}catch(final Throwable t) {
			return null;
		}
	}
}
