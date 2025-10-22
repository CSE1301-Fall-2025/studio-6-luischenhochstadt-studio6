package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n == 0) {
			return 0;
		} else {
			return (1 / Math.pow(2, n) + geometricSum(n - 1));
		}

		// FIXME compute the geometric sum for the first n terms recursively
		// geometricSum(3)
		// 1/2^3 + geometricSum(2)
		// gS(2) = 1/2^2 + gS(1)
		// gS(1) = 1/2 + gs(0)
		// gS(0) = 0

	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius < radiusMinimumDrawingThreshold) {
			return;
		} else {
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter, yCenter + radius, radius / 3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter - radius, radius / 3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter + radius, yCenter, radius / 3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter - radius, yCenter, radius / 3, radiusMinimumDrawingThreshold);

		}

		// FIXME complete the recursive drawing
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {

		// FIXME create a helper method that can recursively reverse the given array
		if (array.length == 0) {
			return new int[0];
		}
		int[] reversedArray = new int[array.length];
		// copy in values from the original array
		return helper(reversedArray, 0);

	}

	public static int[] helper(int[] reversedArray, int i) {
		int midpoint = reversedArray.length / 2;// base case
		if (i > midpoint) {
			return reversedArray;
		} else {
			int temp = reversedArray[i];
			reversedArray[i] = reversedArray[reversedArray.length - 1 - i];
			reversedArray[reversedArray.length - 1 - i] = temp;
			return reversedArray;
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {

		// FIXME compute the gcd of p and q using recursion
		return 0;

	}

}