package exception;

public class Multiple_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		  try
		  {    
              int a[]=new int[5];    
            // a[5]=30/0;   
              //System.out.println(a[10]);
              String s=null;  
              System.out.println(s.length()); 
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs"+e);  
                }    
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs"+e);  
                }             
             System.out.println("rest of the code");   
	}

}
