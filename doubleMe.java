package com.stephonlawson.doubleMe;

public class doubleMe {

	public static void main(String[] args) {
	 
        
		// assign a value to the variables 
	
		int num1 = 25;
		int num2 = 5; 
        	 
		// invoke the "doubleMe" method with one integer within the parameter  
		  doubleMe(num1); 
		  
		// invoke the "quadrupleMe" method with one integer within the parameter  
		  quadrupleMe(num1);
		  
		  // invoke the "raiseMe" method with one integer but raised 
	      // raiseMe(num1, num2);
		  
	}
	
	
	

	private static void doubleMe(int num1) {
		System.out.println("Initial Integer:");
		// print out the result of the number at the beginning 
		System.out.println(num1);
		
		System.out.println("Result:");
		// double the integer defined within the parameter 
		System.out.println(num1*2); 
		
	}
		
	    private static void quadrupleMe(int num1) { 
    	     
	    	   System.out.println("Quadrupled Result:"); 
	    	//print out the result of the initial integer "quadrupled"
	    	   System.out.println(num1*4);
    	     
	
	    }
  
	    
	      //( Stretch Goal #2)
//	    private static void raiseMe(int num1, int num2) {
//			
//			System.out.println(num1*num2);
//		}

}

