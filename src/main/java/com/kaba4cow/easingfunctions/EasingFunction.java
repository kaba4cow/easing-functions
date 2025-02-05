package com.kaba4cow.easingfunctions;

/**
 * Interface for representing an easing function. This interface provides the {@link #apply(double)} method that applies the
 * easing function to a normalized time value {@code t} (ranging from {@code 0.0} to {@code 1.0}), and the
 * {@link #interpolate(double, double, double)} method for interpolating between two values using the easing function.
 */
public interface EasingFunction {

	/**
	 * Applies the easing function to the given time value {@code t}.
	 * 
	 * @param t a normalized time value between {@code 0.0} and {@code 1.0}
	 * 
	 * @return the eased value
	 */
	double apply(double t);

	/**
	 * Performs interpolation between {@code a} and {@code b} values using this easing function.
	 * 
	 * @param a the starting value
	 * @param b the ending value
	 * @param t a normalized time value between {@code 0.0} and {@code 1.0}
	 * 
	 * @return the interpolated value between {@code a} and {@code b}
	 */
	default double interpolate(double a, double b, double t) {
		return a + (b - a) * apply(t);
	}

}
