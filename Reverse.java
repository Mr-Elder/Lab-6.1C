/**
 * @(#)Reverse.java
 *
 *
 * @author 
 * @version 1.00 2014/5/30
 */


public class Reverse {

    int[] numbers;
    
    public Reverse(int count){
    	numbers = new int[count];
    }
    
    public void fillArray(){
    	for(int i = 0; i < numbers.length; i++){
    		numbers[i] = GetInfo.getInt("Enter number for index : " + i);
    	}
    }
    
    public void reverseArray(){
    	
    	String array = "";
    	
    	for(int i = 0; i < numbers.length; i++){
    		array += numbers[i] + ";";
    	}
    	
    	int j = array.split(";").length-1;
    	for(int i = 0; i < array.split(";").length; i++){
    		numbers[i] = Integer.valueOf(array.split(";")[j]);
    		j--;
    	}
    }
    
    public void printArray(){
    	String message = "";
    	
    	for(int i = 0; i < numbers.length; i++){
    		message += numbers[i] + ", ";
    	}
    	
    	GetInfo.showMessage(message);
    }
    
}