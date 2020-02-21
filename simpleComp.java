package compInt;

import java.io.*;

public class simpleComp {
	
	 static float simple(float p,float r,float t) 
    { 
  
        float SI = (p * t * r) / 100; 
        return SI;
    }  
	 
	 static double simple(double p,double r,double t) 
	    { 
		  
	        double CI = p * 
	                    (Math.pow((1 + r / 100), t)); 
	  
	        return CI;
	    }  
        

}
