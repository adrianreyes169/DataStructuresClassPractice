package Labs.Lab1;

public class VectorComponentWrapper {
	
	public static interface BaseVector {
		public double getXComponent();
		public double getYComponent();
		public void setX(double x);
		public void setY(double y);
		public double getMagnitude();
		public double getAngle();
		public BaseVector add(BaseVector V);
		public BaseVector subtract(BaseVector V);
		public double dotProduct(BaseVector V);
		public BaseVector crossProduct(BaseVector V);
	}
	
	public static class VectorComponent implements BaseVector {
		
		private double X;
		private double Y;
		
		/**
		 * Constructor for the VectorComponent class.
		 * @param X - (double) Represents the X component of the Vector being initialized
		 * @param Y - (double) Represents the Y component of the Vector being initialized
		 */
		public VectorComponent(double X, double Y) {
			/*TODO ADD YOUR CODE HERE*/
			this.X = X;
			this.Y = Y;
		}


		/**
		 * Returns the X component of the Vector
		 */
		@Override
		public double getXComponent() {
			/*TODO ADD YOUR CODE HERE*/
			return this.X; //Dummy Return
		}

		/**
		 * Returns the Y component of the Vector
		 */
		@Override
		public double getYComponent() {
			/*TODO ADD YOUR CODE HERE*/
			return this.Y; //Dummy Return
		}

		/**
		 * Sets the X component of the Vector
		 * @param x - (double) value to assign to the X component.
		 */
		public void setX(double x) {
			/*TODO ADD YOUR CODE HERE*/
			this.X = x;
		}

		/**
		 * Sets the Y component of the Vector
		 * @param y - (double) value to assign to the Y component.
		 */
		public void setY(double y) {
			/*TODO ADD YOUR CODE HERE*/
			this.Y = y;
		}

		/**
		 * Applies vector addition using this instance and BaseVector V and returns a new BaseVector
		 * with the result of the addition.
		 * @param V - (BaseVector) The vector instance to add to the current instance.
		 * @return the vector resulting from the addition
		 */
		@Override
		public BaseVector add(BaseVector V) {
			/*TODO ADD YOUR CODE HERE*/
			double addX = this.X + V.getXComponent();
			double addY = this.Y + V.getYComponent();
			
			BaseVector resultVector = new VectorComponent(addX, addY);
			
			return resultVector;
		}

		/**
		 * Applies vector subtraction using this instance and BaseVector V and returns a new BaseVector 
		 * with the result of the subtraction.
		 * @param V - (BaseVector) The vector instance to subtract to the current instance.
		 * @return the vector resulting from the subtraction
		 */
		@Override
		public BaseVector subtract(BaseVector V) {
			/*TODO ADD YOUR CODE HERE*/
			double subX = this.X - V.getXComponent();
			double subY = this.Y -V.getYComponent();
			
			BaseVector resultVector = new VectorComponent(subX,subY);
			
			return resultVector;
		}

		/**
		 * Applies dot product using this instance and BaseVector V and returns the result.
		 * @param V - (BaseVector) The vector instance to apply dot product with the current instance.
		 * @return result of the dot product
		 */
		@Override
		public double dotProduct(BaseVector V) {
			/*TODO ADD YOUR CODE HERE*/
			return (this.X * V.getXComponent() + (this.Y * V.getYComponent()));
		}

		/**
		 * Applies cross product using this instance and BaseVector V and returns the resulting BaseVector.
		 * @param V - (BaseVector) The vector instance to apply dot product with the current instance.
		 * @return result of the cross product
		 */
		@Override
		public BaseVector crossProduct(BaseVector V) {
			/*
			 * TODO ADD YOUR CODE HERE
			 * 
			 * NOTE:
			 * Can you do a cross product of 2D vectors?
			 * If not, what should we do?
			 * 
			 * Hint: Look up what UnsupportedOperationException does!
			 */
			throw new UnsupportedOperationException("Cross Product not defined for 2D vectors");
		}


		/**
		 * Returns the magnitude of the current vector instance.
		 */
		@Override
		public double getMagnitude() {
			/*TODO ADD YOUR CODE HERE*/
			return Math.sqrt(Math.pow(this.X, 2) + Math.pow(this.Y, 2));
		}
		
		/**
		 * Returns the angle of the current vector instance in degrees.
		 */
		@Override
		public double getAngle() {
			/*TODO ADD YOUR CODE HERE
			 *
			 * NOTE:
			 * Make sure to check that your operations returns degrees.
			 * If not, how can we convert it?
			 */
			double radianResult = Math.atan2(this.Y, this.X);
			double angleResult = Math.toDegrees(radianResult);
			
			return angleResult;
		}	
	}	
}
