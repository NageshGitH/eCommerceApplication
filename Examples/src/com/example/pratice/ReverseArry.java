package com.example.pratice;

public class ReverseArry 
{
  public static void main(String args[])
  {
	  int arr[] = {1, 2, 3, 4, 5, 6};
	  
	  reverseString(arr,0,5);
	  
	  for (int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");
       
      System.out.println();
 }
	  
  public static void  reverseString(int arr[],int start,int end)
  {
	  int temp;
	  while(start < end)
	  {
		  temp = arr[start];
		  arr[start] = arr[end];
		  arr[end] = temp;
		  start++;
		  end--;
	  }
  }
}
