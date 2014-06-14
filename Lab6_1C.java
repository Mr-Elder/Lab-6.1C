/**
 * @(#)Lab6_1C.java
 *
 *
 * @author 
 * @version 1.00 2014/5/30
 */


public class Lab6_1C {

    public static void main(String[] args){
    	Reverse rev = new Reverse(GetInfo.getInt("How many indices?"));
    	
    	rev.fillArray();
    	
    	rev.printArray();
    	rev.reverseArray();
    	rev.printArray();
    }
    
    
}