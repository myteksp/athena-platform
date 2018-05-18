package com.athena.backend.platform.utils;

public final class RandomUtil {
	public static final double[] getDistributionAround(final double seed, final double percentOfSeed, final int size) {
		final double range = seed * percentOfSeed;
		final double[] res = new double[size];
		for (int i = 0; i < res.length; i++) {
			final boolean negative = Math.random() >= 0.5;
			final double delta = Math.random() * range;
			if (negative) {
				res[i] = seed - delta;
			}else {
				res[i] = seed + delta;
			}
		}
		return res;
	}
	
	public static final double random(final double min, final double max) {
		return min + (Math.random() * (max - min));
	}
}
