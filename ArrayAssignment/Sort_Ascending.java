package ArrayAssignment;

public class Sort_Ascending {

	public static void main(String[] args) {
		
		int asc[] =  {10,-50,85,-74,63,0};     
        int temp = 0;    
  
    System.out.println("Original array is : ");    
       for (int i = 0; i <asc.length; i++) {     
           System.out.print(asc[i] + " ");    
        }    

 
        for (int i = 0; i <asc.length; i++) {     
          for (int j = i+1; j <asc.length; j++) {     
              if(asc[i] >asc[j]) 
              {      
                 temp = asc[i];    
                 asc[i] = asc[j];    
                 asc[j] = temp;    
               }     
            }     
        }    


        System.out.println("\n Array sorted in ascending order: ");    
        for (int i = 0; i <asc.length; i++) {     
            System.out.print(asc[i] + " ");    
        }    

	}

}
