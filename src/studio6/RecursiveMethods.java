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
		
			// FIXME compute the geometric sum for the first n terms recursively
			if(n == 0) {		//must ensure that we always reach this base case (ex: n-1)
				return 0;
			} else {
				return Math.pow(0.5, n) + geometricSum(n - 1);
			}	
		
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
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		if (radius < radiusMinimumDrawingThreshold) {
			return; 
		}
		StdDraw.circle(xCenter,yCenter,radius); 	
		
		circlesUponCircles(xCenter + radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter - radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter + radius, radius/3, radiusMinimumDrawingThreshold);
		circlesUponCircles(xCenter, yCenter - radius, radius/3, radiusMinimumDrawingThreshold);
		
	
		// FIXME complete the recursive drawing
		
		
		 //i dont want to do this at all
		

	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
			return new int[0];
	}
	
	public static int[] toReversedHelper(int[] array) {		
		int[] reversed = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= array.length) { //base case
				return 0;
		} else {
			int odds = countOddHelper(values, index + 1); //recursive step
			if(values[index] % 2 != 0) {
				odds++;
			}
			return odds;
		}
			
//			int[] reversed = new int[array.length];
//			if (array.length > 0) {
//				int lastIndex = array.length - 1;
//				for (int index = 0; index <= array.length / 2; ++index) {
//					int mirrorIndex = lastIndex - index;
//					// note:
//					// since we read from array and write to reversed
//					// we do not need to use a temp variable
//					reversed[index] = array[mirrorIndex];
//					reversed[mirrorIndex] = array[index];
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
