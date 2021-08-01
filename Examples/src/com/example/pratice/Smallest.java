package com.example.pratice;

public class Smallest {

	public static void main(String[] args) 
	{

		int arr[] = {12, 13, 1, 10, 34, 1};
        print2Smallest(arr);
        
        int arrAsc[] = {7, 5, 1, 3, 4, 6};
        
        boolean flag = true;
        
        for(int i=0;i<arrAsc.length-1;i++)
        {
        	int iMin =i;
        	for(int j=i+1;j<arrAsc.length;j++)
        	{	
	        	if(arrAsc[j] < arrAsc[iMin])
	        	{
	        		iMin = j;
	        		 
	        	}
        	}
        	
        	int temp = arrAsc[i];
        	arrAsc[i] = arrAsc[iMin];
        	arrAsc[iMin] = temp;
        }
        for(int k=0;k<arrAsc.length;k++)
        		{
        		 System.out.println(arrAsc[k]);
        		}

	}
	
	
	
	
	static void print2Smallest(int arr[])
    {
        int first, second, arr_size = arr.length;
 
        /* There should be atleast two elements */
        if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }
 
        System.out.println("Integer.MAX_VALUE::: "+Integer.MAX_VALUE);
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            /* If current element is smaller than first
              then update both first and second */
        	
        	System.out.println("first:::"+first);
        	
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and second
               then update second  */
            else if (arr[i] > first && arr[i] < second )
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                               "smallest element");
        else
            System.out.println("The smallest element is " +
                               first + " and second Smallest" +
                               " element is " + second);
    }

}
