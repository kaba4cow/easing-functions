package com.kaba4cow.easingfunctions;

/**
 * Provides a collection of easing functions commonly used in animations and interpolations. Easing functions determine the rate
 * of change of a parameter over time, adding a natural, smooth feel to animations.
 * 
 * @see <a href="https://easings.net">easings.net</a>
 */
public enum Easing {

	/**
	 * Linear easing function.
	 */
	LINEAR {

		@Override
		public double apply(double t) {
			return t;
		}

	},
	/**
	 * Sine-in easing function.
	 */
	SINE_IN {

		@Override
		public double apply(double t) {
			return 1.0 - Math.cos(t * PI_DIV_2);
		}

	},
	/**
	 * Sine-out easing function.
	 */
	SINE_OUT {

		@Override
		public double apply(double t) {
			return Math.sin(t * PI_DIV_2);
		}

	},
	/**
	 * Sine-in-out easing function.
	 */
	SINE_IN_OUT {

		@Override
		public double apply(double t) {
			return -0.5 * (Math.cos(PI * t) - 1.0);
		}

	},
	/**
	 * Quad-in easing function.
	 */
	QUAD_IN {

		@Override
		public double apply(double t) {
			return t * t;
		}

	},
	/**
	 * Quad-out easing function.
	 */
	QUAD_OUT {

		@Override
		public double apply(double t) {
			return 1.0 - (1.0 - t) * (1.0 - t);
		}

	},
	/**
	 * Quad-in-out easing function.
	 */
	QUAD_IN_OUT {

		@Override
		public double apply(double t) {
			if (t < 0.5)
				return 2.0 * t * t;
			else
				return 1.0 - 0.5 * Math.pow(-2.0 * t + 2.0, 2.0);
		}

	},
	/**
	 * Cubic-in easing function.
	 */
	CUBIC_IN {

		@Override
		public double apply(double t) {
			return t * t * t;
		}

	},
	/**
	 * Cubic-out easing function.
	 */
	CUBIC_OUT {

		@Override
		public double apply(double t) {
			return 1.0 - Math.pow(1.0 - t, 3.0);
		}

	},
	/**
	 * Cubic-in-out easing function.
	 */
	CUBIC_IN_OUT {

		@Override
		public double apply(double t) {
			if (t < 0.5)
				return 4.0 * t * t * t;
			else
				return 1.0 - 0.5 * Math.pow(-2.0 * t + 2.0, 3.0);
		}

	},
	/**
	 * Quart-in easing function.
	 */
	QUART_IN {

		@Override
		public double apply(double t) {
			return t * t * t * t;
		}

	},
	/**
	 * Quart-out easing function.
	 */
	QUART_OUT {

		@Override
		public double apply(double t) {
			return 1.0 - Math.pow(1.0 - t, 4.0);
		}

	},
	/**
	 * Quart-in-out easing function.
	 */
	QUART_IN_OUT {

		@Override
		public double apply(double t) {
			if (t < 0.5)
				return 8.0 * t * t * t * t;
			else
				return 1.0 - 0.5 * Math.pow(-2.0 * t + 2.0, 4.0);
		}

	},
	/**
	 * Quint-in easing function.
	 */
	QUINT_IN {

		@Override
		public double apply(double t) {
			return t * t * t * t * t;
		}

	},
	/**
	 * Quint-out easing function.
	 */
	QUINT_OUT {

		@Override
		public double apply(double t) {
			return 1.0 - Math.pow(1.0 - t, 5.0);
		}

	},
	/**
	 * Quint-in-out easing function.
	 */
	QUINT_IN_OUT {

		@Override
		public double apply(double t) {
			if (t < 0.5)
				return 16.0 * t * t * t * t * t;
			else
				return 1.0 - 0.5 * Math.pow(-2.0 * t + 2.0, 5.0);
		}

	},
	/**
	 * Expo-in easing function.
	 */
	EXPO_IN {

		@Override
		public double apply(double t) {
			if (t == 0.0)
				return 0.0;
			else
				return Math.pow(2.0, 10.0 * t - 10.0);
		}

	},
	/**
	 * Expo-out easing function.
	 */
	EXPO_OUT {

		@Override
		public double apply(double t) {
			if (t == 1.0)
				return 1.0;
			else
				return 1.0 - Math.pow(2.0, -10.0 * t);
		}

	},
	/**
	 * Expo-in-out easing function.
	 */
	EXPO_IN_OUT {

		@Override
		public double apply(double t) {
			if (t == 0.0)
				return 0.0;
			else if (t == 1.0)
				return 1.0;
			else if (t < 0.5)
				return 0.5 * Math.pow(2.0, 20.0 * t - 10.0);
			else
				return 0.5 * (2.0 - Math.pow(2.0, -20.0 * t + 10.0));
		}

	},
	/**
	 * Circ-in easing function.
	 */
	CIRC_IN {

		@Override
		public double apply(double t) {
			return 1.0 - Math.sqrt(1.0 - Math.pow(t, 2.0));
		}

	},
	/**
	 * Circ-out easing function.
	 */
	CIRC_OUT {

		@Override
		public double apply(double t) {
			return Math.sqrt(1.0 - Math.pow(t - 1.0, 2.0));
		}

	},
	/**
	 * Circ-in-out easing function.
	 */
	CIRC_IN_OUT {

		@Override
		public double apply(double t) {
			if (t < 0.5)
				return 0.5 * (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * t, 2.0)));
			else
				return 0.5 * (1.0 + Math.sqrt(1.0 - Math.pow(-2.0 * t + 2.0, 2.0)));
		}

	},
	/**
	 * Back-in easing function.
	 */
	BACK_IN {

		@Override
		public double apply(double t) {
			double c1 = 1.70158;
			double c3 = c1 + 1.0;
			return c3 * t * t * t - c1 * t * t;
		}

	},
	/**
	 * Back-out easing function.
	 */
	BACK_OUT {

		@Override
		public double apply(double t) {
			double c1 = 1.70158;
			double c3 = c1 + 1.0;
			return 1.0 + c3 * Math.pow(t - 1.0, 3.0) + c1 * Math.pow(t - 1.0, 2.0);
		}

	},
	/**
	 * Back-in-out easing function.
	 */
	BACK_IN_OUT {

		@Override
		public double apply(double t) {
			double c2 = 1.70158 * 1.525;
			if (t < 0.5)
				return 0.5 * (Math.pow(2.0 * t, 2.0) * ((c2 + 1.0) * 2.0 * t - c2));
			else
				return 0.5 * (Math.pow(2.0 * t - 2.0, 2.0) * ((c2 + 1.0) * (t * 2.0 - 2.0) + c2) + 2.0);
		}

	},
	/**
	 * Elastic-in easing function.
	 */
	ELASTIC_IN {

		@Override
		public double apply(double t) {
			if (t == 0.0)
				return 0.0;
			else if (t == 1.0)
				return 1.0;
			else
				return -Math.pow(2.0, 10.0 * t - 10.0) * Math.sin((10.0 * t - 10.75) * TWO_PI_DIV_3);
		}

	},
	/**
	 * Elastic-out easing function.
	 */
	ELASTIC_OUT {

		@Override
		public double apply(double t) {
			if (t == 0.0)
				return 0.0;
			else if (t == 1.0)
				return 1.0;
			else
				return Math.pow(2.0, -10.0 * t) * Math.sin((10.0 * t - 0.75) * TWO_PI_DIV_3) + 1.0;
		}

	},
	/**
	 * Elastic-in-out easing function.
	 */
	ELASTIC_IN_OUT {

		@Override
		public double apply(double t) {
			if (t == 0.0)
				return 0.0;
			else if (t == 1.0)
				return 1.0;
			else if (t < 0.5)
				return -0.5 * Math.pow(2.0, 20.0 * t - 10.0) * Math.sin((20.0 * t - 11.125) * TWO_PI_DIV_45);
			else
				return 0.5 * Math.pow(2.0, -20.0 * t + 10.0) * Math.sin((20.0 * t - 11.125) * TWO_PI_DIV_45) + 1.0;
		}

	},
	/**
	 * Bounce-in easing function.
	 */
	BOUNCE_IN {

		@Override
		public double apply(double t) {
			return 1.0 - BOUNCE_OUT.apply(1.0 - t);
		}

	},
	/**
	 * Bounce-out easing function.
	 */
	BOUNCE_OUT {

		@Override
		public double apply(double t) {
			double n1 = 7.5625;
			double d1 = 2.75;
			if (t < 1.0 / d1)
				return n1 * t * t;
			else if (t < 2.0 / d1)
				return n1 * (t -= 1.5 / d1) * t + 0.75;
			else if (t < 2.5 / d1)
				return n1 * (t -= 2.25 / d1) * t + 0.9375;
			else
				return n1 * (t -= 2.625 / d1) * t + 0.984375;
		}

	},
	/**
	 * Bounce-in-out easing function.
	 */
	BOUNCE_IN_OUT {

		@Override
		public double apply(double t) {
			if (t < 0.5)
				return 0.5 * (1.0 - BOUNCE_OUT.apply(1.0 - 2.0 * t));
			else
				return 0.5 * (1.0 + BOUNCE_OUT.apply(2.0 * t - 1.0));
		}

	};

	private static final double PI = Math.PI;
	private static final double PI_DIV_2 = PI / 2.0;
	private static final double TWO_PI_DIV_3 = 2.0 * PI / 3.0;
	private static final double TWO_PI_DIV_45 = 2.0 * PI / 4.5;

	/**
	 * Applies the easing function to the given time value {@code t}.
	 * 
	 * @param t a normalized time value between {@code 0.0} and {@code 1.0}
	 * 
	 * @return The eased value
	 */
	public abstract double apply(double t);

}