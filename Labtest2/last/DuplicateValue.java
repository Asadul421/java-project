package Labtest2.last;

public class DuplicateValue {

	public static void main(String[] args) {
		//convert to array
		 String[] arr = {"dog", "cat", "tiger", "dog", "tiger", "dog", "Lion"};//dog-1,cat-2,tiger-,dog-4...........
		 
	        for (int i = 0; i < arr.length-1; i++)//i=0
	        {
	         for (int j = i+1; j < arr.length; j++)//j=1
	        
	            {
	                if( (arr[i].equals(arr[j])) && (i != j) )//i!=j is true so not print
	            
	                {
	                    System.out.println("Duplicate Element is : "+arr[j]);
	                }
	            }
	        }
	    }    
	}
	
		
	


                
            
        
        
	


