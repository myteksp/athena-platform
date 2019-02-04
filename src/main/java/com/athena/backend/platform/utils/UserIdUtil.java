package com.athena.backend.platform.utils;

import com.gf.util.string.MacroCompiler;

public final class UserIdUtil {
	public static final String wrap(final String id) {
		if (id == null)
			return null;
		return MacroCompiler.compileInline("[[${0}]]", id.trim());
	}

	public static final String unwrap(final String id) {
		if (id == null)
			return null;
		final String trimed = id.trim();
		if (trimed.startsWith("[[") && trimed.endsWith("]]")) 
			return trimed.substring(2, trimed.length() - 2);
		else 
			return trimed;
	}
}
