
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	public int add (int a, int b) {
		return a + b;
		}
	
	public int subtract (int a , int b ) {
		return a - b;
		}
	  
	public int multiply (int a , int b) {
	    return a * b;
	    }
	
	public int divide (int a , int b) {
	    if(b == 0) {
	      throw new IllegalArgumentException("Divison by zero is not supported");
	    }
	    return a/b;
	  }


}
