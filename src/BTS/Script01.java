package BTS;

import org.testng.annotations.Test;

public class Script01 
{
	@Test
public void bubble (){
	int []arr= {10,20,30,11,2};
	int no= arr.length;
	for (int j= 0; j < no-1; j++)
	{
	for (int i = 0; i <no-1; i++)
	{
	if(arr[i]>arr[i+1])
	{
	int	temp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
	}
	}	
	}
	for (int k = 0; k <no; k++)
	{
	System.out.println(arr[k]+" ");	
	}
	
}
}
