package Labs.Lab1;

public class ArithmeticWrapper {
	
	private static class Arithmetic{
		/*TODO ADD THE FOLLOWING:
		 * PRIVATE FIELDS, 
		 * CONSTRUCTOR, 
		 * GETTERS, 
		 * SETTERS, 
		 * MEMBER METHODS
		 */
		
		private int a;
		private int b;
		
		public Arithmetic(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public int getA() {return this.a;}
		public int getB() {return this.b;}
		
		public void setA(int a) {this.a = a;} 
		public void setB(int b) {this.b = b;}
		
		public int add() {return this.a + this.b;}
		public int subtract() {return this.a - this.b;}
		public int multiply() {return this.a * this.b;}
		public double divide() {return this.a / this.b;}
		
		
	}
	
	public static class Calculator extends Arithmetic /*TODO What is missing here?*/{

		/*TODO ADD CONSTRUCTOR HERE*/
		
		public Calculator(int a, int b) {
			super(a,b);
		}
		
	}
	
}
