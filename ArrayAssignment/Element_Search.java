package ArrayAssignment;

public class Element_Search {

	public static void main(String[] args) {
		
		int i,flag = 0;
     
		int arr[]= {80,50,40,10,30,75};
		
		System.out.println(arr.length);
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.println("Elements in array are : "+arr[k]);
		}
		
		int search=10;
	
		System.out.println("Element to be searched is : "+search);
		
        for(i = 0; i<search; i++)
        {
            if(arr[i] == search)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at index position:"+i);
        }
        else
        {
            System.out.println("Element not found");
        }
	}

}
