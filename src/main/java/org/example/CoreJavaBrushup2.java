package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		//to find if the below numbers are multiple of 2 or not
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i< arr2.length; i++)
		{
			if(arr2[i] %2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] + "is not a multiple of 2");
			}
		}
		
		//Arraylist
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		System.out.println(a.get(3));
		
		for(String val :a)
		{
			System.out.println(val);
		}
		
		//items present in arraylist
		System.out.println(a.contains("Rahul"));
		String [] name = {"rahul","shetty","selenium"};
		//List<String> nameArrayList = Arrays.asList(name);
		//nameArrayList.contains("selenium");
	}

}
